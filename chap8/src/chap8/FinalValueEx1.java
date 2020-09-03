package chap8;
/*
 * final 변수 : 변경 불가 변수 => 상수
 * 
 * final 변수도 생성자에서 한 번은 값을 변경할 수 있다. => 객체별로 다른 상수 값을 가질 수 있도록 하기 위함.
 *   => 단, 명시적 초기화가 안된 경우만 가능함. 명시적 초기화가 된 경우에는 생성자에서도 초기화 안됨.
 */

class FinalValue {
	final int NUM;
	FinalValue(int num) {
		NUM = num;
	}
	public int getNUM() {
		return NUM;
	}
}

public class FinalValueEx1 {
	public static void main(String[] args) {
		FinalValue f1 = new FinalValue(10);
		System.out.println(f1.getNUM());  //10
//		f1.NUM = 100; //error "상수"
		FinalValue f2 = new FinalValue(20);
		System.out.println(f2.getNUM());  //20
		FinalValue f3 = new FinalValue(30);
		System.out.println(f3.getNUM());  //30
	}

}
