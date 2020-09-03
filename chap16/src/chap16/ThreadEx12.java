package chap16;
/*
 * wait(), notify(), notifyAll()
 *   1. 동기화 영역(즉, 동기화블럭 혹은 동기화 메서드)에서만 호출 가능
 *   2. Object 클래스의 멤버 메서드임.
 *      = 모든 클래스의 객체는 wait(), notify(), notifyAll() 메서드를 호출 할 수 있다.
 *   3. wait() : 대기상태로 변환. lock 도 해제됨. notify(), notifyAll() 메서드에 의해서 실행가능상태로 변환 가능.
 *      notify() : wait() 상태의 스레드 중 한개만 실행 가능상태로 변환함. -> 개발자가 지정할 수는 없다. 
 *      notifyAll() : wait() 상태인 스레드 모두를 실행가능상태로 변환함.
 */
class ATM2 implements Runnable{
	private int money = 100000;
	public void run() {
		synchronized(this) {  //this : atm. atm은 공유 객체이므로, lock으로 사용가능
			while(true) {
				if(money <= 0) {
					System.out.println("잔액이 없습니다.");
					notify();
					break;
				}
				withdraw();
				if(money % 20000 ==0) {
					try {
						wait();
					}catch(InterruptedException e) {}
				}else {
					notify();
				}
			}
		}
	}
	void withdraw() {
		if(money <=0)return;
		money -= 10000;
		System.out.println(Thread.currentThread().getName() + "출금, 잔액 : "+ money);
	}
}
public class ThreadEx12 {

	public static void main(String[] args) {
		ATM2 atm = new ATM2();  
		Thread mother = new Thread(atm, "Mother");
		Thread son = new Thread(atm, "Son");
		mother.start();  son.start();
	}

}
