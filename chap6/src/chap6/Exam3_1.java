package chap6;

public class Exam3_1 {

	public static void main(String[] args) {
		//1. �迭 ����
		int [] num = new int [10];
		//2. Math.random()�� ������ �� (1~10)�� ����. �������� �迭�� ���� -> 10�� �ݺ�
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 10) +1;
			
		}
	    //3. �迭�� ����ŭ * ��� -> �迭�� ����ŭ �ݺ�
		for(int i : num) {
			System.out.print(i + ": ");
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}