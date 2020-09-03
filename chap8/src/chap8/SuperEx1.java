package chap8;
/*
 * super() : �θ�Ŭ������ ������ ȣ��
 *           �θ�Ŭ������ �����ڿ� �µ��� ȣ���ؾ� ��.
 *           �θ�Ŭ������ super(�Ű���������) �����ڰ� �����ϸ� ���� ����
 * super : �θ�ü�� �����ϴ� ��������. �θ���������
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
		super(100);  //�θ�Ŭ������ ������ ȣ��
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
