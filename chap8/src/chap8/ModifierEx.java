package chap8;
/*
 * 접근 제한자
 *   private < (default) < protected < public
 */

import chap8.test.Modifier2;


class Modifier {
	private int v1 = 100;
			int v2 = 200;
	protected int v3 = v1;
	public void method() {
		System.out.println("chap8.Modifier.method() 메서드임");
		System.out.println("v1 =" + v1);
		System.out.println("v2 =" + v2);
	}
}
class Modifier3 extends Modifier2 {
	public void method() {
	//	System.out.println("v1 =" + v1); //error 접근제한자가 private
	//	System.out.println("v2 =" + v2); //error 접근제한자가 (default)
		System.out.println("v3 =" + v3); //protected 접근제어자 -> 다른 패키지더라도 상속관계에서는 접근 허용
		System.out.println("v4 ="+ v4); //public  접근제어자
	}
}

public class ModifierEx {
	public static void main(String[] args) {
		Modifier m1 = new Modifier();
		//System.out.println(m1.v1);  //error : 변수의 접근 제한자가 private임 -> 접근불가
		System.out.println(m1.v2);
		System.out.println(m1.v3);
		m1.method();
		Modifier3 m3 = new Modifier3();
	//	System.out.println("m3=" +m3.v1); //같은 클래스가 아니라서 접근 안됨
	//	System.out.println("m3=" +m3.v2); //패키지가 달라서 접근 안됨
	//	System.out.println("m3=" +m3.v3); //상속관계가 아니므로 접근 안됨
		System.out.println("m3=" +m3.v4);

	}

}
