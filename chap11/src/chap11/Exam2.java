package chap11;
/*
 * �ڹٿ��� ���� ó���� �ʼ�.
 *  �� RuntimeException ���ܴ� ����ó���� ������ �� ����.
 *  => ���ܴ� RuntimeException �� �׿� Exception���� ������.
 *  => RuntimeException Ŭ������ ���� Ŭ������ ����ó�� ��������.
 */
public class Exam2 {
	public static void main(String[] args) {
		throw new RuntimeException("���� ���� �߻�"); //���� ó�� ���� �����Ͽ��� ���ֱ�

	}
}
