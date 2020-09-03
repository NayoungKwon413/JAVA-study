package chap10;
/*
 * 외부 클래스와 내부 클래스의 상호 호출
 */
class Outer2{
	private int outeriv = 10;
	private static int outercv=20;
	class InstanceInner{
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner{
//		int siv = outeriv; //클래스 멤버에서 인스턴스 멤버 호출 시 객체화 필요
//		int siv = new Outer2().outeriv;
		static int scv = outercv;
	}
	static StaticInner cv = new StaticInner();
	InstanceInner iv = new InstanceInner();
//	static InstanceInner cv2 = new InstanceInner();  //cv2는 static 멤버. 
	static InstanceInner cv2 = new Outer2().new InstanceInner();
	StaticInner iv2 = new StaticInner();
	
	void method(final int pv) {
//		pv++;
		final int num=100;
//		num++;
		class LocalInner{  //지역 내부 클래스
			int liv = outeriv;  //외부 클래스의 private 멤버 접근 가능 -> Outer2 클래스의 같은 멤버
			int liv2 = outercv;
			void method() {
				//지역내부클래스에서 외부 메서드의 지역변수를 사용 시, 해당 지역변수는 상수화 되어야 한다.
				System.out.println("pv=" + pv);  
				System.out.println("num=" + num);
				System.out.println("liv="+ liv);
				System.out.println("outeriv=" +outeriv);
			}
		}
		LocalInner li = new LocalInner();
		li.method();
	}
}
public class InnerEx2 {
	public static void main(String[] args) {
		//InstanceInner 클래스를 객체화, 멤버값을 화면에 출력
		Outer2 out2 = new Outer2();
		Outer2.InstanceInner oi = out2.new InstanceInner();
		System.out.println(oi.iiv);
		System.out.println(oi.iiv2);
		//StaticInner 클래스를 객체화, 멤버값을 화면에 출력
		Outer2.StaticInner os = new Outer2.StaticInner();
		System.out.println(os.scv);
		System.out.println(Outer2.StaticInner.scv);
		//method() 호출하기
		out2.method(100);
	}

}
