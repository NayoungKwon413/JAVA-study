package chap16;
/*
 * 동기화 영역
 *   동기화 블럭 : ThreadEx9.java
 *   동기화 메서드 : ThreadEx10.java
 *       1. 공유객체의 메서드이어야함. 메서드가 여러개 있으면 안됨.
 *       2. 공유객체 : 모든 스레드가 하나의 객체를 공유하고 있는 객체
 */
class Printer {  //스레드들이 모두 하나의 객체를 공유하고 있음 -> 공유객체
	//메서드 안에 lock 포함되어있음
	public synchronized void printChar(char ch) {  //동기화 메서드
		for(int i=0; i<80; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}
class PrintThread3 extends Thread {
	Printer ptr;
	char ch;
	PrintThread3(Printer ptr, char ch){
		this.ptr=ptr;
		this.ch=ch;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			ptr.printChar(ch);
		}
	}
}
public class ThreadEx10 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
//		Thread t1 = new PrintThread3(new Printer(),'A');  //각기 다른 객체를 포함하고 있으므로 동기화 효과 없음.
//		Thread t2 = new PrintThread3(new Printer(),'B');
//		Thread t3 = new PrintThread3(new Printer(),'C');
		Thread t1 = new PrintThread3(ptr,'A');
		Thread t2 = new PrintThread3(ptr,'B');
		Thread t3 = new PrintThread3(ptr,'C');
		t1.start();  t2.start();  t3.start();
	}
}
