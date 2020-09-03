package chap7;
/*
 * this ����� ����
 * 
 * this() ������ : ���� Ŭ������ �ٸ� �����ڸ� ȣ��.
 *               �ٸ� ������ ȣ�� �� �������� ù �ٿ��� ȣ��Ǿ�� �Ѵ�.
 * this ��������  : �ڱ� ���� ����. �ڱ� ��ü�� �������� �����ϴ� ����
 *               �ν��Ͻ� ����� ������ �� ����.
 *               �ν��Ͻ� �޼����� ���������� �ڵ� �����.
 */

class Car2 {
	String color;
	int number;
	Car2(String color, int number) {
		System.out.println("String int ������ ȣ��");
		this.color = color;  // this ��������
		this.number = number;
	}
	Car2() {
		this("white", 1234);  //this �����ڴ� �ݵ�� ù �ٿ����� ȣ���� �����ϴ�.
		System.out.println("() ������ ȣ��");
	}
	Car2(String c) {
		this(c, 1234);  // => ������ �� �Ű����� String int �� ������ ȣ��
	}
	public String toString() {
		return color + "," + number;
	}
}

public class ThisEx1 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue", 1234);
		Car2 c3 = new Car2("red");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
