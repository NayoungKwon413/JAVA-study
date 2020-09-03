package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ��Ӱ��� ����ȭ ����
 * ���Ͽ��� ��ü�� �о� �����ϱ� 
 */
public class ObjectInputStreamEx2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.ser"));
		User u1=(User)ois.readObject();
		User u2=(User)ois.readObject();
		System.out.println("������ �����1 :"+u1);
		System.out.println("������ �����2 :"+u2);
	}
}
