package chap15;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 보조스트림
 *   1. 새로운 기능을 추가한 스트림.
 *   2. 객체 생성시 다른 스트림을 매개변수로 받는다. 
 *      new BufferedReader(Reader)
 *      new BufferedInputStream(InputStream)
 *   
 * BufferedReader : 버퍼 기능을 추가하여 성능 향상시킴. 
 *  => readLine() : 한줄씩 읽을 수 있는 기능 추가
 *  
 *  키보드에서 입력한 내용을 한줄씩 읽어서 화면에 출력하고 buffered.txt 파일에 저장하기
 *  Scanner.nextLine() : 한줄씩 읽는 기능 => 사용하지 않고 Stream으로만 가능
 */
public class BufferedReaderEx1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("buffered.txt");
		String data = null;  //키보드에서 입력된 내용 저장.
		while((data = br.readLine())!= null) { //EOF(End of File) : ctrl+z
			System.out.println(data);
			fw.write(data+"\n");
		}
		fw.flush();
		fw.close();

	}

}
