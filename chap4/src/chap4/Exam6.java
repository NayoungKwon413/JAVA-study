package chap4;

import java.util.Scanner;

/*
 * 사과를 담기 위한 사과상자 갯수 구하기
 * 1개의 상자에 10개의 사과를 담을 수 있다고 할 때 필요한 상자의 갯수를 출력하라
 * [결과]
 * 사과의 갯수를 입력하세요
 * 22
 * 필요한 상자의 갯수 : 3개
 * 사과의 갯수를 입력하세요
 * 30
 * 필요한 상자의 갯수 : 3개
 */
public class Exam6 {

	public static void main(String[] args) {
		System.out.println("사과의 갯수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = ((num%10) > 0)?((num/10)+1):(num/10);  //string 으로 받지 않아도 됨. 값의 속성이 맞게 사용.
		System.out.println("필요한 상자의 갯수 : " + result + "개");
		System.out.println("필요한 상자의 갯수 : " + ((num/10) + ((num%10==0)?0:1)) + "개");  //다양한 형태로 표현가능
		
		

	}

}
