package chap15;

import java.io.File;

/*
 * c:\windows ������ �����Ͽ� ������ �������������� ������ ����, ������ ��ũ�⸦ ����ϱ�
 */
public class Exam4 {
	public static void main(String[] args) {
		String filePath = "C:\\Windows";
		File f1 = new File(filePath);
		String files[] = f1.list();
		int dir = 0, fil=0;
		long sum = 0;
		for(String f : files) {
			File f2 = new File(filePath, f);
			if(f2.isDirectory())
				dir++;
			else if(f2.isFile()) {
				fil++;
				sum += f2.length();
			}
		}
		System.out.println("������ ����:"+ dir);
		System.out.println("������ ����:"+fil);
		System.out.printf("������ �� ũ��: %,dbyte%n",sum);
	}
}
