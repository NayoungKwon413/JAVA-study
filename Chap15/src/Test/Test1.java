package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * 1. 반복문을 이용하여 
   파일명을 입력받아서 해당 파일이 존재하면 해당파일명.bak 파일 복사하기
   파일명에 exit 가 입력되면, 프로그램 종료.
   해당 파일이 없으면 해당 파일이 없습니다. 메세지 출력

[결과]
 파일명을 입력하세요(종료:exit)
 aaa.txt  =>존재하는 경우
 aaa.bak 파일에 aaa.txt의 내용을 복사하기

 파일명을 입력하세요(종료:exit)
 bbb.txt  =>존재하지 않는 경우
 해당 파일이 없습니다. 
 */
public class Test1 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("파일명을 입력하세요(종료:exit)");
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
			System.out.println("해당 파일의 복사가 완료되었습니다.");
			continue;
			
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일이 없습니다."); continue;
			
	}
	}
		}
}
