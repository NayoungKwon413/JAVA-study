package chap12;
/*
 * String Ŭ������ �ֿ� �޼���
 */
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println(s.charAt(4));  //s.charAt(4) : 4�� �ε���(0���� �����ؼ� 5��°) ���� ���� -> E
		System.out.println(s.compareTo("abc"));  //s.compareTo("abc") : 'A'-'a' :-32 => ���Ľ� ���Ǵ� �޼���
		System.out.println(s.compareToIgnoreCase("abcdefgh"));  //IgnoreCase : ��ҹ��� ������� =>0
		System.out.println(s.concat("abc"));  //s.concat("abc") : s+"abc"
		System.out.println(s.endsWith("GH")); //s.endsWith("GH") : s���ڿ��� "GH" ���ڿ��� �����ϳ�? => true
		System.out.println(s.startsWith("AB"));  //s.startsWith("AB") : s���ڿ��� "AB" ���ڿ��� �����ϴ�? => true
		System.out.println(s.equalsIgnoreCase("abcdefgh")); //s.equalsIgnoreCase("abcdefgh") : ��ҹ��� ������� ����? => true
		s = new String("This is a String"); 
		System.out.println(s.indexOf('i'));  //s.indexOf('i') : s���ڿ����� 'i' ������ �ε��� ����
		System.out.println(s.indexOf('i',5));  //s.indexOf('i',5) : s���ڿ����� 5�� �ε������� �����ϴ� 'i' ������ �ε��� ����=>5
		System.out.println(s.indexOf('i',15)); //s.indexOf('i',15) : s���ڿ����� 15�� �ε������� �����ϴ� 'i' ������ �ε��� ����=>-1(:�ش� ���� ã�� �� ����)
		System.out.println(s.indexOf("is"));  //s.indexOf("is") : s���ڿ����� "is" ���ڿ��� �ε��� ����
		System.out.println(s.indexOf("is",5));
		System.out.println(s.lastIndexOf("is"));  //s.lastIndexOf("is") : �ڿ������� "is" ���ڿ��� �ε��� ����. ��, �ε��� ó�� 0���� ī��Ʈ
		System.out.println(s.length()); //s.length() : s���ڿ��� ���� => 16
		System.out.println(s.replace("is", "QR")); //s.replace("is", "QR"):"is"�� ��� "QR" �� ġȯ
		System.out.println(s.substring(5));  //substring: �κ� ���ڿ� -> 5�� �ε��� ���ĸ� �κ� ���ڿ��� ���� => is a String
		System.out.println(s.substring(5,13));  //s.substring(5,13) : 5�� �ε��� ���� 13�� �ε��� �ձ��� ��, 12�� �ε������� => is a Str
		System.out.println(s.toLowerCase());  //s.toLowerCase(): ���ڿ��� �ҹ��ڷ� ���� �� ����
		System.out.println(s.toUpperCase());  //s.toUpperCase() : ���ڿ��� �빮�ڷ� ���� �� ���� 
		System.out.println("       ���ڿ� trim �޼���            ".trim());  //"���ڿ�".trim() : ������ ������ ���� ��, �߰� ������ ���� �Ұ�
	}

}
