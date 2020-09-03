package chap8;
/*
 * final 변경 불가
 * final method : 재정의 불가. 오버라이딩 불가 메서드
 */
public class FinalMethod {
	protected final void finalMethod() {
		System.out.println("finalMethod 오버라이딩 불가 메서드");
	}

}
class SubMethod extends FinalMethod {
	@Override
	protected void finalMethod() {
		System.out.println("finalMethod 오버라이딩 불가 메서드");
}
}
