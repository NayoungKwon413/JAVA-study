package chap5;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력하세요
 */
public class Exam11 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		for(int i =1; i <= high ; i++) {
			for(int j=1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		

	}

}
