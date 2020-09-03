package chap18;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/*
 * IntPredicate(�Ű������� int�� �޾Ƽ� boolean���� ����) �������̽��� �̿��Ͽ� 
 * �迭�� ����� 10���� ���ڴ� 1���� 100������ ������ ���� ä���
 */
public class Exam5 {
	private static int[] arr = new int [10];

	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() *100)+1;
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		
		
		System.out.println("arr �迭�� ¦�� �� �ִ� ����:" + maxOrMin(t->t%2==0, (a,b)->a>b?a:b));
		System.out.println("arr �迭�� ¦�� �� �ּ� ����:" + maxOrMin(t->t%2==0, (a,b)->a<b?a:b));
		System.out.println("arr �迭�� Ȧ�� �� �ִ� ����:" + maxOrMin(t->t%2==1, (a,b)->a>b?a:b));
		System.out.println("arr �迭�� Ȧ�� �� �ּ� ����:" + maxOrMin(t->t%2==1, (a,b)->a<b?a:b));
		System.out.println("arr �迭�� �ִ� ����:" + maxOrMin(t->true, (a,b)->a>b?a:b));
		System.out.println("arr �迭�� �ּ� ����:" + maxOrMin(t->true, (a,b)->a<b?a:b));
	}

	private static int maxOrMin(IntPredicate p, IntBinaryOperator o) {
		int result=0;
		for(int a : arr) {
			if(p.test(a)) {
				if(result == 0) result =a;
				result = o.applyAsInt(result, a);
			}
		}
		return result;
	}

}
