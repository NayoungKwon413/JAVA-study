package chap6;
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
public class Exam4_re {
	public static void main(String[] args) {
		int [] arr = new int [9];
		for(int i=0; i<arr.length; i++) {
			arr[i] += i+1;
		}
		int [] select = new int [3];
		for(int i=0; i<100; i++) {
			int x = (int)(Math.random()*arr.length);
			int y = (int)(Math.random()*arr.length);
			int tmp = arr[x];
			arr[x] = arr[y];
			arr[y]=tmp;
		}
		for(int i=0; i<select.length; i++) {
			select[i] = arr[i];
		}
		for(int i=0; i<select.length-1; i++) {
			for(int j=i+1; j<select.length; j++) {
				if(select[i]>select[j]) {
					int tmp=select[i];
					select[i]=select[j];
					select[j]=tmp;
				}
			}
		}
		for(int s : select) {
			System.out.print(s);
		}


	}

}
