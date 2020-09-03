package chap6;

import java.util.Scanner;

/*
 * 10������ 2, 8, 10, 16 ������ ��ȯ�ϱ�
 */
public class ArrayEx5 {

	public static void main(String[] args) {
		int[] digit = {2, 8, 10, 16};  //����
		char[] data = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr = new char[32];
		System.out.println("��ȯ�� 10������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();  //10
		int divnum = num, index = 0;
		for(int d : digit) {  //������ for ���� : ÷�ڴ� ���Ұ�. 
			divnum = num;  //10
			index = 0;
			while(divnum != 0) {
				arr[index++] = data[divnum%d];  //arr = 0, 
				divnum /= d;
			}
			System.out.print(num + "�� " + d + "���� : ");
			for(int i=index-1; i>=0; i--) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
		System.out.println(num + "�� 2���� : " + Integer.toBinaryString(num));
		System.out.println(num + "�� 8���� : " + Integer.toOctalString(num));
		System.out.println(num + "�� 16���� : " + Integer.toHexString(num));
		
	}

}
