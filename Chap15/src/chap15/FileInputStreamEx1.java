package chap15;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * FileInputStream : ������ ������ �о����. ����Ʈ�� �Է½�Ʈ��.
 *   int read() : 1byte ������ �о ����.
 *   int read(byte[] buf) : buf�� ũ�⸸ŭ �о �����͸� buf�� ������.
 *                          ������ ���� ����Ʈ�� ����.
 *   int read(byte[] buf, int start, int len) : 
 *                          buf�� ũ�⿡�� len ���̸�ŭ �����͸� �о �����͸� buf�� start �ε������� ������.
 *                          ������ ���� ����Ʈ�� ����
 */
public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException {
//      fis : src/chap15/InputStreamEx1.java ����(�б����� �غ�)
		FileInputStream fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		System.out.println("==== read() �޼��带 �̿��Ͽ� �б�");
		int data =0;
		while((data=fis.read()) != -1) {
			System.out.print((char)data);
		}
		System.out.println("==== read(byte[] buf) �޼��带 �̿��Ͽ� �б�");
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		//fis.available() : �б� ���� ����Ʈ �� = ������ ũ��, �� ������ ����Ʈ ���� ����.
		byte[] buf = new byte[fis.available()];
		while((data=fis.read(buf)) != -1) {  //-1: EOF.������ ��. ���� ������ �о��
			System.out.println(new String(buf,0,data));  //buf = ���� /data= ������ ���� byte�� => 0���� ������ ���� byte���� data ��ŭ buf�� ����
		}  //data : ���� ���� ����Ʈ �� ����. //buf : ������ ����
		System.out.println("==== read(byte[] buf,start,len) �޼��带 �̿��Ͽ� �б�");
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		buf = new byte[fis.available()];
		while((data=fis.read(buf,0,buf.length)) != -1) {  //buf�� ũ�⿡�� buf.length���� �����͸� ���� ��, start �ε���(0)���� buf�� �� ������ ������
			System.out.println(new String(buf,0,data));  
		}
	}

}
