package chap4;

import java.util.Scanner;

/*
 * ȭ�鿡�� 3�ڸ� ������ �Է¹޾Ƽ� 100 �ڸ� �̸��� ������ ����ϱ�
 * [���]
 * ���ڸ� ������ �Է��ϼ���
 * 321
 * 300
 */
public class Exam2 {

	public static void main(String[] args) {
		System.out.println("���ڸ� ������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num/100*100);

	}

}
