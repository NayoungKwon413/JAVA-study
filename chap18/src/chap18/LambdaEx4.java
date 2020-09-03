package chap18;
/*
 * 매개변수도 있고, 리턴타입도 있는 경우
 */
interface LambdaInterface4{
	int method(int x, int y);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		LambdaInterface4 f4 = (x,y)->{  //매개변수가 2개 이상이기 때문에 () 생략할 수 없음
			return x*y;
		};
		System.out.println("두수의 곱:"+f4.method(2, 5));
		f4 = (x,y)->x+y;  //문장이 하나면 {}와 return 생략가능
		System.out.println("두수의 합:"+f4.method(2, 5));
		f4=(x,y)->x-y;
		System.out.println("두수의 차이:"+f4.method(5, 2));
		f4=(x,y)->x%y;
		System.out.println("두수를 나눈 나머지:"+f4.method(5, 2));
		f4=(x,y)->sum(x,y);
		System.out.println("두수의 합:"+f4.method(2, 5));
		f4=(x,y)->(x>y)?x:y;
		System.out.println("두수 중 큰수:"+f4.method(2, 5));
		f4=(x,y)->(x<y)?x:y;
		System.out.println("두수 중 작은수:"+f4.method(2, 5));
	}
	private static int sum(int x, int y) {
		return x+y;
	}
	
}
