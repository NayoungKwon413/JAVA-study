package chap16;
/*
 * 동기화 : synchronized 예약어로 표현함
 *   동기화 블럭 : ThreadEx9.java
 *             lock 객체를 소유한 스레드만 동기화 영역을 실행할 수 있음.
 *             lock은 객체여야 가능. 기본자료형은 lock 사용불가. 
 *             lock 객체는 유일해야함. 모든 스레드가 공유하는 공유객체이어야 함. static 필수
 *   동기화 메서드 : ThreadEx10.java
 */
class PrintThread2 extends Thread{
	char ch;
//	static int lock = 0; //기본형은 lock으로 사용불가
//	static int[] lock = {}; //배열은 사용가능
//	Object lock = new Object(); // lock객체는 유일해야 함.
	static Object lock = new Object();
	PrintThread2(char ch){
		this.ch=ch;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			synchronized(lock) {  //동기화블럭
				for(int j=0; j<80; j++) {
					System.out.print(ch);  //80번찍을때 까지는 다른것에 영향을 받지 않음.
				}
				System.out.println();
			}
		}
	}
}
public class ThreadEx9 {
	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('A');  //r
		PrintThread2 t2 = new PrintThread2('B');
		PrintThread2 t3 = new PrintThread2('C');
		t1.start();  t2.start();  t3.start();
	}
}
