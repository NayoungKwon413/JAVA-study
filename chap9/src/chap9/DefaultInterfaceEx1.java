package chap9;
/*
 * jdk8.0 ���Ŀ� �������̽��� �����θ� ���� �޼��带 ����� ���� �� �ִ�.
 *    default �޼��� : �ν��Ͻ� ���
 *       �������̽��� ���� ������ �����ϹǷ� ������ü�� �Ȱ��� default �޼��尡 ������ �� ����.
 *       => ����Ŭ�������� �������̵��� �ʿ���. 
 *    static �޼��� : Ŭ���� ���
 */
interface MyInterface1 {
	void method();
	//�ν��Ͻ� �޼��� -> ����ϱ� ���ؼ��� ��üȭ �ʿ�
	default void method1() {
		System.out.println("MyInterface1�� ����Ʈ �޼��� : method1()");
	}
	//Ŭ���� �޼��� -> ��üȭ �ʿ���� �ٷλ�밡��
	static void staticMethod() {
		System.out.println("MyInterface1�� static �޼��� : staticMethod()");
	}
}
interface MyInterface2 {
	void method();
	default void method1() {
		System.out.println("MyInterface2�� ����Ʈ �޼��� : method1()");
	}
	static void staticMethod() {
		System.out.println("MyInterface2�� static �޼��� : staticMethod()");
	}
}
class Parent {
	public void method2() {
		System.out.println("Parent Ŭ������ ��� �޼��� : method2()");
	}
}
class Child extends Parent implements MyInterface1, MyInterface2 {
	//default �޼��带 �������̵��Ѱ� . ������ default �޼���� �������̵� ���� �ʾƵ� ������, �� �������̽� ���� ���� �̸��� default �޼��尡 �ִ� ��� �������̵��� �ϰų� �ϳ� �������־�� ��.
	@Override
	public void method1() {   
		MyInterface1.super.method1();
	}

	@Override
	public void method() {
		System.out.println("Child Ŭ������ method()");
		System.out.println("MyInterface1, MyInterface2 �������̽��� �߻�޼��� method �������̵� ��");
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
