package chap4;
/*
 * �� ���� ������ : ! : true -> false, false -> true
 */
public class OpEx4 {

	public static void main(String[] args) {
		System.out.println(true);  //true
		System.out.println("!true=" + !true);  //!true = false
		System.out.println("!false=" + !false);  //!false = true
		int x = 1000;
		System.out.println("(x < 200) =" + (x < 200));
		System.out.println("!(x < 200) =" + !(x < 200));
		System.out.println("1 != 1 :" + (1 != 1));
	}

}
