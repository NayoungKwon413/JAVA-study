package chap15;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 * File 클래스의 주요 메서드
 */
public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1"); //아직 만들어지지 않음 -> 지정만 해놓은 상태
		//f1.mkdir() : 폴더생성
		System.out.printf("%s 폴더 생성: %b%n", f1.getAbsolutePath(), f1.mkdir());
		File f2 = new File("c:/temp1/test.txt");
		//f2.createNewFile() : 파일생성
		System.out.printf("%s 파일 생성: %b%n", f2.getAbsolutePath(), f2.createNewFile());
		//f2.getName() : 파일의 이름
		//f2.length()  : 파일의 크기
		System.out.printf("파일이름:%s, 파일크기:%,d byte%n",f2.getName(), f2.length());
		File f3 = new File("c:/temp1/test2.txt");
		//f2.renameTo(f3) : f2파일이름을 f3으로 변경, 변경 되었으면 true
		System.out.printf("%s -> %s 이름변경: %b%n", f2.getName(), f3.getName(), f2.renameTo(f3)); //test.txt -> test2.txt로 이름변경
		//f3.lastModified() : 파일 최종 수정시간. 1970년 이후부터 파일 수정 시간까지 밀리초로 리턴
		System.out.printf("%s 파일 최종 수정시간: %s%n", f3.getName(), new Date(f3.lastModified()));  
		System.out.printf("%s 파일 삭제: %b%n", f3.getName(), f3.delete());
	}
}
