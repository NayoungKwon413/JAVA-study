package chap8;
/*
 * super() : 부모클래스의 생성자 호출
 *           부모클래스의 생성자에 맞도록 호출해야 함.
 *           부모클래스의 super(매개변수없음) 생성자가 존재하면 생략 가능
 * super : 부모객체를 참조하는 참조변수. 부모참조변수
 */

class Parent {
	int x = 10;
	Parent(int x) {
		this.x = x;
	}
}
class Child extends Parent {
	int x = 20;
	Child() {
		super(100);  //부모클래스의 생성자 호출
	}
	void method() {
		int x = 30;
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);
		System.out.println("super.x= " + super.x);
	}
}

public class SuperEx1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();

	}

}
