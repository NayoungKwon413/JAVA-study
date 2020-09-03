package chap16;
/*
 * 1~500���� �� ���ϱ�
 * Runnable �������̽��� ����Ŭ���� SumRunnable Ŭ������ �����ϱ�
 */
class SumRunnable implements Runnable{
	int start, end, sum;
	SumRunnable(int start, int end){
		this.start=start;
		this.end=end;
	}
	@Override
	public void run() {
		for(int i=start; i<=end; i++) {
			sum += i;
		}
	}
}
public class Exam3 {
	public static void main(String[] args) throws InterruptedException {
		SumRunnable [] rarr = new SumRunnable[5];
		Thread [] tarr = new Thread[5];
		for(int i=0; i<rarr.length; i++) {
			rarr[i] = new SumRunnable((i*100)+1, (i+1)*100);  //Runnable ��ü
			tarr[i] = new Thread(rarr[i]);  //���� New ����
			tarr[i].start();
		}
		int sum=0;
		for(int i=0; i<rarr.length; i++) {
			tarr[i].join();  //Runnable ��ü�� Thread �� �ƴϱ� ������ join()�� ����� �� ����. -> Thread �����Ҷ����� main ���
			sum += rarr[i].sum;
		}
		System.out.println("1���� 500������ ��:"+sum);
	}
}
