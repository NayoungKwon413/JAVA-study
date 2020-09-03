package chap7;
/*
 * Ŭ���� ����, �ν��Ͻ� ���� ����
 * 
 * ���� ��ġ�� ���� ������ ����
 *             ���� ��ġ     ���� ���                 �޸��Ҵ�ñ�                             �޸��Ҵ���ġ
 * Ŭ��������    : Ŭ���� ����  static int cv;  Ŭ���� ���� �ε� ��                         Ŭ���� ����
 *          => ��üȭ�� ���þ��� ����. ��� ��ü�� ���뺯���� ����. 
 *          => Ŭ������.������ �� ���·� ����.
 * �ν��Ͻ�����  : Ŭ���� ���� int iv;         ��üȭ ��                                      �� ����
 *          => �ݵ�� ��üȭ�Ǿ�� ��� ����. 
 *          => ����������.������ �� ���·� ����.
 * ��������       : �޼��� ���� int lv;         �޼��尡 ����Ǿ� ������ ����� ��     ���� ����
 *          => ������ �� ���·� ����.
 *          => �ݵ�� �ʱ�ȭ �Ǿ����. 
 *          => �Ű������� ����������.(���ÿ����� ȣ��� ���� �޸� �Ҵ��)
 */
class Sonata {
	String color;  //�ν��Ͻ�����, ��ü����
	int number;  //�ν��Ͻ�����, ��ü����
	static int width = 250;  //Ŭ���� ����
	static int height = 150; //Ŭ���� ����
	public String toString() {
		return color + ":" + number + "(" + width + "," + height +")";
	}
}

public class SonataEx1 {

	public static void main(String[] args) {
		System.out.println("�ڵ��� ũ��:" + Sonata.width + "," + Sonata.height);
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
