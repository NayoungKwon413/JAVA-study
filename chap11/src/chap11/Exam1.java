package chap11;

import java.util.Scanner;

/*
 * ȭ�鿡�� 1���� 10������ ���ڸ� �Է¹޾Ƽ� ���ڸ�ŭ *�� ���η� ����ϱ�
 * �� 99 ���ڰ� �ԷµǸ� �Է� ����
 * �Է°��� ���ڰ� �ƴ� ���, "���ڸ� �Է��ϼ���" �޼��� ��� �� �ٽ� �Է¹޵��� ����
 * �Էµ� ���ڰ� 1~10���̰� �ƴ� ��� NumberMismatchException �� ���� -> get.message "1���� 10������ ���ڸ� �Է��ϼ���"
 */
class NumberMismatchException extends Exception {
	NumberMismatchException(String i){
		super(i);
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1���� 10������ ���ڸ� �Է��ϼ���(����:99)");
		//int num=0;
		while(true) {
			try {
		      int num = scan.nextInt();	
		    if(num==99) {
			break;
	   } else if (num<1 || num > 10) {
			throw new NumberMismatchException("1���� 10������ ���ڸ� �Է��ϼ���");
		    }
		   System.out.print(num + ":");
		   for(int i=1; i<=num; i++) {
			   System.out.print("*");
		    }
		System.out.println();
			} catch(NumberMismatchException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println(scan.next() + "��(��) ���ڰ� �ƴմϴ�. ���ڸ� �Է��ϼ���");
				continue;
			}
		}
		System.out.println("���α׷� ����");
	}

}
