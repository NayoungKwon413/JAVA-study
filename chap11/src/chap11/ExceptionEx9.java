package chap11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * �������̵� �� �޼����� ����ó��
 *   �θ�Ŭ����Ÿ���� �� ū �ڷ������� ��� 
 *   �θ𺸴� �� ū ���ܸ� ó���� �� ����. ���ų�, ���� ������ ó���� ������.
 *   �θ� RuntimeException�� ���, �ڼ�Ŭ�������� ���ܸ� �������̵� �� �� Exception���� (X)
 *   �θ� Exception�� ���, �ڼ�Ŭ���� RuntimeExcption(o)
 *   
 *   �θ� ������ �ʴ� ���ܸ� ó���ϰ� ���� ��-> throws ��� try-catch ������ ���� ó���� ��
 */
class Parent{
	void method(int i) throws RuntimeException, InterruptedException {
		System.out.println(i);
		Thread.sleep(1000);
	}
}
class Child extends Parent{
//	@Override
	void method(int i) throws RuntimeException{ 
		System.out.println(i/0);
		try {
			new FileInputStream("aaa.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
public class ExceptionEx9 {
	public static void main(String[] args) {

	}
}
