package chap4;

import java.util.Scanner;

/*
 * �Ѱ��� ���ڸ� �Է¹޾Ƽ� �ҹ����� ���� �빮�ڷ� �����ϱ�.
 * ��, �ҹ��ڰ� �ƴ� ���� "�ҹ��� �ƴ�"���� ����ϱ�
 */
public class Exam5 {

	public static void main(String[] args) {
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();  //nextint :�������� ����. next : ���ڿ�
		char ch = str.charAt(0);   
		String result = (ch >= 'a' && ch <= 'z')?""+(char)(ch-32):"�ҹ��� �ƴ�";  //ch-32 �� int�̹Ƿ� ����ȯ �ʿ�. 
		System.out.println(result);
		System.out.println((ch >= 'a' && ch <= 'z')?(char)(ch-32):"�ҹ��� �ƴ�");  

	}

}
