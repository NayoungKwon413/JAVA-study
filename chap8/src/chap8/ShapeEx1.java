package chap8;
/*
 * 추상클래스 예제
 * 
 * 추상클래스
 *   1. 추상메서드를 가질 수 있는 클래스. abstract 예약어를 이용하여 구현함.
 *   2. 객체화 불가. new를 사용하여 객체화 불가능. -> 객체화는 반드시 상속을 통해서 자손 클래스의 객체화로 객체화가 가능함.
 *   3. 추상클래스의 자손클래스는 추상메서드를 반드시 오버라이딩 해야함.
 *   4. 그외는 일반 클래스와 동일함. 생성자, 멤버변수, 멤버 메서드, 초기화블럭, 상속 등 사용가능
 *   5. 업무의 표준화를 담당.
 *   6. 추상클래스 간의 상속도 가능함 => 부모-자손클래스가 모두 추상클래스인 경우, 자손클래스 부모클래스의 추상메서드 오버라이딩 안해도 됨.
 *                           => 그러나 객체화는 반드시 상속을 통해서 해야 하므로 , 그 다음 자손클래스가 일반클래스인 경우 조부모, 부모 클래스의 추상메서드를 모두 오버라이딩 해야함.
 *   
 * 추상메서드 : 선언부만 존재하는 메서드. 구현부 없음
 *   => 자손클래스에서 반드시 오버라이딩 필요함.
 */
abstract class Shape {
	String type;
	Shape(String type) {
		this.type=type;
	}
	abstract double area();   //추상메서드 => 자손클래스에서 강제로 오버라이딩 해야함.
	abstract double length(); //추상메서드
}
class Circle extends Shape{
	int r;
	Circle(int r) {
		super("원");
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
		super("사각형");
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
			System.out.println(s.type + "= 넓이: " + s.area() + ", 둘레: " + s.length());
		}

	}

}
