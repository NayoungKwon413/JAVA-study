package chap15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * ȭ�鿡�� ���ϸ��� �Է¹ް�, ����� ���۶��μ�, ������μ� �Է¹޾�
 * �ش� ������ ���۶���~������α����� ȭ�鿡 ����ϱ�
 * ��, ��½� �ش� ���ε� �Բ� ����� ��.
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
public class Exam3 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ϸ��� �Է��ϼ���");
		String filename=scan.next();
		System.out.println("����� ���۶��ΰ� ������� ���ڸ� �Է��ϼ���");
		int start= scan.nextInt();
		int end = scan.nextInt();
		BufferedReader br = new BufferedReader(new FileReader(filename));
		int line=0;
		String data=null;
		while((data=br.readLine()) != null) {
			++line;
			if(line<start) continue;
			if(line>end) break;
			System.out.println(line + ": " + data);
		}
		br.close();
	}
}
