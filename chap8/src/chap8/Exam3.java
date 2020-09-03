package chap8;
/*
 * Product 클래스
 *   멤버변수 : 가격, 포인트
 *   생성자 : 가격을 입력받고, 가격의 10%를 포인트로 저장
 *   
 * Tv 클래스
 *   가격은 100 설정
 *   toString() : Tv 리턴
 * Computer 클래스
 *   가격은 200
 *   toString() : Computer 리턴
 * SmartPhone2 클래스
 *   가격 150
 *   toString() : SmartPhone 리턴
 *   
 * Buyer 클래스
 *   멤버변수 : money = 500, point
 *           Product[] cart = new Product[3];
 *           cnt;
 *   멤버메서드 : buy(Product p)
 *          1. p 상품가격만큼 money 차감
 *          2. p 상품의 point 만큼 나의 point에 증가
 *          3. cart에 제품 추가. cnt 증가
 *          4. 구입한 제품을 출력하기
 *   멤버메서드 : void summary()
 *          1. 각 구매한 물품의 가격과 포인트 출력 
 *          2. 전체 구매 물품금액 출력
 *          3. 전체 구매물품 목록
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
		System.out.println("구입한 제품 : " + p);
		
	}
	void summary() {
		//1. 각 구매한 물품의 가격과 포인트 출력 
		int sum=0;
		String list = "";
		for(int i=0; i<cnt; i++) {
			System.out.println(cart[i] + " 상품: 가격 = " + cart[i].cost + ", 포인트 = " + cart[i].point);
			sum += cart[i].cost;
			list += cart[i] + ", ";
		}
		//2. 전체 구매 물품금액 출력
		System.out.println("총 구매 물품 금액 = " + sum);
		//3. 전체 구매물품 목록
		System.out.println("총 구매 물품 목록 = " + list);
		
	}
	
}

public class Exam3 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer com = new Computer();
		SmartPhone2 sp = new SmartPhone2();
		Buyer b = new Buyer();
		System.out.println("고객의 잔액 : " + b.money);
		System.out.println("고객의 포인트 : " + b.point);
		b.buy(tv);
		b.buy(com);
		b.buy(sp);
		System.out.println("고객의 잔액 : " + b.money);
		System.out.println("고객의 포인트 : " + b.point);
		System.out.println("구매한 제품 정보");
		b.summary(); //물건 이름과 가격, 총 물품구매액, 총 물품목록 출력하기

	}

}
