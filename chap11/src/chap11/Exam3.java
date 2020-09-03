package chap11;
/*
 * UnsupportFunctionException 클래스 구현하기
 * 1. 멤버변수: private final int ERR_CODE;
 * 2. 멤버메서드 : 
 *    public int getErrCode() : return ERR_CODE;
 *    public String getMessage() : 오버라이드 해서 상속받은 getMessage()와 ERR_CODE 같이 return 할것.
 * 3. 예외처리 안해도 되게 구현
 * 4. 생성자는 구동클래스에 맞게 구현
 *    
 */
class UnsupportFunctionException extends RuntimeException{
	private final int ERR_CODE;
	public int getErrCode() {
		return ERR_CODE;
	}
	UnsupportFunctionException(String s, int i){
		super(s);
		ERR_CODE = i;
	}
	@Override
	public String getMessage() {
		return super.getMessage() + ", 오류코드:" + ERR_CODE;
	}
	
}
public class Exam3 {
	public static void main(String[] args) {
		try {
			throw new UnsupportFunctionException("지원하지 않는 기능입니다.", 200);
		}catch(UnsupportFunctionException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrCode());
		}

	}

}
