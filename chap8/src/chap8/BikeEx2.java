package chap8;
/*
 * ������ ����
 * 
 *   �ڼ�Ÿ���� ��ü�� �θ�Ÿ���� ���������� ������ �����ϴ�.
 *   �θ�Ÿ���� ���������� �����ϴ� ���, �θ�Ÿ���� ����� ���� �����ϴ�.
 *   ��� Ŭ������ Object Ŭ������ ����Ŭ�����̹Ƿ� ��� Ŭ������ ��ü�� Object Ÿ������ ������ ������.
 *   
 */
class Bike2 {
	int wheel;
	Bike2(int wheel) {
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("�����δ�");
	}
	void stop() {
		System.out.println("�����");
	}
}
class AutoBike2 extends Bike2 {
	boolean power;
	AutoBike2(int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
		if(power) System.out.println("������ �������ϴ�.");
		else System.out.println("������ �������ϴ�.");
	}
} 

public class BikeEx2 {

	public static void main(String[] args) {
		AutoBike2 auto1 = new AutoBike2(2);
		Object obj =auto1;
		Bike2 bike;
		auto1.power();
		auto1.drive();
		System.out.println("����"+ auto1.wheel + "���� ���� ����.");
		auto1.stop();
		bike = auto1;  //bike = (Bike2)(auto1); : (Bike) ������ �������� -> ������
		bike.drive();
		System.out.println("����" + bike.wheel + "���� ���� ����.");
		bike.stop();
		((AutoBike2)bike).power();  //error
		AutoBike2 auto2 = (AutoBike2)(bike);  //����ȯ ������ �����Ұ�

	}

}
