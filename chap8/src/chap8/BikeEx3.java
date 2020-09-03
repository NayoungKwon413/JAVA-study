package chap8;
/*
 * ���ε� ����
 * 
 *   �θ�Ŭ������ ����� �ڼ�Ŭ������ ����� ���� ���
 *   ������� : ���������� �ڷ����� ������. �θ�Ÿ���� ���������� ������ ���� �θ��� ����� ȣ��Ǵ� ���� �� �� ����.
 *   ��� �޼��� : ������ ���� �������̵� �� �޼��尡 ȣ��ȴ�.
 *             �޼��� ���ο��� ���Ǵ� ��� ������ �������̵��� ��� �޼��� �������� ó���ȴ�. 
 */

class Bike3 {
	int wheel;
	int price=10;
	Bike3(int wheel) {
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("�д��� ��´�.");
	}
	void stop() {
		System.out.println("�극��ũ�� ��´�");
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
		if(power) System.out.println("���� ����");
		else System.out.println("���� ����");
	}
	@Override
	void drive() {
		if(!power) power();
		System.out.println("��߹�ư ������. ����:" + this.price);
	}
	@Override
	void stop() {
		if(power) System.out.println("���� ��ư�� ������. ����:" + this.price);
		else System.out.println("������ ���� �ֽ��ϴ�.");
	}
}
public class BikeEx3 {
	public static void main(String[] args) {
		AutoBike3 auto = new AutoBike3(2);
		System.out.println("������ " + auto.price + "�Դϴ�.");
		auto.drive();
		auto.stop();
		Bike3 bike = auto;
		System.out.println("������ " + bike.price + "�Դϴ�.");
		auto.drive();
		auto.stop();
	}

}
