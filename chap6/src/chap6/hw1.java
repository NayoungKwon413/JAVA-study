package chap6;
/*
 * 1���� 100���� ������ �� 10����  �迭�� �����ϰ�, �����Ͽ� ����ϱ�
 * 
 *   1. �迭 ���� �� ����
 *   2. ������ �� 10���� �迭�� ����
 *   3. ����
 *   4. ��� 
 */
public class hw1 {

	public static void main(String[] args) {
		int [] num = new int[100];
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;	
		}
		
		int [] arr = new int[10];
		for(int i=0; i<num.length; i++) {
			int f = (int)(Math.random() * num.length);
			int t = (int)(Math.random() * num.length);
			int tmp = num[f];
			num[f] = num[t];
			num[t] =tmp;
		}
		for(int i=0; i<arr.length; i++) {
			arr[i] = num[i];
			
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int a : arr) {
			System.out.print(" "+a +" ");

	}

	}
}