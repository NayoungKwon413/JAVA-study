package chap10;
/*
 * 내부 클래스 예제
 * 
 *    static 내부 클래스 : 클래스 내부에 선언됨. 클래스 멤버를 가질 수 있다.
 *    인스턴스 내부 클래스 : 클래스 내부에 선언됨. 클래스 멤버를 가질 수 없다. 상수는 가능
 *    지역 내부 클래스 : 메서드 내에서 선언된 클래스
 *    
 * 내부 클래스 특징
 *   1. 클래스 내부에 존재하는 클래스
 *   2. 자료형으로 사용됨. 객체화 가능. Object 클래스의 하위 클래스임. 인터페이스 구현 가능. 바이트코드도 생성됨.
 *      멤버(변수, 메서드, 생성자)를 소유할 수 있음. 
 *   3. 외부 클래스의 멤버임. => 외부 클래스의 private 멤버에 접근 가능
 *                      => static 내부 클래스 : 객체화하지 않고 new 외부클래스명.내부클래스명(); 으로 객체 생성 가능.
 *                      => 인스턴스 내부 클래스 : 외부클래스객체의 참조변수.new 내부클래스명(); 형태로 객체 생성 가능.
 */
class Outer1{
	static class StaticInner {  //static 내부 클래스 : 인스턴스 멤버, static(클래스) 멤버, 상수 모두 가질 수 있음.
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	class InstanceInner {  //인스턴스 내부 클래스 : static 멤버 가질 수 없음
		int iv= 100;
//		static int cv = 10;
		final static int MAX = 200;  //상수는 멤버 가능
	}
	void method() {
		class LocalInner {   //지역 내부 클래스 : static 멤버 가질 수 없음
			int iv = 600;
//			static int cv=700;
			final static int MAX = 700;
		}
		LocalInner lc = new LocalInner();
		System.out.println(lc.iv);
		System.out.println(lc.MAX);
	}
	void method2() {
//		LocalInner lc = new LocalInner(); //사용불가 LocalInner 클래스는 method()메서드 안에서만 사용가능
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		//Outer1 클래스의 method 메서드 호출하기
		Outer1 o = new Outer1();
		o.method();
		Outer1.StaticInner os = new Outer1.StaticInner(); //static 내부 클래스 객체화 -> 클래스 정보만 로드되면 객체화 됨
		System.out.println(os.iv);
		System.out.println(Outer1.StaticInner.cv);
		System.out.println(Outer1.StaticInner.MAX);
		
//		Outer1.InstanceInner oi = new Outer1.InstanceInner(); // X
		Outer1.InstanceInner oi = o.new InstanceInner();  //인스턴스 내부 클래스 객체화 -> 참조변수명.new 인스턴스내부클래스명
		System.out.println(oi.iv);
        System.out.println(Outer1.InstanceInner.MAX);
	}

}
