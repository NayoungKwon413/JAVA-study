package Test;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * 1. IntStream.rangeClosed �޼��带 �̿��Ͽ� �Էµ� ���ڱ����� ��, ¦���� ��, Ȧ���� ���� ���ϴ� ���α׷� �ۼ��ϱ�
 */
public class Test1 {
	static int sum=0;
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("���ڸ� �Է��ϼ���");
	int num =scan.nextInt();
	System.out.println("�Էµ� ���ڱ����� ��:"+IntStream.rangeClosed(1,num).sum());
	System.out.println("¦���� ��:"+IntStream.rangeClosed(1,num).filter(s->s%2==0).sum());
	System.out.println("Ȧ���� ��:"+IntStream.rangeClosed(1,num).filter(s->s%2==1).sum());
	}
}
