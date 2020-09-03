package chap16;
/*
 * ����ȭ : synchronized ������ ǥ����
 *   ����ȭ �� : ThreadEx9.java
 *             lock ��ü�� ������ �����常 ����ȭ ������ ������ �� ����.
 *             lock�� ��ü���� ����. �⺻�ڷ����� lock ���Ұ�. 
 *             lock ��ü�� �����ؾ���. ��� �����尡 �����ϴ� ������ü�̾�� ��. static �ʼ�
 *   ����ȭ �޼��� : ThreadEx10.java
 */
class PrintThread2 extends Thread{
	char ch;
//	static int lock = 0; //�⺻���� lock���� ���Ұ�
//	static int[] lock = {}; //�迭�� ��밡��
//	Object lock = new Object(); // lock��ü�� �����ؾ� ��.
	static Object lock = new Object();
	PrintThread2(char ch){
		this.ch=ch;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			synchronized(lock) {  //����ȭ��
				for(int j=0; j<80; j++) {
					System.out.print(ch);  //80�������� ������ �ٸ��Ϳ� ������ ���� ����.
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
