package chap5;

import java.util.Scanner;

/*
 * ȭ�鿡 �ﰢ�� ���̸� �Է¹ް�, ���̿� �´� *�� �ﰢ�� ����ϱ�
 * [���]
 * �ﰢ���� ���̸� �Է��ϼ���
 * 3
 *    *
 *   **
 *  ***
 */
public class Exam13 {

	public static void main(String[] args) {
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		for(int i=high; i >= 1; i--) {
			for(int j=1; j <= high; j++) {	
				if(i<=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
