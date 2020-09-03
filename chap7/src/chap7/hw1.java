package chap7;

import java.util.Scanner;

/*
 * 문) 숫자를 입력받아 소수인지 판별하시오
 * 
 * [결과]
 * 숫자를 입력하세요
 * 5
 * 소수입니다.
 */
public class hw1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		
		int pri =0;		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				pri++;
				System.out.println("약수 : " + i);
			}
			
		}
		if(pri==2) {
			System.out.println(num + ": 소수입니다.");
		}else System.out.println(num + ": 소수가 아닙니다.");

	}

}
