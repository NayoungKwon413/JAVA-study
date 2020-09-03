package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 타자 연습 게임 프로그램 구현하기
  String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };
  List<String> words = new ArrayList<String>();
  3초에 한번씩 words에 data 중 임의의 이름을 추가하기. 
    => 스레드(DataAddThread)로 작성.
  DataAddThread 스레드는 데몬 스레드로 설정하기
   화면에 입력된 이름과, words에 저장된 이름이 같은 경우 words에서 입력된 이름을 삭제한다.
  words에 모든 데이터가 삭제 되면 프로그램을 종료한다. 
 */
class DataAddThread extends Thread{
	String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };
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
		System.out.println("프로그램종료");
	}
}
