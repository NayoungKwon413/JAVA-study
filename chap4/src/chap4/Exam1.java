package chap4;

import java.util.Scanner;

/*
 * 12345 �ʰ� ��ð� ��� �������� ����ϱ�
 * 
 * System.in : ǥ���Է� ��, Ű���� �Է�
 */
public class Exam1 {

	public static void main(String[] args) {
		System.out.println("����� �ʸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int second = scan.nextInt();
		System.out.println("�ð�" + "��" + "��");
		System.out.println(second/3600);
		System.out.println(second%3600/60);
		System.out.println(second%3600%60);
		System.out.println(second/3600 + "�ð�" + second%3600/60 + "��" + second%3600%60 + "��" );
		

	}

}
