package chap15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * Ű����κ��� ������ ��Ʈ������ �б�
 */
public class ReaderEx1 {
	public static void main(String[] args) throws IOException{
		Reader in = new InputStreamReader(System.in);
		int data;
		while((data=in.read())!= -1) {
			System.out.print((char)data);
		}
		

	}

}
