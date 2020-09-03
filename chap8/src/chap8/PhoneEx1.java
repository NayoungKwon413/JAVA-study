package chap8;

/*
 * ��� ����
 * 
 *   1. �ڼ� Ŭ������ ��ü ������ �θ� ��ü�� ���� ������.
 *   2. �ڼհ�ü�� �θ�ü�� ��� ������ ������.
 *   3. Ŭ���� �� ����� ���� ��Ӹ� ������.
 *      -> �ڼ�Ŭ������ �θ�Ŭ������ �� ���� ������(�θ�� ���� �ڼ��� �� �� ����)
 *   4. ��� Ŭ������ Object Ŭ������ ��� �޴´�. 
 *      -> ��� Ŭ������ ��ü�� Object��ü�� �����Ѵ�. 
 *         ��� Ŭ������ ��ü�� Object��ü�� ����� ������ �����ϴ�.
 */
class Phone {
	boolean power;
	int number;
	void power() {
		power = !power;
	}
	void send() {
		if(power)
			System.out.println("��ȭ�ɱ�");
	}
	void receive() {
		if(power)
			System.out.println("��ȭ�ޱ�");
	}
}
class SmartPhone extends Phone {
	void setApp(String name) {
		System.out.println(name + "��ġ ��~~");
	}
}

public class PhoneEx1 {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("���̹�");
		
	}

}
