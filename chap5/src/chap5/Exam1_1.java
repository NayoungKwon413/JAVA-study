package chap5;

import java.util.Scanner;

/*
 * if ������ �̿��Ͽ� ���ڸ� �Է¹޾� ���, ����, ������ ����ϱ�
 */
public class Exam1_1 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num > 0) {
			System.out.println("���");
		}else if(num < 0) {
			System.out.println("����");
		}else {
			System.out.println("��");
		}

	}

}
