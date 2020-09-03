package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * ȭ�鿡�� ���ϸ��� �Է¹޾� �ش� ������ ������ ȭ�鿡 ����ϱ�
 * �ѱ� ������ �ʵ��� �ϰ�, FileInputStream�� �̿�
 * �ش� ������ ���� ���, "�ش� ���� ����" �޼��� ���
 */
public class Exam1 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �̸��� �Է��ϼ���");
		String filename = scan.next();
		try {
			FileInputStream fis = new FileInputStream(""+filename);
			int data=0;
			byte[] buf = new byte[8096];
			while((data=fis.read(buf)) != -1) {
				System.out.print(new String(buf, 0, data));
			}
			}catch(FileNotFoundException e) {
				System.out.println("�ش� ���� ����");
			}
		
		
	}

}
