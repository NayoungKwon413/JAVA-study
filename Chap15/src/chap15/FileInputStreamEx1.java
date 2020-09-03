package chap15;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * FileInputStream : 파일의 내용을 읽어오기. 바이트형 입력스트림.
 *   int read() : 1byte 단위로 읽어서 리턴.
 *   int read(byte[] buf) : buf의 크기만큼 읽어서 데이터를 buf에 저장함.
 *                          실제로 읽은 바이트수 리턴.
 *   int read(byte[] buf, int start, int len) : 
 *                          buf의 크기에서 len 길이만큼 데이터를 읽어서 데이터를 buf의 start 인덱스부터 저장함.
 *                          실제로 읽은 바이트수 리턴
 */
public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException {
//      fis : src/chap15/InputStreamEx1.java 참조(읽기위한 준비)
		FileInputStream fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		System.out.println("==== read() 메서드를 이용하여 읽기");
		int data =0;
		while((data=fis.read()) != -1) {
			System.out.print((char)data);
		}
		System.out.println("==== read(byte[] buf) 메서드를 이용하여 읽기");
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		//fis.available() : 읽기 가능 바이트 수 = 파일의 크기, 즉 파일의 바이트 수와 같음.
		byte[] buf = new byte[fis.available()];
		while((data=fis.read(buf)) != -1) {  //-1: EOF.파일의 끝. 파일 끝까지 읽어라
			System.out.println(new String(buf,0,data));  //buf = 내용 /data= 실제로 읽은 byte수 => 0부터 실제로 읽은 byte수인 data 만큼 buf를 읽음
		}  //data : 실제 읽은 바이트 수 저장. //buf : 파일의 내용
		System.out.println("==== read(byte[] buf,start,len) 메서드를 이용하여 읽기");
		fis = new FileInputStream("src/chap15/InputStreamEx1.java");
		buf = new byte[fis.available()];
		while((data=fis.read(buf,0,buf.length)) != -1) {  //buf의 크기에서 buf.length까지 데이터를 읽은 후, start 인덱스(0)부터 buf에 그 내용을 저장함
			System.out.println(new String(buf,0,data));  
		}
	}

}
