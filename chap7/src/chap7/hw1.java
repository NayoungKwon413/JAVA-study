package chap7;

import java.util.Scanner;

/*
 * ��) ���ڸ� �Է¹޾� �Ҽ����� �Ǻ��Ͻÿ�
 * 
 * [���]
 * ���ڸ� �Է��ϼ���
 * 5
 * �Ҽ��Դϴ�.
 */
public class hw1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = scan.nextInt();
		
		int pri =0;		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				pri++;
				System.out.println("��� : " + i);
			}
			
		}
		if(pri==2) {
			System.out.println(num + ": �Ҽ��Դϴ�.");
		}else System.out.println(num + ": �Ҽ��� �ƴմϴ�.");

	}

}
