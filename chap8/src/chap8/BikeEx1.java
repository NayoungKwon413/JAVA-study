package chap8;
/*
 * ���� ���̵� ����
 * 
 * �������̵� : �ݵ�� ��Ӱ��迡�� ��Ÿ��.
 *           �θ� Ŭ������ �޼��带 �ڼ� Ŭ�������� ������ �ϴ� ��.
 *           �θ� �޼����� ����ο� �ڼ� �޼����� ����ΰ� �⺻������ ���ƾ� ��.
 *           ��, ���������ڴ� ���� ������ ����, ����ó���� ���� ������ ������.
 */

class Bike {
	int wheel;
	Bike(int wheel) {
		this.wheel = wheel;
	}
	String drive() {
		return "�д��� ��´�";
	}
	String stop() {
		return "�극��ũ�� ��´�";
	}
}
class AutoBike extends Bike {
	AutoBike(int wheel) {
		super(wheel);  //this�� ���������� ù�ٿ� �ۼ��Ǿ�� ��.
	}
	boolean power;
	void power() {
		power = !power;
	}
	@Override   //������̼� : �������̵��� ����� �����Ǿ����� �Ǵ�.
	String drive() {
		return "��� ��ư�� ������";
	}
	@Override
	String stop() {
		return "���� ��ư�� ������";
	}
}

public class BikeEx1 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println(ab.drive());
		System.out.println(ab.stop());

	}

}
