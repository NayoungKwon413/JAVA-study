package chap11;
/*
 * 자바에서 예외 처리는 필수.
 *  단 RuntimeException 예외는 예외처리를 생략할 수 있음.
 *  => 예외는 RuntimeException 과 그외 Exception으로 나눈다.
 *  => RuntimeException 클래스의 하위 클래스도 예외처리 생략가능.
 */
public class Exam2 {
	public static void main(String[] args) {
		throw new RuntimeException("예외 강제 발생"); //예외 처리 없이 컴파일오류 없애기

	}
}
