package chap15;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter ���� : ���Ͽ� �ؽ�Ʈ ������ ���.
 *   void write(int data) : 2 byte(1 ����) ���
 *   void write(byte[] buf) : buf�� ������ ���Ͽ� ���
 *   void write(byte[] buf, int start, int len) : buf�� start �ε��������� ������ ���Ͽ� len ũ�⸸ ���
 *   void write(String data) : ���ڿ� ���
 */
public class FileWriterEx1 {
	public static void main(String[] args) throws IOException{
		System.out.println("out2.txt ���Ͽ� ��µ˴ϴ�.");
		FileWriter fos = new FileWriter("out2.txt");
		fos.write('1'); fos.write('2'); fos.write('3');
		fos.write('a'); fos.write('b'); fos.write('c');
		fos.write('��'); fos.write('��'); fos.write('��');
		char[] buf = "\n�ݰ����ϴ�. FileOutputStream �����Դϴ�.\n".toCharArray();  //.getByte():����Ʈ�� �迭�� �������
		fos.write(buf);
		fos.write(buf,1,6);
		fos.write("�ȳ��ϼ���. ȫ�浿 �Դϴ�.");	
		fos.flush();
	}
}
