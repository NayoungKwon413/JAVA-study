package chap5;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt(); //3
		int bottom = high * 2 - 1;  //5(���� �Ʒ��� �� �� ��)
		int m = bottom / 2;        //2(��� �ִ� �� ��ȣ)
		for(int i=0; i<high; i++) { //��
			for(int j=0; j<bottom; j++) { //��
				if(j>=m-i && j<=m+i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				
			}
			System.out.println();
		}

	}

}
