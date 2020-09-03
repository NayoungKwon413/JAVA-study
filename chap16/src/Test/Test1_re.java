package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1_re {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		String[] data = {"태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카"};
		int interval = 2*1000;
		
		Scanner scan = new Scanner(System.in);
		words.add(data[0]);
		DataAddThread2 t1 = new DataAddThread2(words, data, interval);
		t1.setDaemon(true);
		t1.start();  //run()메서드 : interval 만큼 대기하다가 임의의 이름을 words에 추가
		while(true) {
			System.out.println(words);
			System.out.print(">>");
			String input = scan.next().trim();
			words.remove(input);
			if(words.size()==0) break;
		}
		System.out.println("프로그램 종료");

	}

}
class DataAddThread2 extends Thread {
	List<String> words;
	String[] data;
	int interval;
	public DataAddThread2(List<String> words, String[] data, int interval) {
		this.words=words;
		this.data=data;
		this.interval=interval;
	}
	@Override
	public void run() {
		while(true) {
			try {
				sleep(interval);
			}catch(InterruptedException e) {}
			words.add(data[(int)(Math.random()*data.length)]);
		}
	}
}
