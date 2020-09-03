package chap6;

import java.util.Scanner;

/*
 * 10진수를 8진수로 변경하기
 */
public class Exam1 {

	public static void main(String[] args) {
		int[] binary = new int[32];
		System.out.println("8진수로 변환할 10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index = 0;
		while(divnum != 0) {
			binary[index++] = divnum % 8;
			divnum /= 8;
		}
		System.out.print(num + "의 8진수 :");
		for(int i=index-1; i>=0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
	}

}
