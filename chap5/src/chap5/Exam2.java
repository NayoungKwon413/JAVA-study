package chap5;

import java.util.Scanner;

/*
 * 키보드에서 한 개의 문자를 입력받아 대문자, 소문자, 숫자, 기타문자인지 출력하기
 */
public class Exam2 {

	public static void main(String[] args) {
		System.out.println("한 개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();  //nextint :정수값만 받음. next : 문자열
		char ch = str.charAt(0);   
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("소문자");
		} else if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자");
		} else if(ch>='0' && ch<='9') {
			System.out.println("숫자");
		} else {
			System.out.println("기타문자");
		}
		

	}

}
