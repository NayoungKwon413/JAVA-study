package chap11;
/*
 * throw : ���� ���� �߻�
 * throws : ���� ó��
 */
public class ExceptionEx6 {
	public static void main(String[] args) {  //Ȥ�� public static void main(String[] args) throws Exception
		try {
		throw new Exception("���� ���� �߻�");
		//1. Exception ��ü ����
		//2. throw �� JVM�� ���� �߻� ����
		} catch(Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
