package chap15;

import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader ����: FileReader Ŭ������ ������ 2����Ʈ(1char) ������ ����.
 *                 �⺻������ �ؽ�Ʈ ������ �б� ���� ��Ʈ��(�ؽ�Ʈ ���� �̹���, ���� ���� ���� ���� �� ����)
 *   int read() : 1char ������ �о� �ش系���� ����
 *   int read(char[] buf) : buf�� ���̸�ŭ ���Ͽ��� �о� buf�� ������. ������ ���� ������ ũ�� ����
 *   int read(char[] buf, int start, int len) :  buf�� len��ŭ ���Ͽ��� �о� buf�� start �ε������� ������. ���� ���� ������ ũ�⸦ ����
 */
public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("src/chap15/InputStreamEx1.java");
		//read()�޼��带 �̿��Ͽ� fis ������ �о� ����ϱ�
		System.out.println("==== read() �޼��带 �̿��Ͽ� �б�");
		int data;
		while((data=fis.read()) != -1) {
			System.out.print((char)data);
		}
		System.out.println("==== read(buf) �޼��带 �̿��Ͽ� �б�");
		fis = new FileReader("src/chap15/InputStreamEx1.java");
		char[] buf= new char[1024];  //1024 char
		while((data=fis.read(buf)) != -1) {
			System.out.print(new String(buf,0,data));
		}
		System.out.println("==== read(buf,start,len) �޼��带 �̿��Ͽ� �б�");
		fis = new FileReader("src/chap15/InputStreamEx1.java");
		while((data=fis.read(buf,0,buf.length)) != -1) {
			System.out.print(new String(buf,0,data));
		}
	}
}
