package chap4;

import java.util.Scanner;

/*
 * ���� ������(���� ������)
 *    (���ǽ�)?��:����
 *    
 *    ���ǿ����� : ������ ���ǹ����� ������ �����ϴ�.
 */
public class OpEx10 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		//String result = (score>=60)?"�հ�":"���հ�";  //���� ������ : (���ǽ�)?��:����
		//-> ���ǹ����� ��ġ��,
		String result;
		if(score >= 60) {
			result = "�հ�";
		} else {
			result = "���հ�";
		}
		
		System.out.println(score + "����" + result + "�Դϴ�.");
		
		//60������ ���� ��������Դϴ�.
		result = (score>=70)?"�հ�":(score>=60)?"�������":"���հ�";  //���� ������ : (���ǽ�)?��:����
		System.out.println(score + "����" + result + "�Դϴ�.");

	}

}
