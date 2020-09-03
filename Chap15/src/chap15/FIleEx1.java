package chap15;

import java.io.File;

/*
 * File Ŭ����
 *   - �����̳�, ������ ������ �����ϴ� Ŭ����
 *   - ���� ���ϵ� ������.
 *   
 *   ���� ������
 *     ������: \
 *     ������: /
 */
public class FIleEx1 {
	public static void main(String[] args) {
		String filePath = "D:\\";  //c ����̺�
		File f1 = new File(filePath);  //f1: c:\\ ���� ����
		String files[] = f1.list();  //f1 ������ ���� ������ �迭�� ����
		for(String f : files) {
			File f2 = new File(filePath, f);  //new FIle(����(�������), ����)
			if(f2.isDirectory())
				System.out.printf("%s : ���丮%n",f);
			else if(f2.isFile())
				System.out.printf("%s : ����(%,dbyte)%n",f,f2.length());
		}
	}
}
