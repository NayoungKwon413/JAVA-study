package chap16;
/*
 * Runnable 인터페이스를 구현하여 스레드 생성하기
 */
class Runnable1 implements Runnable{  //Runnable1은 Thread 클래스아님. Runnable 인터페이스의 구현 클래스임.
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			//Thread.currentThread() : 지금 현재 실행중인 (Running 상태인) 스레드 객체
			System.out.println(i+"="+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);  //Thread 클래스가 아니기 때문에 Thread.sleep 으로 설정해야함.
			}catch(InterruptedException e) {}
		}
	}
}
public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Runnable1 r = new Runnable1(); //New 상태 아님 -> Runnable이 Thread 클래스가 아니기 때문
		// r.run() 메서드를 실행하고, 이름이 First인  Thread 객체 생성
		Thread t1 = new Thread(r,"First");  //New 상태
		Thread t2 = new Thread(r,"Second"); //New 상태
		t1.start(); 
		t2.start();
//		t1.run();  //r.run() 실행됨 -> 1=main ... (현재 실행되고 있는 스레드가 main 스레드이기 때문)
//		t2.run();
		System.out.println("main 스레드 종료");
	}
}
