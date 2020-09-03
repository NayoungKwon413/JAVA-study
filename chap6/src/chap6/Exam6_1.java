package chap6;

public class Exam6_1 {

	public static void main(String[] args) {
		int arr[][] = {{1}, {10,20}, {30,40,50}, {60,70,80,90}};
		int max = 0;
		//각 행의 열 갯수 중 가장 큰 값을 max 변수에 저장
		 for(int i=0; i<arr.length; i++) {
		     if(max < arr[i].length) {
		        max = arr[i].length;
		     }
		  }
		  int tot[] = new int[max];
		  
		  //행의 합과 열의 합
		  for(int i =0; i<arr.length; i++) {
			  int sum = 0;
			  for(int j=0; j<arr[i].length; j++) {
				  sum += arr[i][j];
				  tot[j] += arr[i][j];
			  }
			  System.out.println(i + "행의합:" + sum);
			  
		  }
		  //열의 합 출력
		  for(int i=0; i<tot.length; i++) {
			  System.out.println(i + "열의합:" +tot[i]);
		  }

	}

}
