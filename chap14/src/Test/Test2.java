package Test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 1 ~ 99������ ������ �Է¹޾Ƽ� TreeSet�� �����ϰ�, 0 �� �Է��ϸ� �Է��� �����Ѵ�. 
 * �Էµ� ���� �����Ͽ� ����ϱ�.
   1 ~ 99 ������ ���ڰ� �ƴ� ��� TreeSet���� �������� ����.
 * set1 �������� ���ĵǵ��� ���.
 * set2 �������� ���ĵǵ��� ����ϱ�. 
 */
public class Test2 {

	public static void main(String[] args) {
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>(Comparator.reverseOrder());
		Scanner scan = new Scanner(System.in);
		System.out.println("1���� 99������ ���� �Է��ϼ���");
//		set2 = new TreeSet<>(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1;
//			}
//	});
		while(true) {
			int num = scan.nextInt();
			if(num<=0 || num>99)break;
			set1.add(num);
			set2.add(num);
		}
		System.out.println(set1);			
		System.out.println(set2);
	}

}
