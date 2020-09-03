package chap15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * bin/chap15/PrintStreamEx1.class ������ ���� �����̴�.
 * ���� ������ �о ȭ�鿡 16������ ����ϱ�
 * 
 */
public class Exam5 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("bin/chap15/PrintStreamEx1.class");
		FileInputStream fis = new FileInputStream(f1);
		int data = 0;
		byte buf [] = new byte[16];
		while((data=fis.read(buf)) != -1) {
			for(int i=0; i<data; i++) {
				System.out.printf("%02X ",buf[i]);
			}
			System.out.println();
		}
		
	}
}
