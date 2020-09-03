package chap5;

import java.util.Scanner;

/*
 * 숫자로 이루어진 문자열을 입력받아 각 자리수의 합을 구하기
 * String str = scan.next();
 * str.length() : 3
 * str.charAt(0) : 1
 * str.charAt(1) : 2
 * str.charAt(2) : 3
 * str.charAt(3) : 없다. 오류발생
 * 1 + 2 + 3 = 6
 */
public class Exam8 {

	public static void main(String[] args) {
		System.out.println((int)'0' + "," + (int) '1');  //48, 49 문자0은 48, 문자1은 49
		
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int sum = 0;
		
		for(int i = 0; i <str.length(); i++) {
			sum = sum+str.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
