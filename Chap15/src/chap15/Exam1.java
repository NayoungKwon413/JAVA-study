package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받아 해당 파일의 내용을 화면에 출력하기
 * 한글 깨지지 않도록 하고, FileInputStream을 이용
 * 해당 파일이 없는 경우, "해당 파일 없음" 메세지 출력
 */
public class Exam1 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("파일 이름을 입력하세요");
		String filename = scan.next();
		try {
			FileInputStream fis = new FileInputStream(""+filename);
			int data=0;
			byte[] buf = new byte[8096];
			while((data=fis.read(buf)) != -1) {
				System.out.print(new String(buf, 0, data));
			}
			}catch(FileNotFoundException e) {
				System.out.println("해당 파일 없음");
			}
		
		
	}

}
