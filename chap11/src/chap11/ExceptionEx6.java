package chap11;
/*
 * throw : 예외 강제 발생
 * throws : 예외 처리
 */
public class ExceptionEx6 {
	public static void main(String[] args) {  //혹은 public static void main(String[] args) throws Exception
		try {
		throw new Exception("예외 강제 발생");
		//1. Exception 객체 생성
		//2. throw 로 JVM에 예외 발생 통지
		} catch(Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
