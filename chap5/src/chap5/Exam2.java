package chap5;

import java.util.Scanner;

/*
 * Ű���忡�� �� ���� ���ڸ� �Է¹޾� �빮��, �ҹ���, ����, ��Ÿ�������� ����ϱ�
 */
public class Exam2 {

	public static void main(String[] args) {
		System.out.println("�� ���� ���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();  //nextint :�������� ����. next : ���ڿ�
		char ch = str.charAt(0);   
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("�ҹ���");
		} else if(ch >= 'A' && ch <= 'Z') {
			System.out.println("�빮��");
		} else if(ch>='0' && ch<='9') {
			System.out.println("����");
		} else {
			System.out.println("��Ÿ����");
		}
		

	}

}
