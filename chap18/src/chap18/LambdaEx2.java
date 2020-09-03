package chap18;
/*
 * Runnable 인터페이스를 이용하여 람다식으로 스레드 생성하기
 */

public class LambdaEx2 {
	public static void main(String[] args) {
		System.out.println("main 시작");
		Runnable r = ()->{  //run() 을 구현(오버라이딩)
			int sum=0;
			for(int i=0; i<=100; i++) {
				sum+=i;
			}
			System.out.println("1부터 100까지의 합1:"+sum);
		};  //지역 이름없는 내부클래스(메인메서드 안에 있는 내부클래스) : 내부클래스에서 지역변수에 접근하고자 할때, 지역변수는 상수여야 함.
		Thread t1 = new Thread(r); 
		Thread t2 = new Thread(()->{
			int sum=0;
			for(int i=1; i<=100; i++) {
				sum+=i;
			}
			System.out.println("1부터 100까지의 합2:" + sum);
		});
		t1.start();  t2.start();
	}
}
