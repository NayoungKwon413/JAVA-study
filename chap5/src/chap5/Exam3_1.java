package chap5;
/*
 * ���� ���ϱ�
 *   ������ 4�� ����̰�, 100�� ����� ���� ���. ��, 400�� ����� ����.
 *   �� �ܴ� ���
 *   �⵵�� �Է¹޾Ƽ� �������� ������� ����ϱ�
 */
import java.util.Scanner;

public class Exam3_1 {

	public static void main(String[] args) {
		System.out.println("�⵵�� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if(year%4==0) {
			if(year%100==0 && year%400!=0) {
				System.out.println("���");
			}else {
				System.out.println("����");
			}
			
		}else {
			System.out.println("���");
		}

	}

}
