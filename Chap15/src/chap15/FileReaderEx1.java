package chap15;

import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader 예제: FileReader 클래스는 파일을 2바이트(1char) 단위로 읽음.
 *                 기본적으로 텍스트 문서를 읽기 위한 스트림(텍스트 외의 이미지, 음원 파일 등은 읽을 수 없음)
 *   int read() : 1char 단위로 읽어 해당내용을 리턴
 *   int read(char[] buf) : buf의 길이만큼 파일에서 읽어 buf에 저장함. 실제로 읽은 파일의 크기 리턴
 *   int read(char[] buf, int start, int len) :  buf의 len만큼 파일에서 읽어 buf의 start 인덱스부터 저장함. 실제 읽은 파일의 크기를 리턴
 */
public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("src/chap15/InputStreamEx1.java");
		//read()메서드를 이용하여 fis 파일을 읽어 출력하기
		System.out.println("==== read() 메서드를 이용하여 읽기");
		int data;
		while((data=fis.read()) != -1) {
			System.out.print((char)data);
		}
		System.out.println("==== read(buf) 메서드를 이용하여 읽기");
		fis = new FileReader("src/chap15/InputStreamEx1.java");
		char[] buf= new char[1024];  //1024 char
		while((data=fis.read(buf)) != -1) {
			System.out.print(new String(buf,0,data));
		}
		System.out.println("==== read(buf,start,len) 메서드를 이용하여 읽기");
		fis = new FileReader("src/chap15/InputStreamEx1.java");
		while((data=fis.read(buf,0,buf.length)) != -1) {
			System.out.print(new String(buf,0,data));
		}
	}
}
