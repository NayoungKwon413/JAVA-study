package Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
 * ���� ����� �������� ���α׷��� �ۼ��Ͻÿ�
 1 ~ 1000�������� ��ȣ�� ������ ������ �ִ�.
 1�� 1��, 2�� 2��, 3�� 3�� �� ��÷�ϴ� ���α׷� �ۼ��ϱ�
  �� ��÷�� 3����� ��÷�ϰ�, ��÷��ȣ�� �ߺ��Ǹ� �ȵȴ�.
  ��÷�� ��ȣ�� ������ ���̹Ƿ� ���� ���� ���� �Ҷ� ���� �ٸ���.
  
  LinkedHashSet : ��������, �ߺ��Ұ�
  Random
  new ArrayList(Set) : Set ��ü�� List��ü�� ����
  
 [���]
3�� ���� ��÷�մϴ�.
945
123
6
2�� ���� ��÷�մϴ�.
611
404
1�� ���� ��÷�մϴ�.
797

*** ���� ��÷ ��� ***
1��:797,
2��:404,611,
3��:6,123,945,  
 */
public class Test3 {
	public static void main(String[] args) {
		Set<Integer> lotto = new LinkedHashSet<>();
		Random balls = new Random();
		balls.setSeed(System.currentTimeMillis());
		while(lotto.size()<6) {
			lotto.add(balls.nextInt(1000)+1);
		}
		System.out.println(lotto);
		List<Integer> list = new ArrayList<>(lotto);
		List<Integer> list_3rd = new ArrayList<Integer>(list.subList(0, 3));
		List<Integer> list_2nd = new ArrayList<Integer>(list.subList(3, 5));
		List<Integer> list_1st = new ArrayList<Integer>(list.subList(5, 6));
		System.out.println("3�� ������ ��÷�մϴ�.");
		System.out.println(list_3rd);
		System.out.println("2�� ������ ��÷�մϴ�.");
		System.out.println(list_2nd);
		System.out.println("1�� ������ ��÷�մϴ�.");
		System.out.println(list_1st);
		System.out.println("*** ���� ��÷ ��� ***");
		System.out.println("1��:"+ list_1st);
		System.out.println("2��:"+ list_2nd);
		System.out.println("3��:"+ list_3rd);
	}

}
