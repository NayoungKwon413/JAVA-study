import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<String,String>();
		map.put("���ѹα�", "����");  map.put("����", "����");
		map.put("�̱�", "������");  map.put("�߱�", "����¡");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("������ �˰� ���� ���� �Է��ϼ���(����:��)");
			String key = scan.next();
			if(key.equals("��")) break;
			if(map.get(key)==null) {
				System.out.println("��ϵ��� ���� �����Դϴ�."); 
			}else System.out.println(key+"=" + map.get(key));
			
		}
		System.out.println(map.entrySet());
		
	}

}
