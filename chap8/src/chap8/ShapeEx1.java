package chap8;
/*
 * �߻�Ŭ���� ����
 * 
 * �߻�Ŭ����
 *   1. �߻�޼��带 ���� �� �ִ� Ŭ����. abstract ���� �̿��Ͽ� ������.
 *   2. ��üȭ �Ұ�. new�� ����Ͽ� ��üȭ �Ұ���. -> ��üȭ�� �ݵ�� ����� ���ؼ� �ڼ� Ŭ������ ��üȭ�� ��üȭ�� ������.
 *   3. �߻�Ŭ������ �ڼ�Ŭ������ �߻�޼��带 �ݵ�� �������̵� �ؾ���.
 *   4. �׿ܴ� �Ϲ� Ŭ������ ������. ������, �������, ��� �޼���, �ʱ�ȭ��, ��� �� ��밡��
 *   5. ������ ǥ��ȭ�� ���.
 *   6. �߻�Ŭ���� ���� ��ӵ� ������ => �θ�-�ڼ�Ŭ������ ��� �߻�Ŭ������ ���, �ڼ�Ŭ���� �θ�Ŭ������ �߻�޼��� �������̵� ���ص� ��.
 *                           => �׷��� ��üȭ�� �ݵ�� ����� ���ؼ� �ؾ� �ϹǷ� , �� ���� �ڼ�Ŭ������ �Ϲ�Ŭ������ ��� ���θ�, �θ� Ŭ������ �߻�޼��带 ��� �������̵� �ؾ���.
 *   
 * �߻�޼��� : ����θ� �����ϴ� �޼���. ������ ����
 *   => �ڼ�Ŭ�������� �ݵ�� �������̵� �ʿ���.
 */
abstract class Shape {
	String type;
	Shape(String type) {
		this.type=type;
	}
	abstract double area();   //�߻�޼��� => �ڼ�Ŭ�������� ������ �������̵� �ؾ���.
	abstract double length(); //�߻�޼���
}
class Circle extends Shape{
	int r;
	Circle(int r) {
		super("��");
		this.r=r;
	}

	@Override
	double area() {
		return r*r*3.14;
	}

	@Override
	double length() {
		return 2*r*3.14;
	}
	
}
class Rectangle extends Shape{
	int width, height;
	Rectangle(int width, int height) {
		super("�簢��");
		this.width=width;
		this.height=height;
	}
	@Override
	double area() {
		return width*height;
	}
	@Override
	double length() {
		return (width + height) *2;
	}
	
}
public class ShapeEx1 {
	public static void main(String[] args) {
		Shape [] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(10, 10);
		for(Shape s : shapes) {
			System.out.println(s.type + "= ����: " + s.area() + ", �ѷ�: " + s.length());
		}

	}

}
