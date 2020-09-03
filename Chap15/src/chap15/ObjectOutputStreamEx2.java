package chap15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 상속 관계에서 직렬화
 */
class UserInfo {
	protected String name;
	protected String password;
	public UserInfo() {}
	public UserInfo(String name, String password) {
		this.name=name;
		this.password=password;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", password=" + password +"]";
	}
}
class User extends UserInfo implements Serializable { //부모가 Serializable을 구현하면 문제 없으나, 그렇게 하지 않은 이유 o
	private int age;
	public User(String name, String password, int age) {
		super(name, password);
		this.age=age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age +"]";
	}
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);      //부모의 정보는 따로따로 처리 (UTF : 문자열)
		out.writeUTF(password);
		out.defaultWriteObject();  //기본적으로 User 클래스가 갖고 있는 것은 한꺼번에 처리
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	}
}
public class ObjectOutputStreamEx2 {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object2.ser"));
		User u1 = new User("홍길동", "1234", 20);
		User u2 = new User("김삿갓", "5678", 30);
		oos.writeObject(u1);
		oos.writeObject(u2);
		System.out.println("사용자1:"+u1);
		System.out.println("사용자2:"+u2);
	}
}
