package chap7;
/*
 * �����ε� �޼����� ���� ����
 *   1. ȣ�� �� �Էµ� ���� �ڷ����� ������� ����� �ڷ����� ������ �޼��� ����
 *   2. 1�� ������ ���� ���, �ּ� ������ �ڵ�����ȯ�� ������ �޼��� ����
 *      => ���� ������ �ڵ�����ȯ�� ������ �޼��尡 2�� �̻��� ��� ���� �߻�
 *      
 * �����ε� ����
 * 1. �޼��� �̸��� ����.
 * 2. �Ű����� ���(�ڷ���)�� �޶���Ѵ�.
 * (����Ÿ��, ���������ڴ� ����� ����.)
 */

class Math4 {
	int add(int a, int b) {
		System.out.print("1. int int �޼��� ��� : ");
		return a+b;
	}
	long add(long a, int b) {
		System.out.print("2. long int �޼��� ��� : ");
		return a+b;
	}
	long add(int a, long b) {
		System.out.print("3. int long �޼��� ��� : ");
		return a+b;
	}
	long add(long a, long b) {
		System.out.print("4. long long �޼��� ��� : ");
		return a+b;
	}
}

public class OverloadingEx2 {

	public static void main(String[] args) {
		Math4 m4 = new Math4();
		System.out.println(m4.add(10, 10));
		System.out.println(m4.add(10, 10L));
		System.out.println(m4.add(10L, 10));
		System.out.println(m4.add(10L, 10L));

	}

}
