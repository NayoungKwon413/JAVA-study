package chap4;
/*
 * ��� ������(���� ����) : +, -, *, /(�������� ��), %(������)
 *  / : �������� ��. ����/����=����(�Ҽ��� ���� ����) 
 *  % : ��� ��ȣ�� �������� ��ȣ�� ������.
 */
public class OpEx6 {

	public static void main(String[] args) {
		System.out.println(10/8);  //1 �� ���� ������ int �̱� ������ ����� ���� int ���� ��. ���� �Ǽ��� �ƴ� ������ ��Ÿ���� ��.(�Ҽ��� ���ϸ� ���� �� ����)
		System.out.println(10/-8);
		System.out.println(-10/8);
		System.out.println(-10/-8);
		
		System.out.println(10%8);  //2 : �������� ��� ���������� ���� ��ȣ�� ����.
		System.out.println(10%-8);  //2
		System.out.println(-10%8);  //-2
		System.out.println(-10%-8);  //-2

	}

}
