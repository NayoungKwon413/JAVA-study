package chap16;
/*
 * ���󽺷���
 *   1. �Ϲݽ������� ���� ���� �����. ���� ���� �ݺ�ó���� ����
 *   2. �Ϲݽ����尡 ����Ǹ� ���󽺷��嵵 �ڵ����� �����.
 *   3. ���� : setDaemon(true);
 *      => New ���¿����� ������ ����.
 *         Runnable ���¿��� ���� �� ���, ���ܹ߻�.(IllegalThreadStateException)
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
		t1.setDaemon(true);  //���󽺷��� ���� => New ���¿��� �����Ǿ�� ��. ��, Runnable ���� ���� (start() ����)
		t2.setDaemon(true);  //���󽺷��� ����
		t1.start();  t2.start();
		Thread.sleep(2000);
		System.out.println("main ������ ����");
		//t1.start(); t2.start(); 
		//t1.setDaemon(true); t2.setDaemon(true);
		//Thread.sleep(2000);
		//system.out.println("main ������ ����");
		//�����߻� + "main ������ ����" �޼��� ������ ����ä ��� DaemonThread�� ���ư�.
		// -> ������ �߻��ϸ� �̸� �����ϱ� ���� �ڹٴ� ��� ���� ��, main ������� ���� �����.
		//�׷��� DaemonThread�� �̹� ����ȭ�Ǿ� ��� ���ư��� ���̹Ƿ� ���� �ݺ�����
	}
}
