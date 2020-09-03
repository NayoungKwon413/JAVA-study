package chap4;

import java.util.Scanner;

/*
 * 점수를 입력하세요
 * 90점 이상 A학점 80점 이상 B학점 70점 이상 C학점 60점 이상 D학점 그외 F학점
 */
public class Exam8 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String result = (score>=90)?"A":(score<90 && score>=80)?"B":(score<80 && score>=70)?"C":(score<70 && score>=60)?"D":"F";
		System.out.println(result + "학점");
		

	}

}
