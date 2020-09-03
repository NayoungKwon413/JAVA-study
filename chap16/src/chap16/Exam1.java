package chap16;
/*
 * ThreadEx3.java 소스를 Runnable 방식으로 변경하기
 * RunnablePriority 클래스 구현하기
 */
class RunnablePriority implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(20);
		}catch(InterruptedException e) {}
			for(int i=0; i<50; i++) {
				System.out.println(Thread.currentThread());  //Thread.currentThread() : 지금 현재 실행중인 (Running 상태인) 스레드 객체
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
