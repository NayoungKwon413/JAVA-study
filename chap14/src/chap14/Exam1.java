package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * ȭ�鿡�� Ȧ������ ���ڸ� �Է¹޾Ƽ� �Է¹��� ������ ��հ� �߰��� ����ϱ�
 * 
 * 10 40 30 60 30
 * 
 * ���� -> 10 30 30 40 60 
 * �߰��� : 30
 * ��� : ��/����
 * Collections.sort(list);
		System.out.println("�߰���:"+ list.get(list.size()/2));
 */
public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ȧ������ ���ڸ� �Է��ϼ���(����:999)");
		List<Integer> list = new ArrayList<Integer>();
		int sum=0;
		while(true) {
			int num = scan.nextInt();
			if(num==999) break;
			list.add(num);
			sum += num;
		}
		//¦���� �Է� �� ������ �Էµ� ���ڸ� �����ϱ�
		if(list.size()%2==0) list.remove(list.size()-1);
		System.out.println("�Է� ������:"+list);
		System.out.println("�Է� ������ ��:" +sum);
		Collections.sort(list);
		System.out.println("���ĵ� ������:" + list);
		System.out.println("�Է� ������ �߰���:"+list.get(list.size()/2));
		System.out.println("�Է� ������ ��հ�:"+(sum/list.size()));

	}

}
