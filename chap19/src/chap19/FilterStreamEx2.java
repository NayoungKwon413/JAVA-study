package chap19;

import java.util.Arrays;
import java.util.List;

class Person{
	private String name;
	private String gender;
	private int age;
	public Person(String name, String gender, int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public String getName() {return name;}
	public String getGender() {return gender;}
	public int getAge() {return age;}
}
public class FilterStreamEx2 {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(//list�� Person �� ��ü��� �̷�����ֱ� ����
				new Person("ȫ�浿","��",30), new Person("���","��",40),
				new Person("������","��",20), new Person("�����","��",22));
		System.out.print("���ڵ��� �̸�(����) :");
		//p �� Person. 
//		list.stream().filter(p->p.getGender().equals("��")).forEach(p->System.out.print(p.getName()+"("+p.getAge()+")"+", "));
		list.stream().filter(p->p.getGender().equals("��")).forEach(p->System.out.printf("%s(%d),",p.getName(),p.getAge()));
		System.out.println();
		System.out.print("���ڵ��� �̸�(����) :");
		list.stream().filter(p->p.getGender().equals("��")).forEach(p->System.out.print(p.getName()+"("+p.getAge()+")"+", "));
		System.out.println();
		
		//mapXXX()
		//mapToInt : Stream�� �ٽ� IntStream ���·� ��ȯ
		//mapToInt(Person::getAge) ��ġ�� int���� ���̷θ� �̷���� Stream���� �ٲ� 
		//-> average().getAsDouble() �� ��Ʈ���� ���� ��ճ��� double ������
		double ageAvg = list.stream().filter(p->p.getGender().equals("��")).mapToInt(Person::getAge).average().getAsDouble();
		System.out.println("���ڵ��� ��� ����:"+ageAvg);
		ageAvg = list.stream().filter(p->p.getGender().equals("��")).mapToInt(p->p.getAge()).average().getAsDouble();
		System.out.println("���ڵ��� ��� ����:"+ageAvg);
		System.out.println("��� �̸��� ���:");
		list.stream().map(Person::getName).forEach(System.out::print);
	}

}
