package chap7;

import java.util.Scanner;

/*
 * 2.  ������ ������ ������ ���� �����Ͽ�, ������ ������ŭ�� ���� �����ϱ�
[���] 
�ݾ��� �Է��ϼ���
 36000
 ������ �����մϴ�.
 
�ݾ��� �Է��ϼ���
3010
500��:5
100��:5
50��:0
10��:1
5��:0
1��:0
���� ���� 500��:0��
���� ���� 100��:0��
���� ���� 50��:5��
���� ���� 10��:4��
���� ���� 5��:5��
���� ���� 1��:5��

 */
public class hw2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���");
		int cost = scan.nextInt();
		
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int[] cnt = { 5, 5, 5, 5, 5, 5 };
		int max = 500*5 + 100*5 + 50*5 + 10*5 + 5*5+ 1*5;
		if(cost>max) {
			System.out.println("������ �����մϴ�.");
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
			System.out.println(coin[i] + "��:" + (5-cnt[i]));
			}

			for (int i=0; i< coin.length; i++) {
			                   System.out.println("��������" + coin[i] + "��:" + cnt[i] + "��");
			}


}
}