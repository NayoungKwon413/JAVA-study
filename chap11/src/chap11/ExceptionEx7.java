package chap11;
/*
 * 예외 처리를 두번 하기
 */
public class ExceptionEx7 {
	public static void main(String[] args) throws InterruptedException { //API를 참고하여 예외처리가 반드시 필요한 메서드는 예외처리해야함.
		try {
			badmethod();
		}catch(Exception e) {
			System.out.println("main 에서 예외 처리");
			e.printStackTrace();
		}
		
		Thread.sleep(1000); //1초 동안 대기
		System.out.println("main 메서드 종료");

	}
	private static void badmethod() throws Exception{
		try {
		throw new Exception("예외 강제 발생");
	}catch(Exception e) {
		System.out.println("badmethod 에서 예외 처리");
		e.printStackTrace();
		throw e;
	}
	}
}
