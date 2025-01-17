package chap8;
/*
 * 바인딩 예제
 * 
 *   부모클래스의 멤버와 자손클래스의 멤버가 같은 경우
 *   멤버변수 : 참조변수의 자료형을 따른다. 부모타입의 참조변수로 참조할 때는 부모의 멤버가 호출되는 것을 알 수 있음.
 *   멤버 메서드 : 무조건 최종 오버라이딩 된 메서드가 호출된다.
 *             메서드 내부에서 사용되는 멤버 변수는 오버라이딩된 멤버 메서드 기준으로 처리된다. 
 */

class Bike3 {
	int wheel;
	int price=10;
	Bike3(int wheel) {
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("패달을 밟는다.");
	}
	void stop() {
		System.out.println("브레이크를 잡는다");
	}
}
class AutoBike3 extends Bike3 {
	boolean power;
	int price = 200;
	AutoBike3(int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
		if(power) System.out.println("전원 켜짐");
		else System.out.println("전원 꺼짐");
	}
	@Override
	void drive() {
		if(!power) power();
		System.out.println("출발버튼 누른다. 가격:" + this.price);
	}
	@Override
	void stop() {
		if(power) System.out.println("정지 버튼을 누른다. 가격:" + this.price);
		else System.out.println("전원이 꺼져 있습니다.");
	}
}
public class BikeEx3 {
	public static void main(String[] args) {
		AutoBike3 auto = new AutoBike3(2);
		System.out.println("가격은 " + auto.price + "입니다.");
		auto.drive();
		auto.stop();
		Bike3 bike = auto;
		System.out.println("가격은 " + bike.price + "입니다.");
		auto.drive();
		auto.stop();
	}

}
