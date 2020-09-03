package chap8;
/*
 * 모든 식품(Food)은 가격(price)과 포인트(point)를 멤버로 가진다.
 * 식품의 객체 생성 시 가격을 입력받아야 하고, 가격의 10%를 포인트로 저장한다.
 * 
 * 식료품의 종류는 과일(Fruit) 음료(Drink) 과자(Snack) 로 나눠진다.
 * 과일 클래스는 당도(brix)를, 음료는 용량(ml), 과자는 무게(gram)를 멤버로 가진다
 * 과일의 종류로는 사과(Apple) 복숭아(Peach)
 * 음료의 종류로는 콜라(Coke) 와 사이다(Cider)
 * 과자의 종류로는 비스킷(Biscuit) 쿠키 (Cookie)
 * 사과, 복숭아, 콜라, 사이다, 비스킷, 쿠키 클래스에 toString() 메서드를 구현하고 각각의 이름을 리턴한다. 
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
		return "사과";
	}
}
class Peach extends Fruit{
	Peach(int price, double brix){
		super(price, brix);
	}
	public String toString() {
		return "복숭아";
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
		return "콜라";
	}
	
}
class Cider extends Drink {
	Cider(int price, int ml) {
		super(price, ml);
	}
	public String toString() {
		return "사이다";
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
		return "비스킷";
	}
}
class Cookie extends Snack{
	Cookie(int price, int gram){
		super(price, gram);
	}
	public String toString() {
		return "쿠키";
	}
}
class Buyer2 {
	int money=10000, point, cnt;
	Food cart[] = new Food[100];
	void buy(Food f) {
		if(f.price>money) {
			System.out.println(f + "구입 시 잔액부족");
			return;
		}
		this.money -= f.price;
		this.point += f.point;
		System.out.println(f + "을(를)" + f.price + "원 가격에 구입");
		cart[cnt++] = f;
		
	}
	void summary() {
		//1. 장바구니를 조회하여 구매한 물품의 목록과 총 가격, 현재 포인트를 출력하기
		int sum=0, fsum=0, dsum=0, ssum=0;
		String list="", flist="", dlist="", slist="";
		for(int i=0; i<cnt; i++) {
			sum += cart[i].price;
			list += cart[i] + ", ";
			if(cart[i] instanceof Fruit) {  //cart[i] 객체는 Fruit 객체로 형변환 가능? -> 과일객체
				fsum += cart[i].price;
				flist += cart[i] + ", ";
			}
			if(cart[i] instanceof Drink) {  //cart[i] 객체는 Drink 객체로 형변환 가능? -> 음료객체
				dsum += cart[i].price;
				dlist += cart[i] + ", ";
			}
			if(cart[i] instanceof Snack) {  //cart[i] 객체는 Snack 객체로 형변환 가능? -> 스낵객체
				ssum += cart[i].price;
				slist += cart[i] + ", ";
			}
		}
			System.out.println("총 구매한 물품:" + list);
			System.out.println("총 구매 가격 : " + sum);
			System.out.println("구매한 과일 물품:" + flist);
			System.out.println("총 과일 구매 가격 : " + fsum);
			System.out.println("구매한 음료 물품:" + dlist);
			System.out.println("총 음료 구매 가격 : " + dsum);
			System.out.println("구매한 스낵 물품:" + slist);
			System.out.println("총 스낵 구매 가격 : " + ssum);
	}
}

public class Exam4 {

	public static void main(String[] args) {
		Apple apple = new Apple(1000,10.5); //가격, 당도
		System.out.println("사과 가격 : " + apple.price);
		System.out.println("사과 당도 : " + apple.brix);
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
		System.out.println("고객잔액 : " + b.money);
		System.out.println("고객 포인트 : " + b.point);
		b.summary();
	}

}
