package chap10;
/*
 * ������ ����
 */
public class EnumEx1 {
	public enum Car {//��ǻ� ����Ŭ����
		AVANTE, SONATA, GRANDURE,SM5
	}
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println("My Car : " + car);
		System.out.println("SONATA : " + Car.SONATA);
		car = Car.GRANDURE;
		if(car instanceof Object) {  //Car Ŭ������ Object�� ���� Ŭ�����ΰ�? (O)
			System.out.println(car.toString());
			System.out.println(car.getClass().getName());
		}
		Car[] cars = Car.values();  //������� ��� ��ü�� �迭�� ����
		for(Car c: cars) {
			System.out.println(c + ":"+ c.ordinal());
		}

	}

}
