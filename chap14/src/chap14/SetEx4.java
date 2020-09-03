package chap14;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * ����� ���� Ŭ������ ��ü�� TreeSet�� �����ϱ�
 * 
 * ���� ���� �������̽�
 *   1. Comparable<T> �������̽�
 *     int compareTo(T) : ��ü�� �⺻ ���Ĺ���� �����Ҷ� ���
 *   2. Comparator<T> �������̽�
 *     int compare(T,T) : ���� �� ���Ĺ���� ������ �� ����.
 */
class Phone implements Comparable<Phone>{
	String name;
	int number;
	public Phone(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public String toString() {
		return "(" + name + "," + number + ")";
	}
	@Override
	public int compareTo(Phone p) {
		return name.compareTo(p.name);  //���Ĺ�� :�̸��� ���� ����
	}
	
}
public class SetEx4 {
	public static void main(String[] args) {
		System.out.println("�̸������� �����Ͽ� ����ϱ�");
		TreeSet<Phone> set = new TreeSet<>();
		set.add(new Phone("ȫ�浿", 1234));
		set.add(new Phone("���", 3456));
		set.add(new Phone("�̸���", 5678));
		System.out.println(set);
		System.out.println("��ȭ��ȣ������ �����Ͽ� ����ϱ�");
		set = new TreeSet<>(new Comparator<Phone>() {
			@Override
			public int compare(Phone o1, Phone o2) {
				return o1.number-o2.number;
			}
		});
		set.add(new Phone("ȫ�浿", 1234));
		set.add(new Phone("���", 3456));
		set.add(new Phone("�̸���", 5678));
		System.out.println(set);
		System.out.println("��ȭ��ȣ ������������ �����Ͽ� ����ϱ�");
		set = new TreeSet<>(new Comparator<Phone>() {
			@Override
			public int compare(Phone o1, Phone o2) {
				return o2.number-o1.number;
			}
		});
		set.add(new Phone("ȫ�浿", 1234));
		set.add(new Phone("���", 3456));
		set.add(new Phone("�̸���", 5678));
		System.out.println(set);
		System.out.println("�̸��� �������� �����Ͽ� ����ϱ�");
//		set = new TreeSet<>(Comparator.reverseOrder()); //Comparator.reverseOrder() ���-> �� ������ ����
		set = new TreeSet<>(new Comparator<Phone>() {
			public int compare(Phone o1, Phone o2) {
				return o1.compareTo(o2)*(-1);
			}
		});
		set.add(new Phone("ȫ�浿", 1234));
		set.add(new Phone("���", 3456));
		set.add(new Phone("�̸���", 5678));
		System.out.println(set);
	}

}
