package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * ArrayList Ŭ������ Object Ŭ������ ���� Ŭ������.
 * ArrayList ��ü�� ��ü�� ���� �� ������ �� �ִ� ��ü��.
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
	//���� �������� ����
	@Override
	public int compareTo(Shape o) {  //�������̵��̹Ƿ� ����δ� ������ �� ����.
		return (int)(area() - o.area());  //����ȯ �ʿ�
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
		 * sort ����� �����ϱ� ���ؼ��� list�� ������ ��ü�� Comparable �������̽��� ���� ��ü���� �Ѵ�. 
		 * Comparable �������̽��� compareTo() �޼��带 ����� ������.
		 */
		for(Shape s:list) {
			System.out.println(s.area());
		}
		Collections.sort(list);
		for(Shape s:list) {
			System.out.println(s.area());
		}
		System.out.println("��ü ������ ������ ��:"+ sumArea(list));
		System.out.println("��ü ������ �ѷ��� ��:"+ sumLength(list));
		
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
