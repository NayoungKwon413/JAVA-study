package chap7;

import java.util.Scanner;

/*
 * 2.  동전의 종류와 동전의 갯수 지정하여, 지정된 갯수만큼만 동전 변경하기
[결과] 
금액을 입력하세요
 36000
 동전이 부족합니다.
 
금액을 입력하세요
3010
500원:5
100원:5
50원:0
10원:1
5원:0
1원:0
남은 동전 500원:0개
남은 동전 100원:0개
남은 동전 50원:5개
남은 동전 10원:4개
남은 동전 5원:5개
남은 동전 1원:5개

 */
public class hw2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int cost = scan.nextInt();
		
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int[] cnt = { 5, 5, 5, 5, 5, 5 };
		int max = 500*5 + 100*5 + 50*5 + 10*5 + 5*5+ 1*5;
		if(cost>max) {
			System.out.println("동전이 부족합니다.");
			return;
		}
		for(int i =0; i<coin.length; i++) {
			for(int j=0; j<5; j++) {
				if(cost/coin[i] >0 && cnt[i]>0) {
					cost-= coin[i];
                            cnt[i]--;

				}
		}
	}
		for (int i=0; i< coin.length; i++) {
			System.out.println(coin[i] + "원:" + (5-cnt[i]));
			}

			for (int i=0; i< coin.length; i++) {
			                   System.out.println("남은동전" + coin[i] + "원:" + cnt[i] + "개");
			}


}
}