package chap4;

import java.util.Scanner;

/*
 * ����� ��� ���� ������� ���� ���ϱ�
 * 1���� ���ڿ� 10���� ����� ���� �� �ִٰ� �� �� �ʿ��� ������ ������ ����϶�
 * [���]
 * ����� ������ �Է��ϼ���
 * 22
 * �ʿ��� ������ ���� : 3��
 * ����� ������ �Է��ϼ���
 * 30
 * �ʿ��� ������ ���� : 3��
 */
public class Exam6 {

	public static void main(String[] args) {
		System.out.println("����� ������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = ((num%10) > 0)?((num/10)+1):(num/10);  //string ���� ���� �ʾƵ� ��. ���� �Ӽ��� �°� ���.
		System.out.println("�ʿ��� ������ ���� : " + result + "��");
		System.out.println("�ʿ��� ������ ���� : " + ((num/10) + ((num%10==0)?0:1)) + "��");  //�پ��� ���·� ǥ������
		
		

	}

}
