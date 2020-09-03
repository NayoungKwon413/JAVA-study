package homework;
/*
 * 1. 다음 결과가 나오도록 프로그램을 작성하세요

[결과]

삼각형의 높이를 입력하세요
3
*****
 ***
  *
 
 */
import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt(); 
		int top = 2*high-1;
		int m = top/2;
		for(int i=high-1; i>=0; i--) {
			for(int j=0; j<top; j++) {
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
