package chap5;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		for(int i=1; i<=high; i++) {
			for(int j=1; j<=high; j++) {
				if(i>j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
