package chap9;
/*
 * jdk8.0 이후에 인터페이스도 구현부를 가진 메서드를 멤버로 가질 수 있다.
 *    default 메서드 : 인스턴스 멤버
 *       인터페이스는 다중 구현이 가능하므로 구현객체에 똑같은 default 메서드가 존재할 수 있음.
 *       => 구현클래스에서 오버라이딩이 필요함. 
 *    static 메서드 : 클래스 멤버
 */
interface MyInterface1 {
	void method();
	//인스턴스 메서드 -> 사용하기 위해서는 객체화 필요
	default void method1() {
		System.out.println("MyInterface1의 디폴트 메서드 : method1()");
	}
	//클래스 메서드 -> 객체화 필요없이 바로사용가능
	static void staticMethod() {
		System.out.println("MyInterface1의 static 메서드 : staticMethod()");
	}
}
interface MyInterface2 {
	void method();
	default void method1() {
		System.out.println("MyInterface2의 디폴트 메서드 : method1()");
	}
	static void staticMethod() {
		System.out.println("MyInterface2의 static 메서드 : staticMethod()");
	}
}
class Parent {
	public void method2() {
		System.out.println("Parent 클래스의 멤버 메서드 : method2()");
	}
}
class Child extends Parent implements MyInterface1, MyInterface2 {
	//default 메서드를 오버라이딩한것 . 원래는 default 메서드는 오버라이딩 하지 않아도 되지만, 두 인터페이스 내에 같은 이름의 default 메서드가 있는 경우 오버라이딩을 하거나 하나 선택해주어야 함.
	@Override
	public void method1() {   
		MyInterface1.super.method1();
	}

	@Override
	public void method() {
		System.out.println("Child 클래스의 method()");
		System.out.println("MyInterface1, MyInterface2 인터페이스의 추상메서드 method 오버라이딩 함");
	}
	
}
public class DefaultInterfaceEx1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
		c.method2();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
	}

}
