package chap6;

import java.util.Scanner;

public class Exam9_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 크기를 홀수로 입력하세요");
		int num = scan.nextInt();
		int [][] matrix = new int[num][num];
		int sum = 0;
		for(int i=1; i<=num; i+=2) {
			sum += i;
		}
		sum = sum*2-1;
		for(int i=0; i <= matrix.length/2; i++) {
			for(int j=i; j < matrix.length-i; j++) {
				matrix[i][j] = sum--;
			}
		}
		
		for(int i=matrix.length/2+1; i < matrix.length; i++) {
			for(int j=matrix.length-i-1; j <= i; j++) {
				matrix[i][j] = sum--;
			}
		}
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(matrix[i][j] ==0) {
					System.out.print("    ");
				}else System.out.printf("%4d",matrix[i][j]);
				
			}System.out.println();

	}

	}
}
