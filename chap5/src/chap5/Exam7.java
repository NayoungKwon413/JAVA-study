package chap5;

import java.util.Scanner;

/*
 * ȭ�鿡�� �ڿ����� �Է¹޾� ������ �ڸ����� ���� ���ϱ�
 * [���]
 * �ڿ����� �Է��ϼ���
 * 123
 * �ڸ��� �� : 6
 */
public class Exam7 {

	public static void main(String[] args) {
		System.out.println("�ڿ����� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum =0;
		do {
			sum += num%10;
			num /= 10;
		}while(num != 0);
		System.out.println("�ڸ��� �� : " + sum);

	}

}
