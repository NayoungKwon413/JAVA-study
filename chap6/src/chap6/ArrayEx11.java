package chap6;
/*
 * 
 */
public class ArrayEx11 {

	public static void main(String[] args) {
		// 1. �����迭 ����
		int [][] arr = new int [10][];
		// 2. �� ���� 1���� �迭 ��ü ����
		for(int i =0; i<arr.length; i++) {
			arr[i] = new int[i + 1];
		}
		//3. ���� ä���
		int data = 0;
		for(int j=9; j>=0; j--) {
			for(int i=j; i < arr.length; i++) {
				arr[i][j] = ++data;
			}
		}
		
		// 4. ��� ���
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
