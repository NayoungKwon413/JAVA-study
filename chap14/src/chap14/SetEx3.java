package chap14;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet ����
 *   Set �������̽��� ���� �������̽��� SortedSet�� ���� Ŭ����
 *   Set : �ߺ��Ұ�
 *   SortedSet : Set �������̽��� ���� �������̽�. ���ĵ�
 */
public class SetEx3 {
	public static void main(String[] args) {
//		Set<String> set = new TreeSet<>();  //�����ϳ� subSet ����� �� ���� -> ������ ���� ����. TreeSet�� ��� �ڵ����ĵǱ� ������ ������ �ڸ��� ���� ��밡��
//		SortedSet<String>set = new TreeSet<>(); //����
		TreeSet<String> set = new TreeSet<>();
		String from = "bat";
		String to = "d";
		set.add("abc"); set.add("alien");
		set.add("bat"); set.add("azz");
		set.add("car"); set.add("Car");
		set.add("disc"); set.add("dance");
		set.add("dZZZZ"); set.add("dzzzz");
		set.add("elevator"); set.add("fan");
		set.add("flower"); 
		System.out.println(set);
		System.out.println("from:" +from+", to:"+to);
		System.out.println(set.subSet(from, to));
		System.out.println("from:" +from+", to:"+to+"zzzz");
		System.out.println(set.subSet(from, to+"zzzz"));
		//�������� �����ϱ�
//		set = new TreeSet<>(new Descending());
		
//		set = new TreeSet<>(new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return s2.compareTo(s1);
//			}
//		});  //�̷��� ������ ����
		
		//jdk8.0 ���� ���� ����
//		set = new TreeSet<>(Comparator.reverseOrder()); //Comparator.reverseOrder() �޼��� ����ϸ� �ٷ� �������� ��ȯ��.
		
		//set ������ ��ҹ��� ������� ������������ �����ϱ�
		set = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareToIgnoreCase(s2);
			}
		});
		//set ������ ��ҹ��� ������� ������������ �����ϱ� => ���ٹ������
		set = new TreeSet<>((s1,s2)->s1.compareToIgnoreCase(s2));
		
		set.add("abc"); set.add("alien");
		set.add("bat"); set.add("azz");
		set.add("car"); set.add("Car");
		set.add("disc"); set.add("dance");
		set.add("dZZZZ"); set.add("dzzzz");
		set.add("elevator"); set.add("fan");
		set.add("flower"); 
		System.out.println(set);
	}

}
class Descending implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2)* (-1);
//		return s2.compareTo(s1);  //�̷��� ������ ����
	}
}