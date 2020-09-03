package chap11;
/*
 * 예외처리
 *   try 블럭 : 예외가 발생할 가능성이 있는 문장들 작성
 *            예외가 발생한 경우 catch 블럭이 실행됨.
 *   catch 블럭 : try 블럭에서 예외가 발생된 경우 호출되는 블럭.
 *              try 블럭과 함께 사용되어야 함. 
 */
public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2/0); //예외 발생 -> 즉시 정상적 수행 멈추고 예외처리-> 예외를 catch 구문으로 전달, 처리할 문장 출력
			System.out.print(3);
			System.out.print(4);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지 마세요");
		}
		System.out.println(5);

	}

}
