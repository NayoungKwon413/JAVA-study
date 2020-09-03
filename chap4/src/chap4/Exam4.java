package chap4;

import java.util.Scanner;

/*
 * 숫자를 입력받아서 양수인 경우는 양수, 음수인 경우는 음수, 0인 경우는 영 으로 출력하기
 * [결과]
 * 숫자를 입력하세요
 * -10
 * 음수
 */
public class Exam4 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String result = (num>0)?"양수":(num==0)?"영":"음수";
		System.out.println(result);
		
		//짝수인지 홀수인지 출력
		System.out.println("결과 :" + ((num%2==0)?"짝수":"홀수") + "입니다.");  //조건 연산자가 우선순위가 가장 낮기 때문에, 괄호를 이용하여 우선순위를 높여주어야 함.
		

	}

}
