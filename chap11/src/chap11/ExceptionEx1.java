package chap11;
/*
 * ����ó��
 *   try �� : ���ܰ� �߻��� ���ɼ��� �ִ� ����� �ۼ�
 *            ���ܰ� �߻��� ��� catch ���� �����.
 *   catch �� : try ������ ���ܰ� �߻��� ��� ȣ��Ǵ� ��.
 *              try ���� �Բ� ���Ǿ�� ��. 
 */
public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2/0); //���� �߻� -> ��� ������ ���� ���߰� ����ó��-> ���ܸ� catch �������� ����, ó���� ���� ���
			System.out.print(3);
			System.out.print(4);
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ������");
		}
		System.out.println(5);

	}

}
