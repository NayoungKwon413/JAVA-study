package chap5;

import java.util.Scanner;

/*
 * ���� ���߱�
 * ��ǻ�Ͱ� 1���� 100������ ������ ���� �����ϰ�, ����ڴ� �ݺ������� ���ڸ� �Է��Ͽ�
 * ��ǻ�Ͱ� ������ ���ڸ� ���߱�
 * ���ڸ� ���� ��� ���α׷� ����
 */
public class LoopEx4 {

	public static void main(String[] args) {
		/*
		 * Math.random() : ����, ������ �� ����
		 *                 0 <= Math.random() <1.0
		 *                 0 <= Math.random() * 100 < 100.0 
		 *                 0 <= (int)(Math.random() * 100) <= 99
		 *                 0 <= (int)(Math.random() * 100) +1 <= 100
		 * ans : 1���� 100������ ������ �� ����
		 */
		int ans = (int)(Math.random() * 100) + 1;  
		Scanner scan = new Scanner(System.in);
		int input;
		int cnt=0;
		do {
			System.out.println("1~100 ������ ���ڸ� �Է��ϼ���");
			input = scan.nextInt();
			cnt++;
			if(ans > input) {
				System.out.println("ū ���Դϴ�.");
			}else if(ans < input) {
				System.out.println("���� ���Դϴ�.");
			}else {
				System.out.println("�����Դϴ�.");
			}
		}while(input != ans);
		

		System.out.println("�Է� Ƚ�� : " + cnt);
		
	}

}
