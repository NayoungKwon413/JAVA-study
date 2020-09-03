package chap8;

import chap8.test.Pack2;

/*
 * ��Ű�� ����
 * 
 * package
 *   Ŭ�������� ����
 *   Ŭ������ �̸��� ��Ű������ �����Ѵ�.
 *   package ������ ���� ó���� �ѹ��� ���� ���� => �ϳ��� ������ ��� Ŭ������ ���� ��Ű���� ���� Ŭ�����̴�.
 *   java���� ��Ű���� ������ �����Ѵ�.
 *   
 * import : ��Ű������ ������ �� �ֵ��� �̸� ���� Ŭ������ ��Ű������ ����.\
 * 
 * Ŭ������ ��Ű������ ������ �� �ִ� ���
 *   1. ���� ��Ű���� ���� Ŭ������ ��Ű���� ���� ����
 *   2. java.lang ��Ű���� ���� Ŭ�������� ��Ű���� ���� ����(String, System ��)
 *   3. import �������� ������ Ŭ������ ��Ű���� ��������
 */

class Pack1 {
	void method() {
		System.out.println("chap8.Pack1.method() ȣ���");
	}
}

public class PackageEx1 {

	public static void main(String[] args) {
		Pack1 p1 = new Pack1();
		p1.method();
		Pack2 p2 = new Pack2();
		p2.method();

	}

}
