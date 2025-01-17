package chap16;
/*
 * 1~500까지 합 구하기
 * Thread 상속받은 SumThread 클래스를 구현하기
 */
class SumThread extends Thread{
	int num1,num2,sum;
	SumThread(int num1, int num2){
		super();
		this.num1=num1;
		this.num2=num2;
	}
	public void run() {
		for(int i=num1; i<=num2; i++) {
			sum += i;
		}
	}
}
public class Exam2 {
	public static void main(String[] args) {
		SumThread [] arr = new SumThread[5];
		arr[0]=new SumThread(1,100);
		arr[1]=new SumThread(101,200);
		arr[2]=new SumThread(201,300);
		arr[3]=new SumThread(301,400);
		arr[4]=new SumThread(401,500);
		int sum =0;
		for(SumThread t :arr) {
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sum += t.sum;
		}
		
		System.out.println("1~500까지의 합:"+sum);
	}
}
