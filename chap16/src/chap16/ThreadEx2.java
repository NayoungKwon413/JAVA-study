package chap16;
/*
 * Runnable �������̽��� �����Ͽ� ������ �����ϱ�
 */
class Runnable1 implements Runnable{  //Runnable1�� Thread Ŭ�����ƴ�. Runnable �������̽��� ���� Ŭ������.
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			//Thread.currentThread() : ���� ���� �������� (Running ������) ������ ��ü
			System.out.println(i+"="+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);  //Thread Ŭ������ �ƴϱ� ������ Thread.sleep ���� �����ؾ���.
			}catch(InterruptedException e) {}
		}
	}
}
public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println("main ������ ����");
		Runnable1 r = new Runnable1(); //New ���� �ƴ� -> Runnable�� Thread Ŭ������ �ƴϱ� ����
		// r.run() �޼��带 �����ϰ�, �̸��� First��  Thread ��ü ����
		Thread t1 = new Thread(r,"First");  //New ����
		Thread t2 = new Thread(r,"Second"); //New ����
		t1.start(); 
		t2.start();
//		t1.run();  //r.run() ����� -> 1=main ... (���� ����ǰ� �ִ� �����尡 main �������̱� ����)
//		t2.run();
		System.out.println("main ������ ����");
	}
}
