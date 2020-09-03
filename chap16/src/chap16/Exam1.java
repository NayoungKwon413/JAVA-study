package chap16;
/*
 * ThreadEx3.java �ҽ��� Runnable ������� �����ϱ�
 * RunnablePriority Ŭ���� �����ϱ�
 */
class RunnablePriority implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(20);
		}catch(InterruptedException e) {}
			for(int i=0; i<50; i++) {
				System.out.println(Thread.currentThread());  //Thread.currentThread() : ���� ���� �������� (Running ������) ������ ��ü
			}
	}
}
public class Exam1 {
	public static void main(String[] args) {
		RunnablePriority r = new RunnablePriority();
		Thread t1 = new Thread(r,"First");
		Thread t2 = new Thread(r,"Second");
		Thread t3 = new Thread(r,"Third");
		t1.setPriority(5);
		t2.setPriority(1);
		t3.setPriority(10);
		t1.start(); t2.start(); t3.start();
	}
}
