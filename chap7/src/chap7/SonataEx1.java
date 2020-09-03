package chap7;
/*
 * 클래스 변수, 인스턴스 변수 예제
 * 
 * 선언 위치에 따른 변수의 종류
 *             선언 위치     선언 방법                 메모리할당시기                             메모리할당위치
 * 클래스변수    : 클래스 내부  static int cv;  클래스 정보 로드 시                         클래스 영역
 *          => 객체화와 관련없는 변수. 모든 객체의 공통변수로 사용됨. 
 *          => 클래스명.변수명 의 형태로 사용됨.
 * 인스턴스변수  : 클래스 내부 int iv;         객체화 시                                      힙 영역
 *          => 반드시 객체화되어야 사용 가능. 
 *          => 참조변수명.변수명 의 형태로 사용됨.
 * 지역변수       : 메서드 내부 int lv;         메서드가 실행되어 선언문이 실행될 때     스택 영역
 *          => 변수명 의 형태로 사용됨.
 *          => 반드시 초기화 되어야함. 
 *          => 매개변수도 지역변수임.(스택영역에 호출된 순간 메모리 할당됨)
 */
class Sonata {
	String color;  //인스턴스변수, 객체변수
	int number;  //인스턴스변수, 객체변수
	static int width = 250;  //클래스 변수
	static int height = 150; //클래스 변수
	public String toString() {
		return color + ":" + number + "(" + width + "," + height +")";
	}
}

public class SonataEx1 {

	public static void main(String[] args) {
		System.out.println("자동차 크기:" + Sonata.width + "," + Sonata.height);
		//System.out.println(Sonata.color);
		Sonata car1 = new Sonata();
		car1.color = "White";
		car1.number = 1234;
		System.out.println("car1:" + car1);
		Sonata car2 = new Sonata();
		car2.color = "Black";
		car2.number = 2345;
		System.out.println("car2:" + car2);
		car1.width = 300;
		car1.height = 200;
		System.out.println("car1:" + car1);
		System.out.println("car2:" + car2);

	}

}
