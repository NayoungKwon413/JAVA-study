package chap6;
/*
 * �迭�� ����, ����, �ʱ�ȭ�ϱ�
 */
public class ArrayEx2 {

	public static void main(String[] args) {
		//���� + ���� + �ʱ�ȭ
		int arr[] = {10,20,30,40,50};
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "]= " + arr[i]);
		}
		//������ for ����(����: ÷�� ���Ұ�)
		for(int a : arr) {
			System.out.println(a);
		}
		//����+�ʱ�ȭ
		arr = new int[] {100,200,300};
		for(int a : arr) {
			System.out.println(a);
		}
	}

}
