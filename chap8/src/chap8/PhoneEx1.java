package chap8;

/*
 * 상속 예제
 * 
 *   1. 자손 클래스의 객체 생성시 부모 객체를 먼저 생성함.
 *   2. 자손객체는 부모객체의 멤버 접근이 가능함.
 *   3. 클래스 간 상속은 단일 상속만 가능함.
 *      -> 자손클래스의 부모클래스는 한 개만 가능함(부모는 여러 자손을 둘 수 있음)
 *   4. 모든 클래스는 Object 클래스를 상속 받는다. 
 *      -> 모든 클래스의 객체는 Object객체를 포함한다. 
 *         모든 클래스의 객체는 Object객체의 멤버에 접근이 가능하다.
 */
class Phone {
	boolean power;
	int number;
	void power() {
		power = !power;
	}
	void send() {
		if(power)
			System.out.println("전화걸기");
	}
	void receive() {
		if(power)
			System.out.println("전화받기");
	}
}
class SmartPhone extends Phone {
	void setApp(String name) {
		System.out.println(name + "설치 중~~");
	}
}

public class PhoneEx1 {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("네이버");
		
	}

}
