package chap8;
/*
 * 추상클래스 간의 상속 가능.
 *   부모 추상클래스의 추상메서드를 자손 추상클래스에서 오버라이딩 안해도 됨
 */

abstract class Abs1 {
	int a = 10;
	abstract int getA();  //추상메서드
}

abstract class Abs2 extends Abs1 {  //getA() 오버라이딩 하지 않아도 됨.
	int b = 20;
	abstract int getB();
}

class Normal extends Abs2 {  //Abs1, Abs2 에 있는 추상메서드 모두 오버라이딩 해야함.
	@Override
	int getB() {
		return b;
	}
	@Override
	int getA() {
		return a;
	}
}

public class AbstractEx1 {
	public static void main(String[] args) {
		Normal n= new Normal();
		System.out.println(n.a);
		System.out.println(n.getA());
		System.out.println(n.b);
		System.out.println(n.getB());
		Abs2 a2 = n;
		System.out.println(a2.a);
		System.out.println(a2.getA()); // 객체에 최종 오버라이딩 된 메서드가 호출됨
		System.out.println(a2.b);
		System.out.println(a2.getB());
		Abs1 a1 = n;
		System.out.println(a1.a);
		System.out.println(a1.getA()); // 객체에 최종 오버라이딩 된 메서드가 호출됨
		//System.out.println(a1.b);      // error 부모->자손클래스에 접근할 수 없음 : Abs1의 멤버가 아님
		//System.out.println(a1.getB()); // error 부모->자손클래스에 접근할 수 없음 : Abs1의 멤버가 아님
		Object o=n; 
		//System.out.println(o.a); //error :참조는 가능하나 사용할 수 있는 멤버는 없음.
		
		//추상클래스는 객체화 불가
		//a1 = new Abs2(); //error
		
	}

}
