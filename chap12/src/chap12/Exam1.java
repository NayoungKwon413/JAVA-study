package chap12;
/*
 * String Ŭ������ ������ ���ڿ� 
 */
public class Exam1 {
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main : " + str);
		str = change(str);
		System.out.println("change ���� main : " + str);

	}

	private static String change(String str) {
		str +="456";
		System.out.println("change() : " + str);
		return str;
		
	}

}
