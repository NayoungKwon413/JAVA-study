package chap6;
/*
 * 2차원 배열의 행의 합과 열의 합 구하기
 */
public class Exam6 {

	public static void main(String[] args) {
		int arr[][] = {{1}, {10,20}, {30,40,50}, {60,70,80,90}};
		int tot[] = new int[4];
		/*
		 * 각 행의 열 갯수 중 가장 큰 값을 max 변수에 저장
		 * for(int i=0; i<arr.length; i++) {
		 *    if(max < arr[i].length) {
		 *       max = arr[i].length;
		 *    }
		 * }
		 * int tot[] = new int[max];
		 */
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "행의합:");
			
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
				
			}
			System.out.println(sum);
		}
			
			for(int k=0; k<arr.length; k++) {
				System.out.print(k + "열의합:");
				int sum2 =0;
				for(int j=k; j<arr.length; j++) {
					sum2 += arr[j][k];
				}
				System.out.println(sum2);
			}
		
			
			
		
		}
		
		
	}


