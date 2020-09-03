package chap14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 1. ���ѹα�(����), ĳ����(��Ÿ��), ����(����), ������(����)�� HashMap�� �����ϰ�
 *    ȭ�鿡�� �����̸��� �Է¹޾� �ش� ������ ����ϴ� ���α׷� �ۼ��ϱ�
 * 2. ��ϵ� ���� �ƴ� ���, "��ϵ� ���� �ƴմϴ�. ������ �Է��Ͻðڽ��ϱ�?(y)"
 *    y �ϋ� "������ �Է��ϼ���" �޽��� ��� �� HashMap �����̸��� �����̸� ����ϱ�
 * 3. ���α׷� ���� �� map�� ���� ����ϱ�
 *    keySet()
 *    entrySet()
 */
public class Exam4 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		String[] nation = {"���ѹα�", "ĳ����", "����", "������"};
		String[] city = {"����", "��Ÿ��", "����", "����"};
		for(int i=0; i<nation.length; i++) {
			map.put(nation[i], city[i]);
		}
		Scanner scan = new Scanner(System.in);
		while(true) {
	    System.out.println("�����̸��� �Է��ϼ���(����:����)");
		String n = scan.next();
//      keySet()
//		if(n.equals("����")) {
//			for(String key:map.keySet()) System.out.println(key+"�� ����:"+map.get(key));
//			break;
//		}
		//entrySet()
		if(n.equals("����")) {
			Set<Map.Entry<String, String>> entry = map.entrySet();
			for(Map.Entry<String, String> m : entry) {
				System.out.println(m.getKey() +"�� ����:"+ m.getValue());
				
			}break;
		}
		if(map.get(n)==null) {
			System.out.println("��ϵ� ���� �ƴմϴ�. ������ �Է��Ͻðڽ��ϱ�?");
			if(scan.next().equals("y")) {System.out.println("������ �Է��ϼ���.");
			map.put(n, scan.next());continue;
			}else if(scan.next().equals("n"))continue;
		}
		System.out.println(n+"�� ������ "+map.get(n)+"�Դϴ�.");
		}
		
	}

}
