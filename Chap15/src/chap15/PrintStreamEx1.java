package chap15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * ������Ʈ�� : PrintStream
 *   1. OutputStream�� ����Ŭ����. ����Ʈ ��½�Ʈ��.
 *   2. write() ����� �پ��ϰ� Ȯ���� print(), println(), printf() �޼��� �߰�
 *     - ��� �ڷ��� ���
 *     - ���� ó�� ���� ����
 *   3. System.out(ǥ�����), System.err(ǥ�ؿ���) �� Ŭ������
 *   
 */
public class PrintStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("ȫ�浿");
		ps.println(1234);
		ps.println(true);
		ps.println(65); //println(65) ����� ���� �ִ� �״�� 65�� ���
		ps.println('A');
		ps.write(65);//A : write(65) �� �ƽ�Ű������ �ν�
		ps.flush();
		ps = new PrintStream("print2.txt");
		ps.println("ȫ�浿");
		ps.println(1234);
		ps.println(true);
		ps.println(65); //println(65) ����� ���� �ִ� �״�� 65�� ���
		ps.println('A');
		ps.write(65);//A : write(65) �� �ƽ�Ű������ �ν�
		ps.flush();
	}

}
