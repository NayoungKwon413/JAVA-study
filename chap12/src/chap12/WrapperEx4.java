package chap12;
/*
 * Character 클래스 예제
 */
public class WrapperEx4 {
	public static void main(String[] args) {
		char[] data = {'A', 'a', '9', '&'};
		for(char c : data) {
			if(Character.isUpperCase(c))  //대문자?
				System.out.println(c + ": 대문자");
			else if(Character.isLowerCase(c))  //소문자?
				System.out.println(c + ": 소문자");
			else if(Character.isDigit(c))  //숫자?
				System.out.println(c+ ": 숫자");
			else
				System.out.println(c + ": 일반 문자");
		}
		Character ch = 'A';  //auto Boxing
		System.out.println("ch.equals('A')=" + ch.equals('A'));
		System.out.println("ch == 'A' :" + (ch == 'A'));  //ch 언박싱
		System.out.println("Character.isAlphabetic('A'):" + Character.isAlphabetic('A'));  //문자?
		System.out.println("Character.isAlphabetic('a'):" + Character.isAlphabetic('a'));
		System.out.println("Character.isAlphabetic('가'):" + Character.isAlphabetic('가'));
		System.out.println("Character.isAlphabetic('&'):" + Character.isAlphabetic('&'));
		System.out.println("Character.isAlphabetic('1'):" + Character.isAlphabetic('1'));  //숫자인지 물어볼 때는 isDigit 사용
	}
}
