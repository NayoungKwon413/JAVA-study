package chap5;

import java.util.Scanner;

/*
 * ���ڷ� �̷���� ���ڿ��� �Է¹޾� �� �ڸ����� ���� ���ϱ�
 * String str = scan.next();
 * str.length() : 3
 * str.charAt(0) : 1
 * str.charAt(1) : 2
 * str.charAt(2) : 3
 * str.charAt(3) : ����. �����߻�
 * 1 + 2 + 3 = 6
 */
public class Exam8 {

	public static void main(String[] args) {
		System.out.println((int)'0' + "," + (int) '1');  //48, 49 ����0�� 48, ����1�� 49
		
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int sum = 0;
		
		for(int i = 0; i <str.length(); i++) {
			sum = sum+str.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
