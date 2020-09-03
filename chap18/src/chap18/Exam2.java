package chap18;
/*
 * 
 */
public class Exam2 {
	public static void main(String[] args) {
//		LambdaInterface4 f = (x,y)->x+y;
//		System.out.println("두수(5,2)의 합:"+calc(5,2,f));  //7
//		f=(x,y)->x*y;
//		System.out.println("두수(5,2)의 곱:"+calc(5,2,f));  //10
		System.out.println("두수(5,2)의 합:"+calc(5,2,(x,y)->x+y));
		System.out.println("두수(5,2)의 곱:"+calc(5,2,(x,y)->x*y));
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("arr 배열의 최대값:"+calc(arr,(x,y)->x>y?x:y));  //10  //arr 은 1부터 10까지의 배열
		System.out.println("arr 배열의 최소값:"+calc(arr,(x,y)->x<y?x:y));  //1
	}
	private static int calc(int[] arr, LambdaInterface4 f) {
		int result = arr[0]; //
		for(int i : arr) {
			result = f.method(result, i);  //result와 i의 비교
		}
		return result;
	}
	private static int calc(int i, int j, LambdaInterface4 f) {
		return f.method(i, j);
	}
}
