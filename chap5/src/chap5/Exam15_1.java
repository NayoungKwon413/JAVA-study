package chap5;

import java.util.Scanner;

public class Exam15_1 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt(); 
		int b = high*2 - 1;
		int m = b / 2;
		for(int i=0; i<high; i++) {
			for(int j=0; j<b; j++) {
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
