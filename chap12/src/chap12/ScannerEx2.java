package chap12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("score.text"));
		int cnt = 0;
		int totalSum =0;
		while(scan.hasNextLine()) {  //읽을 라인이 존재?
			String line = scan.nextLine();
			Scanner scan2 = new Scanner(line).useDelimiter(",");
			double sum =0;
			int i=0;
			String name=scan2.next(); //문자열 읽기
			System.out.print(name + ":");
			while(scan2.hasNextDouble()) {  //double 형의 데이터 존재?
				double score = scan2.nextDouble();
				sum += score;
				System.out.print(score + ",");
				i++;
			}
			System.out.println("sum="+sum+", avg=" + sum/i);
			cnt++;
		}
		System.out.println("인원수 :"+cnt);

	}
}
