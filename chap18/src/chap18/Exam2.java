package chap18;
/*
 * 
 */
public class Exam2 {
	public static void main(String[] args) {
//		LambdaInterface4 f = (x,y)->x+y;
//		System.out.println("�μ�(5,2)�� ��:"+calc(5,2,f));  //7
//		f=(x,y)->x*y;
//		System.out.println("�μ�(5,2)�� ��:"+calc(5,2,f));  //10
		System.out.println("�μ�(5,2)�� ��:"+calc(5,2,(x,y)->x+y));
		System.out.println("�μ�(5,2)�� ��:"+calc(5,2,(x,y)->x*y));
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("arr �迭�� �ִ밪:"+calc(arr,(x,y)->x>y?x:y));  //10  //arr �� 1���� 10������ �迭
		System.out.println("arr �迭�� �ּҰ�:"+calc(arr,(x,y)->x<y?x:y));  //1
	}
	private static int calc(int[] arr, LambdaInterface4 f) {
		int result = arr[0]; //
		for(int i : arr) {
			result = f.method(result, i);  //result�� i�� ��
		}
		return result;
	}
	private static int calc(int i, int j, LambdaInterface4 f) {
		return f.method(i, j);
	}
}
