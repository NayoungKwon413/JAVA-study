package chap5;
/*
 * 1~100까지 짝수의 합 구하기
 * 
 */
public class Exam5 {

	public static void main(String[] args) {
		System.out.println("1~100까지 짝수의 합 구하기");
		int sum = 0;
		int i = 2;
		for(i=2; i<=100; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1부터 100까지의 짝수의 합 = " + sum);
		sum = 0;
		for(i=1; i<=100; i+=2) {
			sum += i;
		}
		System.out.println("1부터 100까지의 홀수의 합 = " + sum);

	}

}
