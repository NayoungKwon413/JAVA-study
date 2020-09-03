package chap16;
/*
 * ������ ������, �Һ��� ������ ����
 * 
 * ������ �Ƶ��� �ϳ��� ���¸� �����Ѵ�.
 * ���¿� �ܾ��� 0�� ��� �Ƶ��� wait() ���·� ����ǰ�,
 * ������ ���¿� �ܾ��� 0���� ū ��� wait() ���·� ����ȴ�.
 * ������ �ܾ��� 0���� ��� 10000, 20000, 30000 �� �� �� ���� �Ա��Ѵ�.
 * �Ƶ��� �Աݵ� ��� �ܾ��� �������� �ܾ��� 0���� �����.
 * 
 * ������ 0~3000 ���� sleep �Ѵ�.
 * �Ƶ��� 1~1000 ���� sleep �Ѵ�.
 */
class Account {  //������ �Ƶ��� �ϳ��� ���¸� �����Ѵ�.
	int money;
	synchronized void output() {  //Son ������ ȣ�� �޼���
		while(money==0) {
			try {
				wait();  //money==0�ε��� ��� Son ������ ������
			}catch(InterruptedException e) {}	
		}
		notifyAll();  //0�� �ƴҶ� ���� 
		System.out.println(Thread.currentThread().getName() + ":"+money + "�� ���");
		money =0;
	}
	synchronized void input() {  //Mother ������ ȣ�� �޼���
		while(money>0) {
			try {
				wait();	//money�� 0���� ũ�� ���� wait() -���� ������ �Ա����� �����Ƿ�
			}catch(InterruptedException e) {}
		}
		money = ((int)(Math.random()*3)+1)*10000;  //money�� 0�϶� ���� 
		notifyAll();  //wait������ ��� �͵��� �ƿ�
		System.out.println(Thread.currentThread().getName()+":"+money+"�� �Ա�");
	}
}
class Mother extends Thread{
	Account account;
	Mother(Account account){
		super("Mother");
		this.account=account;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			try {
				sleep((int)(Math.random()*3000));  //0~3��
			}catch(InterruptedException e) {}
			account.input();
		}
	}
}
class Son extends Thread{
	Account account;
	Son(Account account){
		super("Son");
		this.account=account;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			try {
				sleep((int)(Math.random()*1000));  //0~1��
			}catch(InterruptedException e) {}
			account.output();
		}
	}
}
public class ThreadEx13 {
	public static void main(String[] args) {
		Account acc = new Account();
		Thread mother = new Mother(acc);
		Thread son = new Son(acc);
		mother.start();  son.start();
	}
}
