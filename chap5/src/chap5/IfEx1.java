package chap5;

import java.util.Scanner;

/*
 * if ���ǹ� ����
 * 
 * if(���ǽ�1) {
 *    ����1 <= ���ǽ�1�� ����� ���� ��� ����Ǵ� ���� 
 * } else {
 *    ����2 <= ���ǽ�1�� ����� ������ ��� ����Ǵ� ����
 * }
 * 
 * if(���ǽ�1) {
 *    ����1 <= ���ǽ�1�� ����� ���� ��� ����Ǵ� ����
 * } else if {
 *    ����2 <= ���ǽ�1�� ����� �����̸鼭, ���ǽ�2�� ����� ���� ��� ����Ǵ� ����
 * } else if {
 *    ����3 <= ���ǽ�1�� 2�� ����� �����̸鼭, ���ǽ�3�� ����� ���� ��� ����Ǵ� ����
 * } else {
 *    ����n <= ���ǽ�1, 2, 3�� ����� ��� ������ ��� ����Ǵ� ����
 * }
 * 
 * if(���ǽ�) => else ���� ���� if ������ ����. �׷��� if ���� else�� �Ұ���.
 * ����Ǵ� ������ �� ������ ���� �߰�ȣ {} ���� ����
 * if, else ���� ���ο� �ٽ� if ���� ��� ������. 
 */
public class IfEx1 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if(score >= 60) {
			System.out.println("�հ��� �����մϴ�.");
		} else {
			System.out.println("���հ��Դϴ�. ���� ��ȸ��...");
		}
          //90�̻��� ���, A���� ... F�������� ����ϱ�(���ǹ�����)
		if (score>=90) {
			System.out.println("A����");
		} else if (score >= 80) {
			System.out.println("B����");
		} else if (score >= 70) {
			System.out.println("C����");
		} else if (score >= 60) {
			System.out.println("D����");
		} else {
			System.out.println("F����");
		}
	}  //main method ����. ���α׷� ����.

}
