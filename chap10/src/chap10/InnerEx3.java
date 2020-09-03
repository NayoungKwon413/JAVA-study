package chap10;
/*
 * 내부 클래스 객체에서 사용되는 this
 */
class Outer3 {
	int iv = 10;
	int iv2 = 20;
	class InstanceInner{
		int iv = 100;
		void method1() {
			int iv = 300;
			System.out.println("iv=" + iv);  //가장 가까운 지역변수 iv =300
			System.out.println("iv2=" + iv2); //외부 클래스 멤버 iv2 = 20 -> 외부 클래스 멤버에 접근 가능
			System.out.println("this.iv = " + this.iv); //this.iv = 100 -> 자기참조변수 this : 내부클래스의 객체를 의미
			//외부클래스 iv 값 출력
			System.out.println("Outer3.this.iv = " + Outer3.this.iv); //Outer3.this.iv = 10
			System.out.println("Outer3.this.iv2 = " + Outer3.this.iv2);
		}
	}
	 static class StaticInner{
		int iv=100;
		static int cv = 200;
		void method1() {
			int iv = 300;
			System.out.println("iv=" + iv);  
			System.out.println("cv=" + cv);
//			System.out.println("iv2=" + iv2);  //iv2 인스턴스 멤버이기 때문에 객체화 필요
			System.out.println("this.iv = " + this.iv); 
			//외부클래스 iv 값 출력
//			System.out.println("Outer3.this.iv = " + Outer3.this.iv); //static은 클래스멤버이기 때문에 Outer3.this 값이 없음
			System.out.println("Outer3.iv=" + new Outer3().iv);
			System.out.println("Outer3.iv2=" + new Outer3().iv2);
	}
}
}
public class InnerEx3 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner oi = out.new InstanceInner();
		oi.method1();
		Outer3.StaticInner os = new Outer3.StaticInner();
		os.method1();
	}

}
