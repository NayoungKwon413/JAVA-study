package chap5;

import java.util.Scanner;

/*
 * switch ������ �̿��Ͽ� 60�� �̻��� ��� �հ�, �� �ܴ� ���հ� ����ϱ�
 */
public class Exam4 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		switch(score/10) {
		case 10:
		case 9 :
		case 8 :
		case 7 :
		case 6 : System.out.println("�հ�"); break;
		default : System.out.println("���հ�"); break;
		}
		
	}

}
