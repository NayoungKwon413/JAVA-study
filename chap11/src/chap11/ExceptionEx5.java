package chap11;
/*
 * throws ���� ó��
 * 
 * �ڹٿ��� ���� ó�� : ���ܸ� �����ϴ� ��
 *   try catch ����
 *   throws ����
 */
public class ExceptionEx5 {
	public static void main(String[] args) {
		try {
			first();
		} catch(Exception e) {
			System.out.println("���ڸ� �����մϴ�.");
			e.printStackTrace();
		}
	}
	private static void first() throws Exception{
		System.out.println("first �޼���");
		second();
	}
	private static void second() throws Exception{
		System.out.println("second �޼���");
		System.out.println(Integer.parseInt("abc"));  //error-> first() �޼���� throws
	}

}
