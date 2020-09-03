package chap5;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt(); //3
		int bottom = high * 2 - 1;  //5(가장 아래층 의 별 수)
		int m = bottom / 2;        //2(가운데 있는 별 번호)
		for(int i=0; i<high; i++) { //행
			for(int j=0; j<bottom; j++) { //열
				if(j>=m-i && j<=m+i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				
			}
			System.out.println();
		}

	}

}
