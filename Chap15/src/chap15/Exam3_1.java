package chap15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받고, 출력할 시작라인수, 종료라인수 입력받아
 * 해당 파일의 시작라인~종료라인까지만 화면에 출력하기
 * 단, 출력시 해당 라인도 함께 출력할 것.
 * 
 * Scanner 사용불가
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
public class Exam3_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일명을 입력하세요");
		String filename=br.readLine();
		System.out.println("출력할 시작라인과 종료라인 숫자를 입력하세요");
//		int start = Integer.parseInt(br.readLine()); //br.readLine()에서 1은 문자열타입으로 받기때문에 다시 정수형으로 변환이 필요함.
//		int end = Integer.parseInt(br.readLine());
		
//		int start = br.read()-48;br.readLine();
//		int end = br.read()-48;br.readLine();
		
		String stdnum = br.readLine();
		String[] strnum = stdnum.split(" ");
		int start = Integer.parseInt(strnum[0].trim());
		int end = Integer.parseInt(strnum[1].trim());
		
		BufferedReader br2 = new BufferedReader(new FileReader(filename));  //키보드에서 받은 파일명의 내용을 읽을 또다른 BufferedReader가 필요함. 
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
