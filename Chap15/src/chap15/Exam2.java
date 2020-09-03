package chap15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * ȭ�鿡�� ���ϸ��� �Է¹ް�, 
 * ȭ�鿡 ������ �Է¹޾Ƽ� �Է¹��� ���ϸ� ������ �����ϱ�.
 * "exit" ������ �Է¹����� ����
 * FileOutputStream ����ϱ�
 * 
 * [���]
 * aaa.txt
 * ������ ������ �Է��ϼ���
 * �ȳ��ϼ���
 * �ݰ����ϴ�
 * exit
 * 
 * aaa.txt ������ ����
 * �ȳ��ϼ���
 * �ݰ����ϴ�.
 */
public class Exam2 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ���ϸ��� �Է��ϼ���");
		String filename = scan.next();
		FileOutputStream fos = new FileOutputStream(filename);
		while(true) {
		System.out.println("������ ������ �Է��ϼ���(����:exit)");
		String text = scan.next();
		if(text.equals("exit")) break;
		byte[] buf = (text+"\n").getBytes();
		fos.write(buf);
		}
		fos.flush();
		fos.close();
	}

}
