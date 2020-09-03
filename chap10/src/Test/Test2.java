package Test;
/*
 * 2. Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값 출력하는 구동 클래스 완성하기
 */
class Outer {

	 class Inner {
	  int iv = 100;

	 }
	}

public class Test2 {
	 public static void main(String[] args) {
		
		 
		 Outer out = new Outer();
		 Outer.Inner oi = out.new Inner();
		 System.out.println(oi.iv);

	 }

	}