package chap12;

import java.util.Scanner;

/*
 * 
 */
public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum =0, cnt=0;
		System.out.println("두자리 자연수를 입력하세요 종료(0)");
		while(true) {
			int num=scan.nextInt();
			if(num<1) break;
			sum += num;
			cnt++;
		}
		System.out.println("입력데이터 건수:" + cnt + ", 합계:" + sum);

	}
}
