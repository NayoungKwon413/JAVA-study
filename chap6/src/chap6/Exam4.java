package chap6;

import java.util.Arrays;

/*
 * 1���� 9������ ���� �� �ߺ����� �ʴ� ���� 3���� �����Ͽ� �����Ͽ� ����ϱ�
 * 
 * 123 (o)
 * 158 (o)
 * 112 (x)
 * 
 * 1. 1~9 ������ �迭 ����
 * 2. ���ü��ڸ� ������ �迭 ���� [3]
 * 3. 1~9 �迭 ����
 * 4. ���� �迭���� 3���� ���ڸ� ���õ� �迭�� ����
 * 5. ���õ� �迭�� �����Ͽ� ���
 */
public class Exam4 {

	public static void main(String[] args) {
		//1. 1~9 ������ �迭 ����
		int [] num = new int[9];
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		//2. ���ü��ڸ� ������ �迭 ���� [3]
				int [] select = new int[3];
		//3. 1~9 �迭 ����
		for(int i =0; i<1000; i++) {
			int f = (int)(Math.random() * num.length);
			int t = (int)(Math.random() * num.length);
			int tmp = num[f];
			num[f] = num[t];
			num[t] =tmp;
		}
				
		//4. ���� �迭���� 3���� ���ڸ� ���õ� �迭�� ����
		for(int i=0; i<select.length; i++) {
			select[i] = num[i];
		}
		//5. ���õ� �迭�� �����Ͽ� ���
		/*for(int i=0; i<select.length; i++) {
			for(int j=0; j<select.length-1-i; j++) {
				if(select[j] > select[j+1]) {
					int tmp = select[j];
					select[j] = select[j+1];
					select[j+1] = tmp;
				}
			}
		}*/
		
		Arrays.sort(select); //�迭�� �������ִ� �޼���
		
		for(int s : select) {
			System.out.print(s);
		}

	}

}
