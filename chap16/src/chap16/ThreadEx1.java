package chap16;
/*
 * Thread 예제1
 * Thread 생성
 *    1. Thread 클래스를 상속 => ThreadEx1.java
 *    2. Runnable 인터페이스를 구현 => ThreadEx2.java
 *      ** 자바는 다중상속이 안되기 때문에, 이미 상속받은 상태에서는 Thread 상속 방법으로 Thread를 만들 수 없음.
 *      Thread 자체도 Runnable의 구현클래스임. 그러나 Runnable의 run() 메서드는 아무 정보 없는 상태.
 *      따라서 Thread 클래스 상속받아도 반드시 run() 메서드 오버라이드가 필요함
 */
class Thread1 extends Thread {  //Thread를 상속받은 Thread1은 곧 Thread
	Thread1(String name){
		super(name);
	}
	@Override
	public void run() {  //Running 상태
		for(int i=0; i<5; i++) {
			System.out.println(i + "=" + getName());  //getName() : 스레드 이름
			try {
				sleep(1000);  // 1초간 대기 상태 => 이후 Runnable 상태로 변환
			}catch(InterruptedException e) {}
		}
	}  //Dead 상태 - Thread 종료
}
public class ThreadEx1 {
	public static void main(String[] args) {  //main도 스레드임.
		System.out.println("main 스레드 시작");
		Thread1 t1 = new Thread1("First");  //New 상태
		Thread1 t2 = new Thread1("Second"); //New 상태
		t1.start(); //Runnable 상태
		t2.start(); //Runnable 상태
		/*
		 * start() 메서드 기능
		 *  1. 스택 영역을 병렬화 함.
		 *  2. 병렬화한 스택에 run() 메서드 호출
		 */
//		t1.run();
//		t2.run();
		/*
		 * run() 호출은 스레드 아님.
		 * main 스레드 시작 -> t1.run() 이 다 출력되면 t2.run() 출력 -> main 스레드 종료
		 */
		System.out.println("main 스레드 종료");
	}

}
