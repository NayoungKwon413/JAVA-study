package chap6;
/*
 * Math.random �޼��带 �̿��Ͽ� 1���� 10������ ������ ���� �迭�� 10���� �����ϱ�.
 * �迭�� ����� �� ��ŭ * ����ϱ�
 * 
 * arr = {3, 5, 1, ...}
 * 3: ***
 * 5: *****
 * 1: *
 * ...
 * 
 * 1. �迭 ����
 * 2. Math.random()�� ������ �� (1~10)�� ����. �������� �迭�� ���� -> 10�� �ݺ�
 *    arr[i] = (int)(Math.random * 10) +1
 * 3. �迭�� ����ŭ * ��� -> �迭�� ����ŭ �ݺ�(->��ø�ݺ����)
 *    1~ arr[i] ��ŭ * ���
 */
public class Exam3 {

	public static void main(String[] args) {
		//1. �迭 ����
		int [] num = new int [10];
		//2. Math.random()�� ������ �� (1~10)�� ����. �������� �迭�� ���� -> 10�� �ݺ�
		for(int i=0; i<num.length; i++) {
		
			num[i] = (int)(Math.random() * 10) +1;
			System.out.print(num[i] + ": ");
			
			for(int j =1; j<=num[i]; j++) {
				System.out.print('*');
				
			}
			System.out.println();
		}
	
		

	}

}
