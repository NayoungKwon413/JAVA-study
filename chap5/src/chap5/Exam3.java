package chap5;

import java.util.Scanner;

/*
 * ���� ���ϱ�
 *   ������ 4�� ����̰�, 100�� ����� ���� ���. ��, 400�� ����� ����.
 *   �� �ܴ� ���
 *   �⵵�� �Է¹޾Ƽ� �������� ������� ����ϱ�
 */
public class Exam3 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if (year%4 == 0 && year%100 == 0) {
			System.out.println("���");
		} else if (year%4==0) {
			System.out.println("����");
		}else if (year%4==0 && year%100==0 && year%400==0) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}
		

	}

}
