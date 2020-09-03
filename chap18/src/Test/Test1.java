package Test;

import java.util.TreeSet;

/*1. Person Ŭ���� �����ϱ�
   ��� ���� : �̸�, ����
   ������ : ���� Ŭ������ �µ���
   ����޼��� : ��� ����� �µ��� toString  �޼��� �������̵� �ϱ�
2. ���� Ŭ���� �ϼ��ϱ� ���� ����� �µ��� ���� Ŭ������ �ϼ��ϱ�.
   ��  Comparator  �������̽��� FunctionInterface �̹Ƿ� ���ٽ����� ó����.
  [���]
�̸���:[���:30, ���ڹ�:25, ���ڹ�:20, �̸���:15, ȫ�浿:10]
���̼�:[ȫ�浿:10, �̸���:15, ���ڹ�:20, ���ڹ�:25, ���:30]
�̸� ����:[ȫ�浿:10, �̸���:15, ���ڹ�:20, ���ڹ�:25, ���:30]
���� ����:[���:30, ���ڹ�:25, ���ڹ�:20, �̸���:15, ȫ�浿:10]
 * 
 */
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name + ":" + age ;
	}
	public String getName() {return name;}
	public int getAge() {return age;}
	
}
public class Test1 {
	 public static void main(String[] args) {
		  Person[] arr = {
				  new Person("ȫ�浿",10),
		          new Person("���",30),
		          new Person("�̸���",15),
		          new Person("���ڹ�",25),
		          new Person("���ڹ�",20)};
		  
		  TreeSet<Person> s1 = new TreeSet<Person>((p1,p2)->p1.name.compareTo(p2.name));
		  for(Person p : arr) s1.add(p);
		  System.out.print("�̸���:");
		  System.out.println(s1);

		  TreeSet<Person> s2 = new TreeSet<Person>((p1,p2)->p1.age-p2.age);
		  for(Person p : arr) s2.add(p);
		  System.out.print("���̼�:");
		  System.out.println(s2);

		  TreeSet<Person> s3 = new TreeSet<Person>((p1,p2)->(p1.name.compareTo(p2.name))*-1);
		  for(Person p : arr) s3.add(p);
		  System.out.print("�̸� ����:");
		  System.out.println(s3);

		  TreeSet<Person> s4 = new TreeSet<Person>((p1,p2)->p2.age-p1.age);
		  for(Person p : arr) s4.add(p);
		  System.out.print("���� ����:");
		  System.out.println(s4);

		 }
	
		
}
