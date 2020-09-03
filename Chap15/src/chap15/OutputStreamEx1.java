package chap15;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * 
 */
public class OutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		OutputStream out = System.out;
		out.write('1'); out.write('2'); out.write('3');  //out.write('1') = ȭ��ܿ� 1�� ����϶�
		out.write('a'); out.write('b'); out.write('c'); 
		out.write('��'); out.write('��'); out.write('��'); 
		out.flush();  //������ ��¹����� ������ ������(�ܼ�)�� ��� //flush()�� ������ ��µ��� ����.
		System.out.println();
		//Writer ��ü�� �����ϱ�
		Writer w = new OutputStreamWriter(System.out);
		w.write('1'); w.write('2'); w.write('3'); 
		w.write('a'); w.write('b'); w.write('c'); 
		w.write('��'); w.write('��'); w.write('��'); 
		w.flush();
	}

}
