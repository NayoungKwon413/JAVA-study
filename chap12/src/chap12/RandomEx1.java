package chap12;

import java.util.Random;

/*
 * Random Ŭ���� : ���� �߻��� ���� Ŭ����
 *   1. �ڷ��� �� ���� �߻��� ������
 *      nextInt() : ������ ���� 
 *      nextInt(n) : 0 <= x < n ������ ����
 *      nextDouble() : 0 <= x < 1.0 �Ǽ��� ����
 *      nextBoolean() : true, false �� �ϳ� ����
 *   2. seed ���� ����
 */
public class RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(0);
		Random rand2 = new Random();
		rand2.setSeed(0);
		System.out.println("rand==>");
		for(int i=0; i<5; i++) {
			System.out.println(i+":"+rand.nextInt(100));  //nextInt(100) : 0���� 99������ �� �� ����������
		}
		System.out.println("\nrand2==>");
		for(int i=0; i<5; i++) {
			System.out.println(i+":"+rand2.nextInt(100));
		}
		Random rand3 = new Random();
		//System.currentTimeMillis() : 1970����� ��������� �ð��� �и��� ������ ����(1/1000��) => �׻� �ٸ� ���� ����(�ð��� ���� �޶����� ��)
		rand3.setSeed(System.currentTimeMillis());
		System.out.println("\nrand3==>");
		for(int i=0; i<5; i++) {
			System.out.println(i+":"+rand3.nextInt(100));
		}
	}

}
