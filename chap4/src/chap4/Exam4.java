package chap4;

import java.util.Scanner;

/*
 * ���ڸ� �Է¹޾Ƽ� ����� ���� ���, ������ ���� ����, 0�� ���� �� ���� ����ϱ�
 * [���]
 * ���ڸ� �Է��ϼ���
 * -10
 * ����
 */
public class Exam4 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String result = (num>0)?"���":(num==0)?"��":"����";
		System.out.println(result);
		
		//¦������ Ȧ������ ���
		System.out.println("��� :" + ((num%2==0)?"¦��":"Ȧ��") + "�Դϴ�.");  //���� �����ڰ� �켱������ ���� ���� ������, ��ȣ�� �̿��Ͽ� �켱������ �����־�� ��.
		

	}

}
