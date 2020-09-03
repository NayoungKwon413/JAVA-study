package chap8;
/*
 * 다형성 예제
 * 
 *   자손타입의 객체는 부모타입의 참조변수로 참조가 가능하다.
 *   부모타입의 참조변수로 참조하는 경우, 부모타입의 멤버만 접근 가능하다.
 *   모든 클래스는 Object 클래스의 하위클래스이므로 모든 클래스의 객체는 Object 타입으로 참조가 가능함.
 *   
 */
class Bike2 {
	int wheel;
	Bike2(int wheel) {
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("움직인다");
	}
	void stop() {
		System.out.println("멈춘다");
	}
}
class AutoBike2 extends Bike2 {
	boolean power;
	AutoBike2(int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
		if(power) System.out.println("전원이 켜졌습니다.");
		else System.out.println("전원이 꺼졌습니다.");
	}
} 

public class BikeEx2 {

	public static void main(String[] args) {
		AutoBike2 auto1 = new AutoBike2(2);
		Object obj =auto1;
		Bike2 bike;
		auto1.power();
		auto1.drive();
		System.out.println("바퀴"+ auto1.wheel + "개가 굴러 간다.");
		auto1.stop();
		bike = auto1;  //bike = (Bike2)(auto1); : (Bike) 연산자 생략가능 -> 다형성
		bike.drive();
		System.out.println("바퀴" + bike.wheel + "개가 굴러 간다.");
		bike.stop();
		((AutoBike2)bike).power();  //error
		AutoBike2 auto2 = (AutoBike2)(bike);  //형변환 연산자 생략불가

	}

}
