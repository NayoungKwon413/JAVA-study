package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * 1. �ݺ����� �̿��Ͽ� 
   ���ϸ��� �Է¹޾Ƽ� �ش� ������ �����ϸ� �ش����ϸ�.bak ���� �����ϱ�
   ���ϸ� exit �� �ԷµǸ�, ���α׷� ����.
   �ش� ������ ������ �ش� ������ �����ϴ�. �޼��� ���

[���]
 ���ϸ��� �Է��ϼ���(����:exit)
 aaa.txt  =>�����ϴ� ���
 aaa.bak ���Ͽ� aaa.txt�� ������ �����ϱ�

 ���ϸ��� �Է��ϼ���(����:exit)
 bbb.txt  =>�������� �ʴ� ���
 �ش� ������ �����ϴ�. 
 */
public class Test1 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("���ϸ��� �Է��ϼ���(����:exit)");
		try {
			String filename = scan.next();
			if(filename.equals("exit")) break;
			String data;
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String refilename = filename.substring(0, filename.indexOf('.'));
			FileOutputStream fos = new FileOutputStream(refilename+".bak");
			while((data=br.readLine()) != null) {
				byte[] buf =(data+"\n").getBytes(); 
				fos.write(buf);
			}
			fos.flush();
			fos.close();
			System.out.println("�ش� ������ ���簡 �Ϸ�Ǿ����ϴ�.");
			continue;
			
		}catch(FileNotFoundException e) {
			System.out.println("�ش� ������ �����ϴ�."); continue;
			
	}
	}
		}
}
