package chap8;
/*
 * ��� ��ǰ(Food)�� ����(price)�� ����Ʈ(point)�� ����� ������.
 * ��ǰ�� ��ü ���� �� ������ �Է¹޾ƾ� �ϰ�, ������ 10%�� ����Ʈ�� �����Ѵ�.
 * 
 * �ķ�ǰ�� ������ ����(Fruit) ����(Drink) ����(Snack) �� ��������.
 * ���� Ŭ������ �絵(brix)��, ����� �뷮(ml), ���ڴ� ����(gram)�� ����� ������
 * ������ �����δ� ���(Apple) ������(Peach)
 * ������ �����δ� �ݶ�(Coke) �� ���̴�(Cider)
 * ������ �����δ� ��Ŷ(Biscuit) ��Ű (Cookie)
 * ���, ������, �ݶ�, ���̴�, ��Ŷ, ��Ű Ŭ������ toString() �޼��带 �����ϰ� ������ �̸��� �����Ѵ�. 
 */

class Food {
	int price, point;
	Food(int price) {
		this.price = price;
		this.point += price*0.1;
	}
}

class Fruit extends Food {
	double brix;
	Fruit(int price, double brix) {
		super(price);
		this.brix = brix;
	}
	
	
}
class Apple extends Fruit {
	Apple(int price, double brix) {
		super(price, brix);
	}
	public String toString() {
		return "���";
	}
}
class Peach extends Fruit{
	Peach(int price, double brix){
		super(price, brix);
	}
	public String toString() {
		return "������";
	}
}

class Drink extends Food {
	Drink(int price, int ml) {
		super(price);
		this.ml=ml;
	}
	int ml;
}
class Coke extends Drink {
	Coke(int price, int ml) {
		super(price, ml);
	}
	public String toString() {
		return "�ݶ�";
	}
	
}
class Cider extends Drink {
	Cider(int price, int ml) {
		super(price, ml);
	}
	public String toString() {
		return "���̴�";
	}
	
}

class Snack extends Food {
	Snack(int price, int gram) {
		super(price);
		this.gram = gram;
	}
	int gram;
	
}
class Biscuit extends Snack{
	Biscuit(int price, int gram){
		super(price, gram);
	}
	public String toString() {
		return "��Ŷ";
	}
}
class Cookie extends Snack{
	Cookie(int price, int gram){
		super(price, gram);
	}
	public String toString() {
		return "��Ű";
	}
}
class Buyer2 {
	int money=10000, point, cnt;
	Food cart[] = new Food[100];
	void buy(Food f) {
		if(f.price>money) {
			System.out.println(f + "���� �� �ܾ׺���");
			return;
		}
		this.money -= f.price;
		this.point += f.point;
		System.out.println(f + "��(��)" + f.price + "�� ���ݿ� ����");
		cart[cnt++] = f;
		
	}
	void summary() {
		//1. ��ٱ��ϸ� ��ȸ�Ͽ� ������ ��ǰ�� ��ϰ� �� ����, ���� ����Ʈ�� ����ϱ�
		int sum=0, fsum=0, dsum=0, ssum=0;
		String list="", flist="", dlist="", slist="";
		for(int i=0; i<cnt; i++) {
			sum += cart[i].price;
			list += cart[i] + ", ";
			if(cart[i] instanceof Fruit) {  //cart[i] ��ü�� Fruit ��ü�� ����ȯ ����? -> ���ϰ�ü
				fsum += cart[i].price;
				flist += cart[i] + ", ";
			}
			if(cart[i] instanceof Drink) {  //cart[i] ��ü�� Drink ��ü�� ����ȯ ����? -> ���ᰴü
				dsum += cart[i].price;
				dlist += cart[i] + ", ";
			}
			if(cart[i] instanceof Snack) {  //cart[i] ��ü�� Snack ��ü�� ����ȯ ����? -> ������ü
				ssum += cart[i].price;
				slist += cart[i] + ", ";
			}
		}
			System.out.println("�� ������ ��ǰ:" + list);
			System.out.println("�� ���� ���� : " + sum);
			System.out.println("������ ���� ��ǰ:" + flist);
			System.out.println("�� ���� ���� ���� : " + fsum);
			System.out.println("������ ���� ��ǰ:" + dlist);
			System.out.println("�� ���� ���� ���� : " + dsum);
			System.out.println("������ ���� ��ǰ:" + slist);
			System.out.println("�� ���� ���� ���� : " + ssum);
	}
}

public class Exam4 {

	public static void main(String[] args) {
		Apple apple = new Apple(1000,10.5); //����, �絵
		System.out.println("��� ���� : " + apple.price);
		System.out.println("��� �絵 : " + apple.brix);
		Peach peach = new Peach(1000,13.5);
		Coke coke = new Coke(500,500);
		Cider cider = new Cider(1500,1000);
		Biscuit biscuit = new Biscuit(10000,500);
		Cookie cookie = new Cookie(500,5000);

		Buyer2 b = new Buyer2();
		b.buy(apple);
		b.buy(peach);
		b.buy(coke);
		b.buy(cider);
		b.buy(biscuit);
		b.buy(cookie);
		System.out.println("���ܾ� : " + b.money);
		System.out.println("�� ����Ʈ : " + b.point);
		b.summary();
	}

}
