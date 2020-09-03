package chap9;

abstract class Animal {
	String name;
	Animal(String name){
		this.name = name;
	}
	abstract void eat();
}
interface Flyable {
	void fly();
}
//Dove Ŭ���� �����ϱ� 

class Dove extends Animal implements Flyable{
	Dove() {
		super("��ѱ�");
	}
	@Override
	void eat() {
		System.out.println(name + "�� ���� ������ ��� �Դ´�.");
	}
	@Override
	public void fly() {
		System.out.println(name + "�� ���� �ٴϴ� ���Դϴ�.");		
	}	
}
class Monkey extends Animal{
	Monkey() {
		super("������");
	}
	@Override
	void eat() {
		System.out.println(name + "�� �������� ���Ÿ� �� �Դ´�.");
	}	
}

public class Exam1 {
	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat(); //��ѱ�� ���� ������ ��� �Դ´�.
		if(a instanceof Flyable) {
			((Flyable)a).fly(); //��ѱ�� ���� �ٴϴ� ���Դϴ�.
		}
		a = new Monkey();
		a.eat();  //�����̴� �������� ���Ÿ� �� �Դ´�.
		if(a instanceof Flyable) {
			((Flyable)a).fly(); //false
		}
	}

}
