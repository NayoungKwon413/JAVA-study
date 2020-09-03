package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/*
 * Properties 클래스
 *   Hashtable의 하위 클래스.(Map 객체)
 *   <String, String>인 Map 클래스 => 제네릭 표현 사용하지 않음
 *   텍스트 File에서 객체로 저장이 가능함.
 *   = 을 기준으로 왼쪽의 문자열은 key로, 오른쪽 문자열은 value 값으로 저장
 */
public class PropertiesEx1 {

	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		FileInputStream fis = new FileInputStream("a.properties");
		pr.load(fis);  //fis가 참조하고 있는 파일의 내용을 Properties 객체의 내용으로 로드
		System.out.println(pr);
		System.out.println("이름:"+pr.get("name"));
		pr.put("subject","컴퓨터공학");
		System.out.println(pr);
		//Properties 객체의 내용을 파일에 저장
		pr.store(new FileOutputStream("b.properties"), "save");

	}

}
