package chap16;
/*
 * Thread ����1
 * Thread ����
 *    1. Thread Ŭ������ ��� => ThreadEx1.java
 *    2. Runnable �������̽��� ���� => ThreadEx2.java
 *      ** �ڹٴ� ���߻���� �ȵǱ� ������, �̹� ��ӹ��� ���¿����� Thread ��� ������� Thread�� ���� �� ����.
 *      Thread ��ü�� Runnable�� ����Ŭ������. �׷��� Runnable�� run() �޼���� �ƹ� ���� ���� ����.
 *      ���� Thread Ŭ���� ��ӹ޾Ƶ� �ݵ�� run() �޼��� �������̵尡 �ʿ���
 */
class Thread1 extends Thread {  //Thread�� ��ӹ��� Thread1�� �� Thread
	Thread1(String name){
		super(name);
	}
	@Override
	public void run() {  //Running ����
		for(int i=0; i<5; i++) {
			System.out.println(i + "=" + getName());  //getName() : ������ �̸�
			try {
				sleep(1000);  // 1�ʰ� ��� ���� => ���� Runnable ���·� ��ȯ
			}catch(InterruptedException e) {}
		}
	}  //Dead ���� - Thread ����
}
public class ThreadEx1 {
	public static void main(String[] args) {  //main�� ��������.
		System.out.println("main ������ ����");
		Thread1 t1 = new Thread1("First");  //New ����
		Thread1 t2 = new Thread1("Second"); //New ����
		t1.start(); //Runnable ����
		t2.start(); //Runnable ����
		/*
		 * start() �޼��� ���
		 *  1. ���� ������ ����ȭ ��.
		 *  2. ����ȭ�� ���ÿ� run() �޼��� ȣ��
		 */
//		t1.run();
//		t2.run();
		/*
		 * run() ȣ���� ������ �ƴ�.
		 * main ������ ���� -> t1.run() �� �� ��µǸ� t2.run() ��� -> main ������ ����
		 */
		System.out.println("main ������ ����");
	}

}
