package chap4;

import java.util.Scanner;

/*
 * ȭ�鿡�� �ݾ��� �Է¹޾� 500, 100, 50, 10, 1�� �������� �ٲٱ�
 * �ʿ��� ������ ������ ����ϱ�
 * [���]
 * �ݾ��� �Է��ϼ���
 * 5641
 * 500��: 11��
 * 100��: 1��
 * 50��: 0��
 * 10��: 4��
 * 1��: 1��
 */
public class Exam3 {

	public static void main(String[] args) {
		System.out.println("�ݾ��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("500�� : " + num/500 + "��" + "\n100�� :" + num%500/100 + "��" + "\n50�� : " + num%100/50 + "��" 
		+ "\n10�� :" + num%50/10 + "��" + "\n1�� : " + num%10 + "��");

	}

}
