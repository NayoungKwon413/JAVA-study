package chap11;
/*
 * 다중 catch 구문
 *   - 하나의 try 블럭에 다양한 예외가 발생할 가능성이 있는 경우 예외별로 다른 처리가 가능하게 함.
 *   - 예외 클래스의 역순으로 다중 catch 구문 작성해야 함.(하위 -> 상위)
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
			System.out.println(Integer.parseInt(args[0]));  //NumberFormatException
			System.out.println(10/Integer.parseInt(args[0]));  //ArithmeticException
			String str = null;
			System.out.println(str.charAt(0));  //NullPointerException
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Command 라인에 파라미터를 입력하세요");
		}catch(NumberFormatException e) {
			System.out.println("Command 라인에 숫자를 입력하세요");
		}catch(ArithmeticException e) {
			System.out.println("Command 라인에 0을 입력하지 마세요");
		}catch(Exception e) {
			System.out.println("전산부로 연락주세요");
		}
		

	}

}
