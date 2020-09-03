package chap16;
/*
 * ����ȭ ����
 *   ����ȭ �� : ThreadEx9.java
 *   ����ȭ �޼��� : ThreadEx10.java
 *       1. ������ü�� �޼����̾����. �޼��尡 ������ ������ �ȵ�.
 *       2. ������ü : ��� �����尡 �ϳ��� ��ü�� �����ϰ� �ִ� ��ü
 */
class Printer {  //��������� ��� �ϳ��� ��ü�� �����ϰ� ���� -> ������ü
	//�޼��� �ȿ� lock ���ԵǾ�����
	public synchronized void printChar(char ch) {  //����ȭ �޼���
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
//		Thread t1 = new PrintThread3(new Printer(),'A');  //���� �ٸ� ��ü�� �����ϰ� �����Ƿ� ����ȭ ȿ�� ����.
//		Thread t2 = new PrintThread3(new Printer(),'B');
//		Thread t3 = new PrintThread3(new Printer(),'C');
		Thread t1 = new PrintThread3(ptr,'A');
		Thread t2 = new PrintThread3(ptr,'B');
		Thread t3 = new PrintThread3(ptr,'C');
		t1.start();  t2.start();  t3.start();
	}
}
