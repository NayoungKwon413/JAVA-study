package chap15;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ������Ʈ��
 *   1. ���ο� ����� �߰��� ��Ʈ��.
 *   2. ��ü ������ �ٸ� ��Ʈ���� �Ű������� �޴´�. 
 *      new BufferedReader(Reader)
 *      new BufferedInputStream(InputStream)
 *   
 * BufferedReader : ���� ����� �߰��Ͽ� ���� ����Ŵ. 
 *  => readLine() : ���پ� ���� �� �ִ� ��� �߰�
 *  
 *  Ű���忡�� �Է��� ������ ���پ� �о ȭ�鿡 ����ϰ� buffered.txt ���Ͽ� �����ϱ�
 *  Scanner.nextLine() : ���پ� �д� ��� => ������� �ʰ� Stream���θ� ����
 */
public class BufferedReaderEx1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("buffered.txt");
		String data = null;  //Ű���忡�� �Էµ� ���� ����.
		while((data = br.readLine())!= null) { //EOF(End of File) : ctrl+z
			System.out.println(data);
			fw.write(data+"\n");
		}
		fw.flush();
		fw.close();

	}

}
