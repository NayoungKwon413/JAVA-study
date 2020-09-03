package chap6;
/*
 * 1부터 100까지 임의의 수 10개를  배열에 저장하고, 정렬하여 출력하기
 * 
 *   1. 배열 선언 및 생성
 *   2. 임의의 수 10개를 배열에 저장
 *   3. 정렬
 *   4. 출력 
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