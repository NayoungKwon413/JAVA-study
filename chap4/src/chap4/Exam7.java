package chap4;

import java.util.Scanner;

/*
 * 10���� 99 ������ �� �ڸ� �ڿ����� �Է¹޾� �Էµ� ������ ũ�ų� ���� 10�� ����� ���ϱ�
 * 10�� ������� �Էµ� ���� �� ���� ����ϱ�
 * [���]
 * 10���� 99 ������ �� �ڸ� �ڿ����� �Է��ϼ���
 * 24
 * -> 30 -> 30-24 ->6
 * 6
 */
public class Exam7 {

	public static void main(String[] args) {
		System.out.println("10���� 99 ������ �� �ڸ� �ڿ����� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = (num%10==0)?(num-num):(10-(num%10));
		System.out.println(result);

		
		/*int n = scan.nextInt();
		 * int num = (n%10==0)?n:(n/10+1)*10;
		 * System.out.println(num-n);
		 */
		
	}

}


