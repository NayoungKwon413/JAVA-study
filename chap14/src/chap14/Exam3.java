package chap14;

import java.util.TreeSet;

/*
 * TreeSet ����
 *  Lotto ��ȣ�� TreeSet�� �̿��� ����ϱ�
 *  1~45 ������ ������ ���ڸ� �ߺ����� 6�� ã�Ƽ� �����Ͽ� ����ϱ�
 */
public class Exam3 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		while(true) {
			set.add((int)(Math.random()*45+1));
			if(set.size()==6)break;
		}
		System.out.println(set);

	}

}
