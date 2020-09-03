package chap4;

import java.util.Scanner;

/*
 * 10부터 99 사이의 두 자리 자연수를 입력받아 입력된 수보다 크거나 같은 10의 배수를 구하기
 * 10의 배수에서 입력된 수를 뺀 값을 출력하기
 * [결과]
 * 10부터 99 사이의 두 자리 자연수를 입력하세요
 * 24
 * -> 30 -> 30-24 ->6
 * 6
 */
public class Exam7 {

	public static void main(String[] args) {
		System.out.println("10부터 99 사이의 두 자리 자연수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = (num%10==0)?(num-num):(10-(num%10));
		System.out.println(result);

		
		/*int n = scan.nextInt();
		 * int num = (n%10==0)?n:(n/10+1)*10;
		 * System.out.println(num-n);
		 */
		
	}

}


