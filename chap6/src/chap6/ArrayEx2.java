package chap6;
/*
 * 배열의 선언, 생성, 초기화하기
 */
public class ArrayEx2 {

	public static void main(String[] args) {
		//선언 + 생성 + 초기화
		int arr[] = {10,20,30,40,50};
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "]= " + arr[i]);
		}
		//개선된 for 구문(단점: 첨자 사용불가)
		for(int a : arr) {
			System.out.println(a);
		}
		//생성+초기화
		arr = new int[] {100,200,300};
		for(int a : arr) {
			System.out.println(a);
		}
	}

}
