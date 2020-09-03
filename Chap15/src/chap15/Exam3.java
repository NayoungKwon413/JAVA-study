package chap15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받고, 출력할 시작라인수, 종료라인수 입력받아
 * 해당 파일의 시작라인~종료라인까지만 화면에 출력하기
 * 단, 출력시 해당 라인도 함께 출력할 것.
 * 
 * [결과]
 * 파일명을 입력하세요
 * aaa.txt
 * 출력할 시작라인과 종료라인 숫자를 입력하세요
 * 11 12
 * 
 * 11: sdlfkjslf
 * 12: sdfsf
 */
public class Exam3 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String filename=scan.next();
		System.out.println("출력할 시작라인과 종료라인 숫자를 입력하세요");
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
