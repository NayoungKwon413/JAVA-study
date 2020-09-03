package chap19;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * IntStream : int ������ ����
 */
public class IntStreamEx1 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println("Arrays.stream �޼��带 �̿��Ͽ� IntStream �����ϱ�");
		IntStream is1 = Arrays.stream(arr);  //�迭�� Streamȭ
		is1.forEach(s->System.out.print(s+"\t"));
		System.out.println("\nIntStream.of �޼��带 �̿��Ͽ� IntStream �����ϱ�");
		IntStream is2 = IntStream.of(arr);  //�迭�� Streamȭ
		is2.forEach(s->System.out.print(s+"\t"));
		System.out.println("\nIntStream.range(1,10) �޼��带 �̿��Ͽ� IntStream �����ϱ�");
		IntStream is3 = IntStream.range(1,10);  //1���� 10�������� ���� Streamȭ -> 1���� 9����
		is3.forEach(s->System.out.print(s+"\t"));
		System.out.println("\nIntStream.rangeClosed(1,10) �޼��带 �̿��Ͽ� IntStream �����ϱ�");
		IntStream is4 = IntStream.rangeClosed(1,10);  //1���� 10������ ���� Streamȭ -> 1���� 10����
		is4.forEach(s->System.out.print(s+"\t"));
	}
}
