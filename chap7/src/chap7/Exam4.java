package chap7;
/*
 * 
 */

class Animal2 {
	String name;
	int age;
	String info() {
		return "�̸�:" + name + ", ����:" + age + "��";
	}
	Animal2(String n, int a) {
		name = n;
		age = a;
	}
	Animal2(int a) {
		this("���", a);
	}
	Animal2(String n) {
		this(n, 1);
	}
	Animal2() {
		this("���", 1);
	}
		
	}

public class Exam4 {

	public static void main(String[] args) {
		Animal2 a1= new Animal2("������",26);
		Animal2 a2= new Animal2(10);
		Animal2 a3= new Animal2("����");
		Animal2 a4= new Animal2();
		System.out.println(a1.info());  //�̸�:������, ����:26��
		System.out.println(a2.info());  //�̸�:���, ����:10��
		System.out.println(a3.info());  //�̸�:����, ����:1��
		System.out.println(a4.info());  //�̸�:���, ����:1��

	}

}
