package chap11;
/*
 * ���� ó���� �ι� �ϱ�
 */
public class ExceptionEx7 {
	public static void main(String[] args) throws InterruptedException { //API�� �����Ͽ� ����ó���� �ݵ�� �ʿ��� �޼���� ����ó���ؾ���.
		try {
			badmethod();
		}catch(Exception e) {
			System.out.println("main ���� ���� ó��");
			e.printStackTrace();
		}
		
		Thread.sleep(1000); //1�� ���� ���
		System.out.println("main �޼��� ����");

	}
	private static void badmethod() throws Exception{
		try {
		throw new Exception("���� ���� �߻�");
	}catch(Exception e) {
		System.out.println("badmethod ���� ���� ó��");
		e.printStackTrace();
		throw e;
	}
	}
}
