package chap16;
/*
 * 
 */
class ATM implements Runnable{
	private int money = 100000;
	public void run() {
		synchronized(this) {  //this : atm. atm�� ���� ��ü�̹Ƿ�, lock���� ��밡��
			while(true) {
				try {
					Thread.sleep((int)(Math.random()*100));
				}catch(InterruptedException e) {}
				if(money <=0) break;
				withdraw();
			}
		}
	}
	void withdraw() {
		if(money <=0)return;
		money -= 10000;
		System.out.println(Thread.currentThread().getName() + "���, �ܾ� : "+ money);
	}
}
public class ThreadEx11 {
	public static void main(String[] args) {
		ATM atm = new ATM();  
		Thread mother = new Thread(atm, "Mother");
		Thread son = new Thread(atm, "Son");
		mother.start();  son.start();
		
	}
}
