package chap7;
/*
 *  ����Ŭ����(Animal)
    ������� : �̸�(name), ����(age)
    ����޼���: eat() ;
    ��� : "���ְ� ���" ���

[���]
     �̸�(name):������
     ����(age):20
     ���ְ� ���  
 */

class Animal {
	String name;
	int age;
	String eat() {
		return "���ְ� ���";
	}
	public String toString() {
		return "�̸�(name):" + name + "\n����(age):" + age + "\n"+ eat();
	}
}

public class hw4 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.name = "������";
		a1.age = 20;
		System.out.println(a1);

	}

}
