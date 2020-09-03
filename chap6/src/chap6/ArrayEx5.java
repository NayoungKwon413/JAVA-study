package chap6;

import java.util.Scanner;

/*
 * 10진수를 2, 8, 10, 16 진수로 변환하기
 */
public class ArrayEx5 {

	public static void main(String[] args) {
		int[] digit = {2, 8, 10, 16};  //진수
		char[] data = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr = new char[32];
		System.out.println("변환할 10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();  //10
		int divnum = num, index = 0;
		for(int d : digit) {  //개선된 for 구문 : 첨자는 사용불가. 
			divnum = num;  //10
			index = 0;
			while(divnum != 0) {
				arr[index++] = data[divnum%d];  //arr = 0, 
				divnum /= d;
			}
			System.out.print(num + "의 " + d + "진수 : ");
			for(int i=index-1; i>=0; i--) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
		System.out.println(num + "의 2진수 : " + Integer.toBinaryString(num));
		System.out.println(num + "의 8진수 : " + Integer.toOctalString(num));
		System.out.println(num + "의 16진수 : " + Integer.toHexString(num));
		
	}

}
