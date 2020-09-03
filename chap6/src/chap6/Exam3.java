package chap6;
/*
 * Math.random 메서드를 이용하여 1부터 10까지의 임의의 수를 배열에 10개에 저장하기.
 * 배열에 저장된 수 만큼 * 출력하기
 * 
 * arr = {3, 5, 1, ...}
 * 3: ***
 * 5: *****
 * 1: *
 * ...
 * 
 * 1. 배열 선언
 * 2. Math.random()로 임의의 수 (1~10)를 생성. 생성값을 배열에 저장 -> 10번 반복
 *    arr[i] = (int)(Math.random * 10) +1
 * 3. 배열의 값만큼 * 출력 -> 배열의 값만큼 반복(->중첩반복사용)
 *    1~ arr[i] 만큼 * 출력
 */
public class Exam3 {

	public static void main(String[] args) {
		//1. 배열 선언
		int [] num = new int [10];
		//2. Math.random()로 임의의 수 (1~10)를 생성. 생성값을 배열에 저장 -> 10번 반복
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
