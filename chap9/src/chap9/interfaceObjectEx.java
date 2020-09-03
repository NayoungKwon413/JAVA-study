package chap9;
/*
 * 인터페이스의 객체 생성하기
 */
interface Action {
	void action();
}
abstract class Abs {
	abstract void method();
}
public class interfaceObjectEx {
	public static void main(String[] args) {
		//(구현클래스가 없이 오버라이딩 되기 때문)이름없는 내부 클래스 => 일회성 객체로 생성
		Action a = new Action() {
			@Override
			public void action() {
				System.out.println("인터페이스 객체 1");
			}
			
		};
		a.action();
		a = new Action() {
			@Override
			public void action() {
				System.out.println("인터페이스 객체 2");
			}
			
		};
		a.action();
		
		Abs ab = new Abs() {
			@Override
			void method() {
				System.out.println("method() 메서드 오버라이딩");
				
			}
			
		};
		ab.method();
	 
		//jdk8.0 이후 인터페이스를 람다방식으로 처리하기 : 인터페이스만 가능(추상클래스는 x)
		a=() -> System.out.println("인터페이스를 람다식으로 처리");
		a.action();
	}

}
