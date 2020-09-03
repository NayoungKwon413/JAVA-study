package chap18;
/*
 * LambdaInterface3 을 이용하여 입력된 숫자까지의 합을 구하기
 */
public class Exam1 {
	public static void main(String[] args) {
		LambdaInterface3 f3=(x)->{
			int sum=0;
			for(int i=1; i<=x; i++) {
				sum +=i;
			}
			System.out.println(sum);
		};
		f3.method(10);
		f3.method(100);
	}
}
