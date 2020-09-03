package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/*
 * List ����
 * List �������̽�: Collection �������̽��� ���� �������̽�
 *               ��ü���� ������ �� ������ ����
 *      ����Ŭ���� : ArrayList, Vector ��
 */
public class ListEx1 {
	public static void main(String[] args) {
		//<Integer> : ���׸� ǥ��
		//List<Integer> : Integer ��ü�� ������ ������ �� �ִ� �ڷ���
		List<Integer> list = new ArrayList<Integer>();
		list.add(1); list.add(2); list.add(5);
		list.add(4); list.add(3); list.add(0);
		list.add(0);
		System.out.println(list);
		//list.size() : list ��ü�� ����� ���(Element)�� ���� ����
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+ ":"+list.get(i));
		}
		//list.subList(1, 4): 1�� �ε������� 3�� �ε������� �κ� list ��ü
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		System.out.println(list2);
		//Collection  -> �������̽�
		//Collections -> Ŭ���� : Collection �����ӿ�ũ�� ���õ� ����� �����ϱ� ���� Ŭ����
		Collections.sort(list2); //list2 ��ü�� ������
		System.out.println(list2);
		List<String> list3 = new ArrayList<String>();
		list3.add("1");
		list3.add("2");
		list3.add("3");
		list3.add(1+"");  //String ��ü�� ���� ����
		List list4 = new ArrayList();  //��� Ŭ������ ��ü ��ҷ� ���� ������. index �� ����� �ڷ����� �ٸ��� ������ ���� ���ɼ�����.
		list4.add(1);
		list4.add("1��");
		list4.add(new Date());
		
		
	}
}
