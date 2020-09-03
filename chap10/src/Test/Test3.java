package Test;

/*
 * 3. Outer2클래스의 내부클래스 Inner의 멤버변수 iv값 출력하는 구동 클래스 완성하기
 */

class Outer2 {
	
 static class Inner {
  int iv = 200;

 }
}

public class Test3 {
 public static void main(String[] args) {
	
	 System.out.println(new Outer2.Inner().iv); //혹은 
	 
	 Outer2 out2 = new Outer2();
	 Outer2.Inner oi2 = new Outer2.Inner();
	 System.out.println(oi2.iv);
 }

}
