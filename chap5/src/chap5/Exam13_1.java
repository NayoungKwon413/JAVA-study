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
public class Exam13_1 {

	public static void main(String[] args) {
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		for(int i = 1; i<=high; i++) {
			for(int j=high; j>=1; j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
