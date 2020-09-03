package chap17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServerEx1 {
	public static void main(String[] args) {
		try {
			/*
			 * ServerSocket : ����
			 * 8888 : ��Ʈ��ȣ�� OS�κ��� �Ҵ�. binding �̶���.
			 * IP : ��ǻ�� �Ѱ��� �Ѱ��� �ּ� �Ҵ�
			 * PORT : ������ ���� ��ȣ
			 * 1~1000 �� ��Ʈ : ��������
			 *   FTP : 21
			 *   SSH : 22
			 *   Telnet : 25 ...
			 */
			ServerSocket server = new ServerSocket(8888);
			while(true) {
				System.out.println("Ŭ���̾�Ʈ ���� ���");
				Socket client = server.accept();  //Ŭ���̾�Ʈ�� ���� �Ϸ�
				System.out.println("������ ����");
				HttpThread ht = new HttpThread(client);
				ht.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static class HttpThread extends Thread{
		private Socket client;
		BufferedReader br;  //Ŭ���̾�Ʈ�� �����͸� �б����� ��Ʈ��
		PrintWriter pw;     //Ŭ���̾�Ʈ�� �����͸� ����ϱ� ���� ��Ʈ��
		HttpThread(Socket client){  //������
			this.client=client;
			try {
				//client.getInputStream() : Ŭ���̾�Ʈ�� ������ �����͸� �Է� �ޱ� ���� �Է� ��Ʈ��
				br=new BufferedReader(new InputStreamReader(client.getInputStream()));
				//client.getOutputStream() : Ŭ���̾�Ʈ���� ������ �����͸� ������ ���� ��� ��Ʈ��
				pw=new PrintWriter(client.getOutputStream());
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			BufferedReader fbr = null; //��û�� ������ �б� ���� ��Ʈ��
			try {
				String line = br.readLine();  //Ŭ���̾�Ʈ ������
				System.out.println("Http Header :"+line);  //GET /HTTP/1.1
				int start = line.indexOf("/")+1;
				int end = line.lastIndexOf("HTTP")-1;
				String fileName = line.substring(start, end);
				if(fileName.equals("")) fileName = "index.html";
				System.out.println("����� ��û ����:"+fileName);
				fbr = new BufferedReader(new FileReader(fileName));
				String fileLine = null;
				//ũ�Һ��������� ���� �����ϵ���
				//pw.println("HTTP/1.0 200 OK\r\nContent-Type:text/html\r\n");
				while((fileLine = fbr.readLine()) != null) {
					pw.println(fileLine);
					pw.flush();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(fbr != null) fbr.close();
					if(br != null) br.close();
					if(pw != null) pw.close();
					if(client != null) client.close();
				}catch(IOException e) {}
			}
		}
	}

}
