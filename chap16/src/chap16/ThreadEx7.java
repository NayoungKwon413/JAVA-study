package chap16;
/*
 * 데몬스레드
 *   1. 일반스레드의 보조 역할 담당함. 보통 무한 반복처리를 수행
 *   2. 일반스레드가 종료되면 데몬스레드도 자동으로 종료됨.
 *   3. 설정 : setDaemon(true);
 *      => New 상태에서만 설정이 가능.
 *         Runnable 상태에서 설정 된 경우, 예외발생.(IllegalThreadStateException)
 */
class DaemonThread extends Thread {
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(100);
			}catch(InterruptedException e) {}
		}
	}
}
public class ThreadEx7 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new DaemonThread();
		Thread t2 = new DaemonThread();
		t1.setDaemon(true);  //데몬스레드 설정 => New 상태에서 설정되어야 함. 즉, Runnable 상태 이전 (start() 이전)
		t2.setDaemon(true);  //데몬스레드 설정
		t1.start();  t2.start();
		Thread.sleep(2000);
		System.out.println("main 스레드 종료");
		//t1.start(); t2.start(); 
		//t1.setDaemon(true); t2.setDaemon(true);
		//Thread.sleep(2000);
		//system.out.println("main 스레드 종료");
		//오류발생 + "main 스레드 종료" 메세지 나오지 않은채 계속 DaemonThread만 돌아감.
		// -> 오류가 발생하면 이를 수정하기 위해 자바는 즉시 멈춤 즉, main 스레드는 강제 종료됨.
		//그러나 DaemonThread는 이미 병렬화되어 계속 돌아가는 중이므로 무한 반복수행
	}
}
