package chap7;
/*
 * this 예약어 예제
 * 
 * this() 생성자 : 같은 클래스의 다른 생성자를 호출.
 *               다른 생성자 호출 시 생성자의 첫 줄에서 호출되어야 한다.
 * this 참조변수  : 자기 참조 변수. 자기 객체의 참조값을 저장하는 변수
 *               인스턴스 멤버를 참조할 때 사용됨.
 *               인스턴스 메서드의 지역변수로 자동 선언됨.
 */

class Car2 {
	String color;
	int number;
	Car2(String color, int number) {
		System.out.println("String int 생성자 호출");
		this.color = color;  // this 참조변수
		this.number = number;
	}
	Car2() {
		this("white", 1234);  //this 생성자는 반드시 첫 줄에서만 호출이 가능하다.
		System.out.println("() 생성자 호출");
	}
	Car2(String c) {
		this(c, 1234);  // => 생성자 중 매개변수 String int 인 생성자 호출
	}
	public String toString() {
		return color + "," + number;
	}
}

public class ThisEx1 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue", 1234);
		Car2 c3 = new Car2("red");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
