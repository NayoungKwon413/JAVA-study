package chap5;

import java.util.Scanner;

/*
 * 숫자 맞추기
 * 컴퓨터가 1부터 100사이의 임의의 값을 저장하고, 사용자는 반복적으로 숫자를 입력하여
 * 컴퓨터가 저장한 숫자를 맞추기
 * 숫자를 맞춘 경우 프로그램 종료
 */
public class LoopEx4 {

	public static void main(String[] args) {
		/*
		 * Math.random() : 난수, 임의의 수 리턴
		 *                 0 <= Math.random() <1.0
		 *                 0 <= Math.random() * 100 < 100.0 
		 *                 0 <= (int)(Math.random() * 100) <= 99
		 *                 0 <= (int)(Math.random() * 100) +1 <= 100
		 * ans : 1부터 100까지의 임의의 수 저장
		 */
		int ans = (int)(Math.random() * 100) + 1;  
		Scanner scan = new Scanner(System.in);
		int input;
		int cnt=0;
		do {
			System.out.println("1~100 사이의 숫자를 입력하세요");
			input = scan.nextInt();
			cnt++;
			if(ans > input) {
				System.out.println("큰 수입니다.");
			}else if(ans < input) {
				System.out.println("작은 수입니다.");
			}else {
				System.out.println("정답입니다.");
			}
		}while(input != ans);
		

		System.out.println("입력 횟수 : " + cnt);
		
	}

}
