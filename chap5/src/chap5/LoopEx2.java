package chap5;
/*
 * �ݺ����� �̿��Ͽ� 1���� 10������ �� ���ϱ�
 */
public class LoopEx2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		System.out.println("for �������� �հ� ���ϱ�");
		for(i=1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100������ �� : " + sum);
		System.out.println("while �������� �հ� ���ϱ�");
		sum = 0;
		i = 1;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("1~10������ �� : " + sum);
		System.out.println("do while �������� �հ� ���ϱ�");
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		} while(i <= 10);
		System.out.println("1~10������ �� : " + sum);

	}

}
