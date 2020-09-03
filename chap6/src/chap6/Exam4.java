package chap6;

import java.util.Arrays;

/*
 * 1부터 9까지의 숫자 중 중복되지 않는 숫자 3개를 생성하여 정렬하여 출력하기
 * 
 * 123 (o)
 * 158 (o)
 * 112 (x)
 * 
 * 1. 1~9 저장한 배열 생성
 * 2. 선택숫자를 저장할 배열 선언 [3]
 * 3. 1~9 배열 섞기
 * 4. 섞인 배열에서 3개의 숫자를 선택된 배열에 저장
 * 5. 선택된 배열을 정렬하여 출력
 */
public class Exam4 {

	public static void main(String[] args) {
		//1. 1~9 저장한 배열 생성
		int [] num = new int[9];
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		//2. 선택숫자를 저장할 배열 선언 [3]
				int [] select = new int[3];
		//3. 1~9 배열 섞기
		for(int i =0; i<1000; i++) {
			int f = (int)(Math.random() * num.length);
			int t = (int)(Math.random() * num.length);
			int tmp = num[f];
			num[f] = num[t];
			num[t] =tmp;
		}
				
		//4. 섞인 배열에서 3개의 숫자를 선택된 배열에 저장
		for(int i=0; i<select.length; i++) {
			select[i] = num[i];
		}
		//5. 선택된 배열을 정렬하여 출력
		/*for(int i=0; i<select.length; i++) {
			for(int j=0; j<select.length-1-i; j++) {
				if(select[j] > select[j+1]) {
					int tmp = select[j];
					select[j] = select[j+1];
					select[j+1] = tmp;
				}
			}
		}*/
		
		Arrays.sort(select); //배열을 정렬해주는 메서드
		
		for(int s : select) {
			System.out.print(s);
		}

	}

}
