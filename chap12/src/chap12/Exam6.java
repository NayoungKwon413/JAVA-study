package chap12;
/*
 * format �޼��� �����ϱ�
 * �޼���� : StringBuffer format (���ڿ�, ���ڿ�ũ��, ���Ĺ��)
 * ��� : �־��� ���ڿ��� ������ ũ���� ���ڿ��� ��ȯ.
 *      ������ ������ �������� ä���.
 *      (0: ��������, 1: ��� ����, 2: ������ ����)
 */
public class Exam6 {
	public static void main(String[] args) {
		String str = "������";
		System.out.println(format(str, 9, 0));
		System.out.println(format(str, 9, 1));
		System.out.println(format(str, 9, 2));
		System.out.println(format(str, 2, 0));
	}
	static StringBuffer format(String str, int len, int align) {
		StringBuffer sb = new StringBuffer();
		if(str.length()>len)
			return sb.append(str.substring(0, len));
		for(int i=0; i<len; i++) {
			sb.append(" ");
		}
		int a = len-str.length();
		switch(align) {
		case 0 : sb.replace(0, str.length(), str); break; // ��������
		case 1 : sb.replace(a/2, str.length()+a/2, str); break; //��� ����
		case 2 : sb.replace(a, str.length()+a, str); break; //������ ����
		}
		return sb;
		}
	}


