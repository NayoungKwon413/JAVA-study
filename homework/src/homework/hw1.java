package homework;
/*
 * 1. ���� ����� �������� ���α׷��� �ۼ��ϼ���

[���]

�ﰢ���� ���̸� �Է��ϼ���
3
*****
 ***
  *
 
 */
import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
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
