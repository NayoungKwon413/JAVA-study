package chap4;
/*
 * 증감 연산자
 *     단항 연산자
 *     ++ : 숫자의 값을 1 증가
 *     -- : 숫자의 값을 1 감소
 */
public class OpEx1 {

	public static void main(String[] args) {
		int x=5, y=5;
		x++;   //후위형(:연산자가 뒤에 붙어있음)
		y++;
	    System.out.println("x="+x + ",y=" +y);
	    x=y=5;
	    ++x;   //전위형(:연산자가 앞에 붙어있음) 
	    --y;
	    System.out.println("x="+x + ",y=" +y);

	
	}

}
