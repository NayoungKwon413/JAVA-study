package chap4;

import java.util.Scanner;

/*
 * ������ �Է��ϼ���
 * 90�� �̻� A���� 80�� �̻� B���� 70�� �̻� C���� 60�� �̻� D���� �׿� F����
 */
public class Exam8 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String result = (score>=90)?"A":(score<90 && score>=80)?"B":(score<80 && score>=70)?"C":(score<70 && score>=60)?"D":"F";
		System.out.println(result + "����");
		

	}

}
