package Test;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 *  ȭ�鿡�� �������� �ڿ����� �Է¹޾� �̵� �� Ȧ�� �� �ڿ������� ��� ���
 �� ���� ���ϰ�, Ȧ���� �ִ밪�� �ּҰ��� ã�� ���α׷��� �ۼ��ϱ�
 Ȧ�� ��θ� �̷���� List ��ü�� �����Ͽ� ����ϱ�
 �ִ밪 : Collections.max(list)  
 �ּҰ� : Collections.min(list)
 7���� �ڿ��� : 12 77 38 41 53 92 85 �� ���
  77 41 53 85 �� Ȧ�� �̹Ƿ�
  77+41+53+85 = �� 
  Ȧ ���� �ִ밪 : 85
  Ȧ ���� �ּҰ� : 41
  �Էµ� Ȧ�� : [77,41,53,85]
 */
public class Test1_1 {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("�������� �ڿ����� �Է��ϼ���");
		String str = scan1.nextLine();
		Scanner scan2 = new Scanner(str).useDelimiter(" ");
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		while(scan2.hasNextLine()) {
			int num = scan2.nextInt();
			if(num%2==1) {
				list.add(num);
				sum += num;
			}
		}
		System.out.println("�Էµ� Ȧ������ ��:" + sum);
		System.out.println("Ȧ���� �ִ밪:"+Collections.max(list));
		System.out.println("Ȧ���� �ּҰ�:"+Collections.min(list));
		System.out.println("�Էµ� Ȧ��:"+list);
	}

}
