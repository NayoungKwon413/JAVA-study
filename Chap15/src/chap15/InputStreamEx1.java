package chap15;

import java.io.IOException;
import java.io.InputStream;

/*
 * IO ��Ʈ�� : �������� �̵����, �ܹ���(�Է�, ���), ����(���۰� ����)
 * 
 *      �Է�
 *          ����Ʈ : InputStream => 1����Ʈ ���� ����
 *          ������ : Reader      => 2����Ʈ ���� ����
 *          
 *          ����Ʈ -> ������ ���� ����
 *                  InputStreamReader : Reader�� ���� Ŭ����
 *      ���
 *          ����Ʈ : OutputStream => 1����Ʈ ���� ���
 *          ������ : Writer       => 2����Ʈ ���� ���
 *          
 *          ����Ʈ -> ������ ���� ����
 *                  OutputStreamWriter : Writer�� ���� Ŭ����
 *                  
 * �ڹٿ��� �����Ǵ� ǥ�� ����� ��ü
 *    ǥ���Է� : InputStream System.in => Ű���忡�� �Է�
 *    ǥ����� : PrintStream System.out => �ܼ�(ȭ��)���� ������ ���
 *    ǥ�ؿ��� : PrintStream System.err => �ܼ�(ȭ��)���� ���� ���
 */
public class InputStreamEx1 {

	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		int data =0;
		while((data=in.read())!= -1) {
			System.out.print((char)data);
		}

	}

}
