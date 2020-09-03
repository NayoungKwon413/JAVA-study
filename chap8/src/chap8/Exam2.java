package chap8;
/*
 * 자손타입의 객체는 부모타입의 참조변수로 참조가 가능하다.
 * 부모타입의 객체는 자손타입의 참조변수로 참조 시 Runtime(실행) 오류가 발생한다.
 *   => ClassCasteException 예외가 발생됨.
 */
class Parent2 {
	int x = 10;
	void method() {
		System.out.println("Parent2의 메서드");
	}
}
class Child2 extends Parent2 {
	int x = 20;
	void method() {
		System.out.println("Child2의 메서드");
		System.out.println(this.x);  //20 : 오버라이딩 된 메서드 기준 변수값
		System.out.println(super.x);  //10 : 슈퍼클래스 기준 값
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Parent2 p = new Child2();
		Child2 c;		
		c=(Child2)p;		
		System.out.println(p.x); //10
		System.out.println(c.x); //20
		p.method();   //Child2의 메서드
		c.method();   //Child2의 메서드
		
	}

}
