package chap12;
/*
 * Wrapper Ŭ���� : 8���� �⺻ �ڷ����� ��üȭ�ϱ� ���� Ŭ����
 *      �⺻�ڷ���             Wrapper Ŭ����
 *      boolean         Boolean
 *      byte            Byte
 *      short           Short
 *      int             Integer
 *      long            Long
 *      char            Character
 *      float           Float
 *      double          Double
 *      
 *      �⺻������ �⺻�ڷ����� �����ڷ����� ����ȯ�� �Ұ���.
 *      ��, ���������� �⺻�ڷ����� Wrapper Ŭ������ ����ȯ�� �����ϴ�(jdk 5.0 ���ĺ���).
 *      �⺻�� <= ������ : auto UnBoxing
 *      ������ <= �⺻�� : auto Boxing
 */
public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println("i1==i2 : " + (i1==i2));  //false : �ٸ� ��ü�̱� ����
		System.out.println("i1.equals(i2) : " + (i1.equals(i2)));  //true : ���� ������ ��
		System.out.println("i1==100 : " + (i1==100));  //true : i1 �⺻������ �ڵ�����ȯ �Ǳ� ����(��ڽ�)
		int i3 = 100;
		System.out.println("i1==i3 : " + (i1==i3)); //true : ��ڽ�
		Integer i4 = 100;  //auto boxing
		System.out.println("i1==i4 : " + (i1==i4));  //false : i4 WrapperŬ������ ��ü�� �ڽ̵Ǿ��� ������ ���� �ٸ� ��ü�� �ν�
		//int ���� ����
		System.out.println("int ���� �ִ밪 : " + Integer.MAX_VALUE);
		System.out.println("int ���� �ּҰ� : " + Integer.MIN_VALUE);
		System.out.println("int ���� bit�� : " + Integer.SIZE);
		//byte ���� ����
		System.out.println("byte ���� �ִ밪 : " + Byte.MAX_VALUE);
		System.out.println("byte ���� �ּҰ� : " + Byte.MIN_VALUE);
		System.out.println("byte ���� bit�� : " + Byte.SIZE);
		//������ ���ڿ��� int�� ��ȯ
		int num = Integer.parseInt("123");
		System.out.println(num+100);
		//10������ 2, 8, 16������ ��ȯ
		System.out.println("10�� 2���� : " + Integer.toBinaryString(10));
		System.out.println("10�� 8���� : " + Integer.toOctalString(10));
		System.out.println("255�� 16���� : " + Integer.toHexString(255));

	}
}
