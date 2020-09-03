package chap15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * 보조스트림 : PrintStream
 *   1. OutputStream의 하위클래스. 바이트 출력스트림.
 *   2. write() 기능을 다양하게 확장한 print(), println(), printf() 메서드 추가
 *     - 모든 자료형 출력
 *     - 예외 처리 생략 가능
 *   3. System.out(표준출력), System.err(표준오류) 의 클래스형
 *   
 */
public class PrintStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("홍길동");
		ps.println(1234);
		ps.println(true);
		ps.println(65); //println(65) 사람이 보는 있는 그대로 65로 출력
		ps.println('A');
		ps.write(65);//A : write(65) 는 아스키값으로 인식
		ps.flush();
		ps = new PrintStream("print2.txt");
		ps.println("홍길동");
		ps.println(1234);
		ps.println(true);
		ps.println(65); //println(65) 사람이 보는 있는 그대로 65로 출력
		ps.println('A');
		ps.write(65);//A : write(65) 는 아스키값으로 인식
		ps.flush();
	}

}
