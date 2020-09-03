package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Ÿ�� ���� ���� ���α׷� �����ϱ�
  String[] data = { "�¿�", "����", "����", "ȿ��", "����", "����", "Ƽ�Ĵ�", "���", "����ī" };
  List<String> words = new ArrayList<String>();
  3�ʿ� �ѹ��� words�� data �� ������ �̸��� �߰��ϱ�. 
    => ������(DataAddThread)�� �ۼ�.
  DataAddThread ������� ���� ������� �����ϱ�
   ȭ�鿡 �Էµ� �̸���, words�� ����� �̸��� ���� ��� words���� �Էµ� �̸��� �����Ѵ�.
  words�� ��� �����Ͱ� ���� �Ǹ� ���α׷��� �����Ѵ�. 
 */
class DataAddThread extends Thread{
	String[] data = { "�¿�", "����", "����", "ȿ��", "����", "����", "Ƽ�Ĵ�", "���", "����ī" };
	List<String> words = new ArrayList<String>();
	public void run() {		
		while(true) {
			words.add(data[(int)(Math.random()*data.length)]);
			try {
				sleep(3000);
			}catch(InterruptedException e) {}
		}
	}
}
public class Test1 {
	public static void main(String[] args) {
		DataAddThread t1 = new DataAddThread();
		t1.setDaemon(true);
		t1.start();
		Scanner scan = new Scanner(System.in);
		while(t1.words.size() !=0) {
			System.out.println(t1.words);
			System.out.print(">>");
			String name = scan.next();
			for(int i=0; i<t1.words.size(); i++) {
				if(name.equals(t1.words.get(i))) {
					t1.words.remove(i);
				}
			}
		}
		System.out.println("���α׷�����");
	}
}
