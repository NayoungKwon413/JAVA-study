package chap7;
/*
 * 생성자 예제
 * 
 * 생성자란?
 *   객체화 시 호출되는 메서드
 *   생성자 없이 객체의 생성은 불가능함.
 *    기능 : 인스턴스 변수의 초기화를 담당함.
 *    
 * 생성자의 구현 방법
 *   1. 생성자의 이름은 클래스명과 같다.
 *   2. 리턴타입이 없다. void 없다 -> 아예 기술하지 않는다.
 *   
 * 기본생성자
 *   클래스 내부에 생성자가 없으면, 컴파일러가 추가해주는 생성자
 *   public 클래스명() {}  : 기본생성자 형태
 */

class Number1 {  //생성자 만들지 않았기 때문에 기본생성자 제공
	int num;
}

class Number2 {  //내가 생성자를 만들었기 때문에 기본생성자 제공되지 않음
	int num;
	Number2(int x) {  //생성자
		num = x;
	}
}

public class ConstructorEx1 {

	public static void main(String[] args) {
		Number1 n1 = new Number1();
		/*
		 * new 예약어의 기능
		 * 1. 메모리 할당
		 * 2. 변수들을 기본값으로 초기화
		 *    숫자 : 0, 논리형: false, 문자열 등: null
		 * 3. 생성자 호출 -> Number1()
		 */
		n1.num = 10;
		Number2 n2 = new Number2(100); // Number2() :괄호안에 정수값이 들어가야 객체 생성이 가능함.
		System.out.println("Number1 클래스의 num = " + n1.num);
		System.out.println("Number2 클래스의 num = " + n2.num);

	}

}
