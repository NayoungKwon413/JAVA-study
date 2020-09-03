package chap15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * ȭ�鿡�� ���ϸ��� �Է¹ް�, ����� ���۶��μ�, ������μ� �Է¹޾�
 * �ش� ������ ���۶���~������α����� ȭ�鿡 ����ϱ�
 * ��, ��½� �ش� ���ε� �Բ� ����� ��.
 * 
 * Scanner ���Ұ�
 * 
 * [���]
 * ���ϸ��� �Է��ϼ���
 * aaa.txt
 * ����� ���۶��ΰ� ������� ���ڸ� �Է��ϼ���
 * 11 12
 * 
 * 11: sdlfkjslf
 * 12: sdfsf
 */
public class Exam3_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���ϸ��� �Է��ϼ���");
		String filename=br.readLine();
		System.out.println("����� ���۶��ΰ� ������� ���ڸ� �Է��ϼ���");
//		int start = Integer.parseInt(br.readLine()); //br.readLine()���� 1�� ���ڿ�Ÿ������ �ޱ⶧���� �ٽ� ���������� ��ȯ�� �ʿ���.
//		int end = Integer.parseInt(br.readLine());
		
//		int start = br.read()-48;br.readLine();
//		int end = br.read()-48;br.readLine();
		
		String stdnum = br.readLine();
		String[] strnum = stdnum.split(" ");
		int start = Integer.parseInt(strnum[0].trim());
		int end = Integer.parseInt(strnum[1].trim());
		
		BufferedReader br2 = new BufferedReader(new FileReader(filename));  //Ű���忡�� ���� ���ϸ��� ������ ���� �Ǵٸ� BufferedReader�� �ʿ���. 
		int line=0;
		String data=null;
		while((data=br2.readLine()) != null) {
			++line;
			if(line<start) continue;
			if(line>end) break;
			System.out.println(line + ": " + data);
		}
		br.close();
	}
}
