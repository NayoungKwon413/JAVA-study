package chap15;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStream 예제 : 파일에 데이터 출력.
 *                       파일이 존재하지 않으면 파일 생성.
 *                       파일이 존재하는 경우, 파일 수정.
 *   void write(int data) : 1 byte 출력
 *   void write(byte[] buf) : buf의 내용을 파일에 출력
 *   void write(byte[] buf, int start, int len) : buf의 start 인덱스부터의 내용을 파일에 len 크기만 출력
 */
public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out.txt 파일에 출력됩니다.");
		//fos : out.txt 파일을 쓰기 위해 참조함
		FileOutputStream fos = new FileOutputStream("out.txt");
		fos.write('1'); fos.write('2'); fos.write('3');
		fos.write('a'); fos.write('b'); fos.write('c');
		fos.write('가'); fos.write('나'); fos.write('다');
		byte[] buf = "\n반갑습니다. FileOutputStream 예제입니다.\n".getBytes();  //.getByte():바이트형 배열로 만들어줌
		fos.write(buf);
		fos.write(buf,1,6);  //buf 의 내용을 인덱스 1부터 6바이트만큼 출력 '반갑습'
		fos.flush();
	}

}
