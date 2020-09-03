package chap4;

import java.util.Scanner;

/*
 * 한개의 문자를 입력받아서 소문자인 경우는 대문자로 변경하기.
 * 단, 소문자가 아닌 경우는 "소문자 아님"으로 출력하기
 */
public class Exam5 {

	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();  //nextint :정수값만 받음. next : 문자열
		char ch = str.charAt(0);   
		String result = (ch >= 'a' && ch <= 'z')?""+(char)(ch-32):"소문자 아님";  //ch-32 는 int이므로 형변환 필요. 
		System.out.println(result);
		System.out.println((ch >= 'a' && ch <= 'z')?(char)(ch-32):"소문자 아님");  

	}

}
