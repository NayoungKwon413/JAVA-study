package chap7;
/*
 * ����Լ� ����
 *    ����Լ� : �ڽ��� �Լ��� �ٽ� ȣ���ϴ� �Լ�
 *           => ���� ������ �����ϹǷ� ������.
 */
public class FactorialEx1 {

	public static void main(String[] args) {
		System.out.println("5! = " + factorial(5));  //5*4*3*2*1

	}

	private static int factorial(int i) {
		return (i==1)?1:i*factorial(i-1);
		
	}

}
