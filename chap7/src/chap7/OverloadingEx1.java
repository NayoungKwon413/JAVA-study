package chap7;
/*
 * �����ε� ����
 *   1. ������ Ŭ���� ���ο� ���� �̸��� ���� �޼��尡 ���� �� ������ �� �ִ�.
 *   2. ��, �Ű������� �޶�� �Ѵ�(�ڷ���, ����, ����) => �Ű����� �̸��� �ٸ� ���� �ƴϰ� �ڷ����� �޶�� ��.
 */

class Math3 {
	int a=100;
	int add(int b) {
		System.out.print("1:");
		return a+b;
	}
	double add(double b) {
		System.out.print("2:");
		return a+b;
	}
	String add(String b) {
		System.out.print("3:");
		return a+b;
	}
}

public class OverloadingEx1 {

	public static void main(String[] args) {
		Math3 m3 = new Math3();
		System.out.println(m3.add(10));
		System.out.println(m3.add(10.5));
		System.out.println(m3.add("��"));
		System.out.println(m3.add(10L)); //2:110.0 long -> int (X), long -> double(O:�ڵ�����ȯ����)

	}

}
