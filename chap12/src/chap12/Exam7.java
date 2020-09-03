package chap12;

import java.util.Calendar;
import java.util.Scanner;

/*
 * �⵵�� ���� �Է¹޾� �޷��� �ϼ��ϼ���
 * �⵵�� �Է��ϼ���
 * 
 * ���� �Է��ϼ���
 * 
 * 1. ���� 1���� ������ ���ϰ� ��������¥�� ����
 * 2. for(i=1; i<=6; i++){
 *      for(j=1; j<=7; j++){
 *          if(��¥> ���� ������ ��¥) break;
 *          if(i==1 && j<1���� ����) �������
 *          else ��¥ ��� + ��¥ 1�� ����
 *    }
 *    system.out.println();
 * }
 */
public class Exam7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���");
		int year = scan.nextInt();
		System.out.println("���� �Է��ϼ���");
		int month = scan.nextInt();
		Calendar cal = Calendar.getInstance();
		System.out.println("\t" + year + "��" + month + "��");
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n","��,��,ȭ,��,��,��,��".split(","));
		int date=1;
		cal.set(year, month-1, date);
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=7; j++) {
				if(date>cal.getActualMaximum(Calendar.DATE)) break;
				if(i==1 && j<cal.get(Calendar.DAY_OF_WEEK)) {
					System.out.printf("%3s"," ");
				
				}else {
					System.out.printf("%3d",date++);
				    }

			}
			if(date>cal.getActualMaximum(Calendar.DATE)) break;
			System.out.println();
		}
		/*
		 * int firstw
		 * int lastday
		 * for(int i=1, day=1; day<=lastday; i++){
		 *    if(i<firstw) System.out.printf("%3d"," ");
		 *    else System.out.printf("%3d",day++);
		 *    if(i%7==0) System.out.println();
		 * }
		 */
	}
}
