package chap6;
/*
 * 2���� �迭�� ���� �հ� ���� �� ���ϱ�
 */
public class Exam6 {

	public static void main(String[] args) {
		int arr[][] = {{1}, {10,20}, {30,40,50}, {60,70,80,90}};
		int tot[] = new int[4];
		/*
		 * �� ���� �� ���� �� ���� ū ���� max ������ ����
		 * for(int i=0; i<arr.length; i++) {
		 *    if(max < arr[i].length) {
		 *       max = arr[i].length;
		 *    }
		 * }
		 * int tot[] = new int[max];
		 */
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "������:");
			
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
				
			}
			System.out.println(sum);
		}
			
			for(int k=0; k<arr.length; k++) {
				System.out.print(k + "������:");
				int sum2 =0;
				for(int j=k; j<arr.length; j++) {
					sum2 += arr[j][k];
				}
				System.out.println(sum2);
			}
		
			
			
		
		}
		
		
	}


