package chap10;
/*
 * 열거형 예제
 */
public class EnumEx1 {
	public enum Car {//사실상 내부클래스
		AVANTE, SONATA, GRANDURE,SM5
	}
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println("My Car : " + car);
		System.out.println("SONATA : " + Car.SONATA);
		car = Car.GRANDURE;
		if(car instanceof Object) {  //Car 클래스가 Object의 하위 클래스인가? (O)
			System.out.println(car.toString());
			System.out.println(car.getClass().getName());
		}
		Car[] cars = Car.values();  //만들어진 모든 객체를 배열로 리턴
		for(Car c: cars) {
			System.out.println(c + ":"+ c.ordinal());
		}

	}

}
