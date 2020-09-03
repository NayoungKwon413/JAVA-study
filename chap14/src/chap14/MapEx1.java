package chap14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map �������̽� : (Key, ��ü) ������ ��ü�� ������ ��ü.
 * 
 *   ��ü �߰�, ���� : put(Ű, ��ü)
 *                 ��ϵǾ��� �ִ� Ű�� �ٽ� �߰��ϸ� �����ȴ�. 
 *   key�� �̿��Ͽ� ��ü�� ��ȸ : ��ü = get(Ű)
 *   key�鸸 ��ȸ : Set keySet()
 *   value�鸸 ��ȸ : Collection values()
 *   key�� value �� ���·� ��ü���� ��ȸ : Set<Map.entry<Key, value>> entrySet()
 *   ��ü ����: remove(Ű)
 * 
 * ����Ŭ����
 *   HashMap, Hashtable, TreeMap
 *   Hashtable�� Collection �����ӿ�ũ ������ ���Ǵ� Ŭ����. Thread �� safe�ϴ�
 *   HashMap �� Thread�� safe ���� �ʴ�.
 *   
 */
public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		String[] names = {"ȫ�浿", "���", "�̸���", "�Ӳ���", "���"};
		int [] nums = {1234, 4567, 2350, 9870, 3456};
		for(int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		//����� ��ȭ��ȣ ��� : ��ü <= map.get(Ű��)
		System.out.println("����� ��ȭ��ȣ:"+map.get("���"));
		//ȫ�浿�� ��ȭ��ȣ ���
		System.out.println("ȫ�浿�� ��ȭ��ȣ:"+map.get("ȫ�浿"));
		//Ű���� ���� ��ü�� ���ϸ� -> null
		System.out.println("�������� ��ȭ��ȣ:"+map.get("������"));
		//map���� key�鸸 ��ȸ
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k+"="+map.get(k));
		}
		//map���� ��ü�鸸 ��ȸ
		Collection<Integer> values = map.values();
		System.out.println(values);
		for(Integer v : values) {
			System.out.println(v);
		}
		//map���� (key, ��ü) ���� ��ü
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m);
			System.out.println(m.getKey()+ "=" + m.getValue());
		}
		//ȫ�浿 �� �����ϱ�
		Integer value = map.remove("ȫ�浿");
		System.out.println(value);
		System.out.println(map);
	}

}
