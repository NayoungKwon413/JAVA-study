package chap15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * ������ ������ BufferedReader�� �о� ȭ�鿡 ����ϱ�
 */
public class BufferedReaderEx2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("src/chap15/InputStreamEx1.java"));
		String data;
		while((data=br.readLine()) != null) {
			System.out.println(data);
		}

	}
}
