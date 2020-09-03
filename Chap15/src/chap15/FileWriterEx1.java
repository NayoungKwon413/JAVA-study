package chap15;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter 예제 : 파일에 텍스트 데이터 출력.
 *   void write(int data) : 2 byte(1 문자) 출력
 *   void write(byte[] buf) : buf의 내용을 파일에 출력
 *   void write(byte[] buf, int start, int len) : buf의 start 인덱스부터의 내용을 파일에 len 크기만 출력
 *   void write(String data) : 문자열 출력
 */
public class FileWriterEx1 {
	public static void main(String[] args) throws IOException{
		System.out.println("out2.txt 파일에 출력됩니다.");
		FileWriter fos = new FileWriter("out2.txt");
		fos.write('1'); fos.write('2'); fos.write('3');
		fos.write('a'); fos.write('b'); fos.write('c');
		fos.write('가'); fos.write('나'); fos.write('다');
		char[] buf = "\n반갑습니다. FileOutputStream 예제입니다.\n".toCharArray();  //.getByte():바이트형 배열로 만들어줌
		fos.write(buf);
		fos.write(buf,1,6);
		fos.write("안녕하세요. 홍길동 입니다.");	
		fos.flush();
	}
}
