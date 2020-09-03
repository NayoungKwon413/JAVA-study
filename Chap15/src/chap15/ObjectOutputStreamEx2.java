package chap15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ��� ���迡�� ����ȭ
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
class User extends UserInfo implements Serializable { //�θ� Serializable�� �����ϸ� ���� ������, �׷��� ���� ���� ���� o
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
		out.writeUTF(name);      //�θ��� ������ ���ε��� ó�� (UTF : ���ڿ�)
		out.writeUTF(password);
		out.defaultWriteObject();  //�⺻������ User Ŭ������ ���� �ִ� ���� �Ѳ����� ó��
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
		User u1 = new User("ȫ�浿", "1234", 20);
		User u2 = new User("���", "5678", 30);
		oos.writeObject(u1);
		oos.writeObject(u2);
		System.out.println("�����1:"+u1);
		System.out.println("�����2:"+u2);
	}
}
