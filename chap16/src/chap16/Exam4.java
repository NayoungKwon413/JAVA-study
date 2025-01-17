package chap16;
/*
 * CarMarket 클래스 : 자동차 판매소
 *   멤버변수: String car;
 *   멤버 메서드 : synchronized void push()
 *              - car = {"소나타", "SM5", "그랜저", "제네시스", "K9"} 중 하나를 car에 저장
 *                car == null 인 경우에만 저장 가능함.
 *                car != null 인 경우는 wait() 상태로 변경
 *             synchronized void pop()
 *               - car == null wait 상태로 변경
 *                 car != null car+판매완료 메세지 출력하고, car==null 변환
 */
class CarMarket {
	String car;
	synchronized void push() {
		while(car != null) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		String [] cars = {"소나타", "SM5", "그랜저", "제네시스", "K9"};
		car = cars[(int)(Math.random()*cars.length)];
		notifyAll();
		System.out.println(Thread.currentThread().getName()+":"+car+"입고됨.");
	}
	synchronized void pop() {
		while(car == null) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		System.out.println(Thread.currentThread().getName()+":"+car + "판매완료");
		car =null;
		notifyAll();
	}
}
class Seller extends Thread{
	CarMarket market;
	Seller(CarMarket market){
		super("판매자");
		this.market=market;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			market.pop();
			try {
				sleep((int)(Math.random()*2000));
			}catch(InterruptedException e) {}
		}
	}
}
class Producer extends Thread{
	CarMarket market;
	Producer(CarMarket market){
		super("생산자");
		this.market=market;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			market.push();
			try {
				sleep((int)(Math.random()*5000));
			}catch(InterruptedException e) {}
		}
	}
}
public class Exam4 {
	public static void main(String[] args) {
		CarMarket market = new CarMarket();
		Seller s = new Seller(market);
		Producer p = new Producer(market);
		s.start();  p.start();
	}

}
