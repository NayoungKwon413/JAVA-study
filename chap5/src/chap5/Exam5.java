package chap5;
/*
 * 1~100���� ¦���� �� ���ϱ�
 * 
 */
public class Exam5 {

	public static void main(String[] args) {
		System.out.println("1~100���� ¦���� �� ���ϱ�");
		int sum = 0;
		int i = 2;
		for(i=2; i<=100; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1���� 100������ ¦���� �� = " + sum);
		sum = 0;
		for(i=1; i<=100; i+=2) {
			sum += i;
		}
		System.out.println("1���� 100������ Ȧ���� �� = " + sum);

	}

}
