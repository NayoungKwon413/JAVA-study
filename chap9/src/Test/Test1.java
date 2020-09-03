/*
 * ���� Ŭ������ �����Ͻÿ�
 1. Animal Ŭ���� => �߻�Ŭ����
    ������� : ������ ����, �ٸ���
    ������ : ������ ������ �ٸ��� �Է¹ޱ�.
    ����޼��� :
        void eat(); => �߻�޼���
        void sound(); => �߻�޼���
 2. DogŬ����  :  Animal Ŭ������ �ڼ�Ŭ����
    �������� �Ű����� ����.
    ����޼��� :
        void eat() :  "������ �ִ´�� �Դ´�" ���
        void sound(); "�۸�¢�´�";
 3. LionŬ����  :  Animal Ŭ������ �ڼ�Ŭ����
    �������� �Ű����� ����.
    ����޼��� :
        void eat() :  "�ʽĵ����� ��� �Դ´�" ���
        void sound(); "����Ÿ���";
  [���]
������,�ٸ���:4�� =>�۸�¢�´�
������ �ִ´�� �Դ´�
����,�ٸ���:4�� =>����Ÿ���
�ʽĵ����� ��ƸԴ´�
 */
package Test;
abstract class Animal {
	String type;
	int legs;
	Animal(String type, int legs) {
		this.type=type;
		this.legs=legs;
	}
	void eat() {};
	void sound() {};
}
class Dog extends Animal {
	Dog() {
		super("������", 4);
	}
	@Override
	void eat() {
		System.out.println("������ �ִ´�� �Դ´�");
	}
	void sound() {
		System.out.println("�۸�¢�´�");
	}
	
	
}
class Lion extends Animal {
	Lion() {
		super("����", 4);
	}
	@Override
	void eat() {
		System.out.println("�ʽĵ����� ��ƸԴ´�");
	}
	void sound() {
		System.out.println("����Ÿ���");
	}
}
public class Test1 {

	public static void main(String[] args) {
		Animal[] animal = new Animal[2];
		  animal[0] = new Dog();
		  animal[1] = new Lion();
		  for(Animal a : animal) {
		   System.out.print(a.type +",�ٸ���:" + a.legs + "��" + "=>");
		   a.sound();
		   a.eat();
		  }
	}

}
