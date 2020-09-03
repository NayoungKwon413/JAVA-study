package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * src/chap15 폴더의 .java 파일 중 InputStream 관련 모든 소스를 InputStream예제.txt 파일로 생성하기   
 * InputStream 관련 모든 소스 : XXXInputStreamXXX.java
 */
public class Test2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("InputStream예제.txt");
		String filePath = "src/chap15";
		File f1= new File(filePath);
		String files[] = f1.list();
		for(String f:files) {
			if(f.indexOf("InputStream") != -1) {
				FileInputStream fis = new FileInputStream("src/chap15/"+f);
				int data;
				byte[] buf = new byte[fis.available()];
				while((data = fis.read(buf)) != -1) {
					fos.write(("\n**********" + f + "**********\n").getBytes());
					fos.write(buf,0,data);
				}
				
			}
		}
		System.out.println("InputStream예제.txt 파일로 복사완료");
	}

	
}
