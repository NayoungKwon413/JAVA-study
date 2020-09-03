package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap ����
 * 
 */
public class TreeMapEx1 {
	public static void main(String[] args) {
		TreeMap<String, String> map=new TreeMap<>();
		map.put("���ѹα�","����");
		map.put("����","����");
		map.put("ĳ����","��Ÿ��");
		map.put("������","����");
		System.out.println(map);
		System.out.println("�����̸��� �������� �����ϱ�");
		map=new TreeMap<>(Comparator.reverseOrder());
		map.put("���ѹα�","����");
		map.put("����","����");
		map.put("ĳ����","��Ÿ��");
		map.put("������","����");
		System.out.println(map);
		System.out.println("�����̸��� �������� �����ϱ�");
		map=new TreeMap<>();  //Map�� Ű�� ���� -> value �� �������� �����ϰ� ������ set->list �����ؼ� list�� ���
		map.put("���ѹα�","����");
		map.put("����","����");
		map.put("ĳ����","��Ÿ��");
		map.put("������","����");
		map.put("���׸���","���׸����Ƽ");
		Set<Map.Entry<String, String>> entry = map.entrySet();
		List<Map.Entry<String, String>> list = new ArrayList<>(entry);
		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
			@Override
			public int compare(Map.Entry<String, String> m1, Map.Entry<String, String> m2) {
				return m1.getValue().compareTo(m2.getValue());
			}
		});
		
		
		System.out.println(list);
	}
}
