package chap15;

import java.io.File;

/*
 * c:\windows 폴더를 지정하여 폴더의 하위폴더갯수와 파일의 갯수, 파일의 총크기를 출력하기
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
		System.out.println("폴더의 갯수:"+ dir);
		System.out.println("파일의 갯수:"+fil);
		System.out.printf("파일의 총 크기: %,dbyte%n",sum);
	}
}
