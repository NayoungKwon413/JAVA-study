package chap8;
/*
 * Product Ŭ����
 *   ������� : ����, ����Ʈ
 *   ������ : ������ �Է¹ް�, ������ 10%�� ����Ʈ�� ����
 *   
 * Tv Ŭ����
 *   ������ 100 ����
 *   toString() : Tv ����
 * Computer Ŭ����
 *   ������ 200
 *   toString() : Computer ����
 * SmartPhone2 Ŭ����
 *   ���� 150
 *   toString() : SmartPhone ����
 *   
 * Buyer Ŭ����
 *   ������� : money = 500, point
 *           Product[] cart = new Product[3];
 *           cnt;
 *   ����޼��� : buy(Product p)
 *          1. p ��ǰ���ݸ�ŭ money ����
 *          2. p ��ǰ�� point ��ŭ ���� point�� ����
 *          3. cart�� ��ǰ �߰�. cnt ����
 *          4. ������ ��ǰ�� ����ϱ�
 *   ����޼��� : void summary()
 *          1. �� ������ ��ǰ�� ���ݰ� ����Ʈ ��� 
 *          2. ��ü ���� ��ǰ�ݾ� ���
 *          3. ��ü ���Ź�ǰ ���
 */
class Product {
	int cost, point;
	Product(int cost) {
		this.cost = cost;
		this.point += cost*0.1;
	}
}
class Tv extends Product {
	Tv() {
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product{
	Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class SmartPhone2 extends Product {
	SmartPhone2() {
		super(150);
	}
	public String toString() {
		return "SmartPhone";
	}
}

class Buyer {
	int money=500, point, cnt;
	Product[] cart = new Product[3];
	void buy(Product p) {
		this.money -= p.cost;
		this.point += p.point;
		cart[cnt++] = p;
		System.out.println("������ ��ǰ : " + p);
		
	}
	void summary() {
		//1. �� ������ ��ǰ�� ���ݰ� ����Ʈ ��� 
		int sum=0;
		String list = "";
		for(int i=0; i<cnt; i++) {
			System.out.println(cart[i] + " ��ǰ: ���� = " + cart[i].cost + ", ����Ʈ = " + cart[i].point);
			sum += cart[i].cost;
			list += cart[i] + ", ";
		}
		//2. ��ü ���� ��ǰ�ݾ� ���
		System.out.println("�� ���� ��ǰ �ݾ� = " + sum);
		//3. ��ü ���Ź�ǰ ���
		System.out.println("�� ���� ��ǰ ��� = " + list);
		
	}
	
}

public class Exam3 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer com = new Computer();
		SmartPhone2 sp = new SmartPhone2();
		Buyer b = new Buyer();
		System.out.println("���� �ܾ� : " + b.money);
		System.out.println("���� ����Ʈ : " + b.point);
		b.buy(tv);
		b.buy(com);
		b.buy(sp);
		System.out.println("���� �ܾ� : " + b.money);
		System.out.println("���� ����Ʈ : " + b.point);
		System.out.println("������ ��ǰ ����");
		b.summary(); //���� �̸��� ����, �� ��ǰ���ž�, �� ��ǰ��� ����ϱ�

	}

}
