package chap6;

public class Exam3_1 {

	public static void main(String[] args) {
		//1. 배열 선언
		int [] num = new int [10];
		//2. Math.random()로 임의의 수 (1~10)를 생성. 생성값을 배열에 저장 -> 10번 반복
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 10) +1;
			
		}
	    //3. 배열의 값만큼 * 출력 -> 배열의 값만큼 반복
		for(int i : num) {
			System.out.print(i + ": ");
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}