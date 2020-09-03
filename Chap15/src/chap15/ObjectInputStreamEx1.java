package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ObjectInputStream 예제
 */
public class ObjectInputStreamEx1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));
		Customer c1 = (Customer)ois.readObject(); //object.ser 파일에서 객체 한 개를 읽음. object 파일에는 Customer 객체가 저장되어 있으나 Object 타입으로 읽어옴
		Customer c2 = (Customer)ois.readObject();
		System.out.println("복원된 고객1:"+c1);
		System.out.println("복원된 고객2:"+c2);
	}
}
