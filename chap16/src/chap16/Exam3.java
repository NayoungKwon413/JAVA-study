package chap16;
/*
 * 1~500까지 합 구하기
 * Runnable 인터페이스의 구현클래스 SumRunnable 클래스를 구현하기
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
			rarr[i] = new SumRunnable((i*100)+1, (i+1)*100);  //Runnable 객체
			tarr[i] = new Thread(rarr[i]);  //실제 New 상태
			tarr[i].start();
		}
		int sum=0;
		for(int i=0; i<rarr.length; i++) {
			tarr[i].join();  //Runnable 객체는 Thread 가 아니기 때문에 join()을 사용할 수 없음. -> Thread 종료할때까지 main 대기
			sum += rarr[i].sum;
		}
		System.out.println("1부터 500까지의 합:"+sum);
	}
}
