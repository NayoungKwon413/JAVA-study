package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * ArrayList 클래스는 Object 클래스의 하위 클래스임.
 * ArrayList 객체는 객체를 여러 개 저장할 수 있는 객체임.
 */
abstract class Shape implements Comparable<Shape>{
	int x, y;
	Shape() {
		this(0,0);
	}
	Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	abstract double area();
	abstract double length();
	public String getLocation() {
		return "x:" + x + ", y:" +y;
	}
	//넓이 기준으로 정렬
	@Override
	public int compareTo(Shape o) {  //오버라이드이므로 선언부는 변경할 수 없음.
		return (int)(area() - o.area());  //형변환 필요
	}
}
class Circle extends Shape{
	double r;
	Circle() {
		this(1);
	}
	Circle(double r){
		this.r = r;
	}
	@Override
	double area() {
		return r * r * Math.PI;
	}
	@Override
	double length() {
		return 2 * r * Math.PI;
	}
}
class Rectangle extends Shape{
	int w, h;
	Rectangle() {
		this(1,1);
	}
	Rectangle(int w, int h){
		this.w=w;
		this.h=h;
	}
	@Override
	double area() {
		return w * h;
	}
	@Override
	double length() {
		return 2 * (w + h);
	}
}
public class ListEx3 {
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();
		list.add(new Circle(5)); 
		list.add(new Rectangle(3,4));
		list.add(new Circle(1));
		list.add(new Circle(10));
		/*
		 * sort 기능을 수행하기 위해서는 list가 저장한 객체가 Comparable 인터페이스의 구현 객체여야 한다. 
		 * Comparable 인터페이스는 compareTo() 메서드를 멤버로 가진다.
		 */
		for(Shape s:list) {
			System.out.println(s.area());
		}
		Collections.sort(list);
		for(Shape s:list) {
			System.out.println(s.area());
		}
		System.out.println("전체 도형의 면적의 합:"+ sumArea(list));
		System.out.println("전체 도형의 둘레의 합:"+ sumLength(list));
		
	}
	
	private static double sumArea(List<Shape> list) {
		double sum=0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

	private static double sumLength(List<Shape> list) {
		double sum=0;
		//list.get(0) : new Circle(5)
		//list.get(1) : new Rectangle(3,4)
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i).length();
		}
		return sum;
	}

	
}
