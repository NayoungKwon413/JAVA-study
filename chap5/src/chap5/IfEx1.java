package chap5;

import java.util.Scanner;

/*
 * if 조건문 예제
 * 
 * if(조건식1) {
 *    문장1 <= 조건식1의 결과가 참인 경우 실행되는 구문 
 * } else {
 *    문장2 <= 조건식1의 결과가 거짓인 경우 실행되는 구문
 * }
 * 
 * if(조건식1) {
 *    문장1 <= 조건식1의 결과가 참인 경우 실행되는 구문
 * } else if {
 *    문장2 <= 조건식1의 결과가 거짓이면서, 조건식2의 결과가 참인 경우 실행되는 구문
 * } else if {
 *    문장3 <= 조건식1과 2의 결과가 거짓이면서, 조건식3의 결과가 참인 경우 실행되는 구문
 * } else {
 *    문장n <= 조건식1, 2, 3의 결과가 모두 거짓일 경우 실행되는 구문
 * }
 * 
 * if(조건식) => else 구문 없는 if 구문은 가능. 그러나 if 없는 else는 불가능.
 * 실행되는 구문이 한 문장인 경우는 중괄호 {} 생략 가능
 * if, else 구문 내부에 다시 if 구문 사용 가능함. 
 */
public class IfEx1 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if(score >= 60) {
			System.out.println("합격을 축하합니다.");
		} else {
			System.out.println("불합격입니다. 다음 기회에...");
		}
          //90이상인 경우, A학점 ... F학점까지 출력하기(조건문으로)
		if (score>=90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
	}  //main method 종료. 프로그램 종료.

}
