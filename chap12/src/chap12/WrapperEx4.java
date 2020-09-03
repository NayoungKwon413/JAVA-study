package chap12;
/*
 * Character Ŭ���� ����
 */
public class WrapperEx4 {
	public static void main(String[] args) {
		char[] data = {'A', 'a', '9', '&'};
		for(char c : data) {
			if(Character.isUpperCase(c))  //�빮��?
				System.out.println(c + ": �빮��");
			else if(Character.isLowerCase(c))  //�ҹ���?
				System.out.println(c + ": �ҹ���");
			else if(Character.isDigit(c))  //����?
				System.out.println(c+ ": ����");
			else
				System.out.println(c + ": �Ϲ� ����");
		}
		Character ch = 'A';  //auto Boxing
		System.out.println("ch.equals('A')=" + ch.equals('A'));
		System.out.println("ch == 'A' :" + (ch == 'A'));  //ch ��ڽ�
		System.out.println("Character.isAlphabetic('A'):" + Character.isAlphabetic('A'));  //����?
		System.out.println("Character.isAlphabetic('a'):" + Character.isAlphabetic('a'));
		System.out.println("Character.isAlphabetic('��'):" + Character.isAlphabetic('��'));
		System.out.println("Character.isAlphabetic('&'):" + Character.isAlphabetic('&'));
		System.out.println("Character.isAlphabetic('1'):" + Character.isAlphabetic('1'));  //�������� ��� ���� isDigit ���
	}
}
