package chap12;
/*
 * count �޼��� �����ϱ�
 * int count("���ڿ��ҽ�", "ã�� ���ڿ�") : ���ڿ� �ҽ����� ã�� ���ڿ��� ������ ����
 */

public class Exam2 {
	public static void main(String[] args) {
		
		System.out.println(count("12345AB12AB345AB", "12"));  //2
		System.out.println(count("12345AB12AB345AB", "AB"));  //3
		System.out.println(count("12345", "6"));  //0
	}
	 static int count(String str, String find) {
		int index=0;
		int num=0;
		int cnt=0;
		if(str.indexOf(find) == -1) {
			return 0;
		}else {
			while(true) {
				num = str.indexOf(find, index);
				if(num == -1) break;
				cnt++;
				index = num+find.length();
			}
		}
			return cnt;
	}
	
	

}
