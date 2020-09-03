package chap12;
/*
 * Wrapper 클래스 : 8개의 기본 자료형을 객체화하기 위한 클래스
 *      기본자료형             Wrapper 클래스
 *      boolean         Boolean
 *      byte            Byte
 *      short           Short
 *      int             Integer
 *      long            Long
 *      char            Character
 *      float           Float
 *      double          Double
 *      
 *      기본적으로 기본자료형과 참조자료형은 형변환이 불가함.
 *      단, 예외적으로 기본자료형과 Wrapper 클래스간 형변환이 가능하다(jdk 5.0 이후부터).
 *      기본형 <= 참조형 : auto UnBoxing
 *      참조형 <= 기본형 : auto Boxing
 */
public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println("i1==i2 : " + (i1==i2));  //false : 다른 객체이기 때문
		System.out.println("i1.equals(i2) : " + (i1.equals(i2)));  //true : 값의 내용을 비교
		System.out.println("i1==100 : " + (i1==100));  //true : i1 기본형으로 자동형변환 되기 때문(언박싱)
		int i3 = 100;
		System.out.println("i1==i3 : " + (i1==i3)); //true : 언박싱
		Integer i4 = 100;  //auto boxing
		System.out.println("i1==i4 : " + (i1==i4));  //false : i4 Wrapper클래스의 객체로 박싱되었기 때문에 서로 다른 객체로 인식
		//int 형의 정보
		System.out.println("int 형의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("int 형의 최소값 : " + Integer.MIN_VALUE);
		System.out.println("int 형의 bit수 : " + Integer.SIZE);
		//byte 형의 정보
		System.out.println("byte 형의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("byte 형의 최소값 : " + Byte.MIN_VALUE);
		System.out.println("byte 형의 bit수 : " + Byte.SIZE);
		//정수형 문자열을 int로 변환
		int num = Integer.parseInt("123");
		System.out.println(num+100);
		//10진수를 2, 8, 16진수로 변환
		System.out.println("10의 2진수 : " + Integer.toBinaryString(10));
		System.out.println("10의 8진수 : " + Integer.toOctalString(10));
		System.out.println("255의 16진수 : " + Integer.toHexString(255));

	}
}
