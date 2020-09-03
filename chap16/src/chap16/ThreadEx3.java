package chap16;
/*
 * 
 */
class ThreadPriority extends Thread {
	ThreadPriority(String name, int p){
		super(name);  //������ �̸� ����
		setPriority(p);  //�켱��������(1~10 ��)
	}
	public void run() {
		try {
			sleep(20);
		}catch(InterruptedException e) {}
			for(int i=0; i<50; i++) {
				//this : ThreadPriority ��ü. 
				//Thread[First,5,main] : Thread[�������̸�,�켱����,������׷�]
				System.out.println(this);
			}
		}
	}

public class ThreadEx3 {
	public static void main(String[] args) {
		System.out.println("���� �켱����:"+Thread.MAX_PRIORITY);  //10
		System.out.println("���� �켱����:"+Thread.MIN_PRIORITY);  //1
		System.out.println("�⺻ �켱����:"+Thread.NORM_PRIORITY); //5
		Thread t1 = new ThreadPriority("First",5);
		Thread t2 = new ThreadPriority("Second",1);
		Thread t3 = new ThreadPriority("Third",10);
		t1.start(); t2.start(); t3.start();
	}
}
