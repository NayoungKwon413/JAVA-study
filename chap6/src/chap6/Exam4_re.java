package chap6;
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
public class Exam4_re {
	public static void main(String[] args) {
		int [] arr = new int [9];
		for(int i=0; i<arr.length; i++) {
			arr[i] += i+1;
		}
		int [] select = new int [3];
		for(int i=0; i<100; i++) {
			int x = (int)(Math.random()*arr.length);
			int y = (int)(Math.random()*arr.length);
			int tmp = arr[x];
			arr[x] = arr[y];
			arr[y]=tmp;
		}
		for(int i=0; i<select.length; i++) {
			select[i] = arr[i];
		}
		for(int i=0; i<select.length-1; i++) {
			for(int j=i+1; j<select.length; j++) {
				if(select[i]>select[j]) {
					int tmp=select[i];
					select[i]=select[j];
					select[j]=tmp;
				}
			}
		}
		for(int s : select) {
			System.out.print(s);
		}


	}

}
