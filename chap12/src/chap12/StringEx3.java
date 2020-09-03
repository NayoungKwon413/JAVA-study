package chap12;
/*
 * String Ŭ������ �޼���2
 */
public class StringEx3 {
	public static void main(String[] args) {
		String s = "HTML-CSS-JavaScript-JAVA-JSP-������";
		String[] subject = s.split("-");  //split : ���ڿ��� �з��Ͽ� ��ūȭ
		for(int i=0; i<subject.length; i++) {
			System.out.println((i+1)+":"+subject[i]);
		}
		s="ȫ�浿,���,�̸���,������,�Ӳ���";
		String[] subject2 = s.split(",");
/*		for(String n :subject2) {
			System.out.println(n);
		}
*/
		for(int i=0; i<subject2.length; i++) {
			System.out.println(subject2[i]);	
		}
		System.out.println("�� " + subject2.length + "��") ;

		//���� <= ���ڿ�
		int i = Integer.parseInt("255");
		System.out.println(i+1); //101
		double d = Double.parseDouble("10.5");
		System.out.println(d+1.1); //11.6
		float f = Float.parseFloat("10.5");
		System.out.println(f+1.1); //11.6
		
		//���ڿ��� Format ���·� ����ϱ�
		//%.2f : �Ǽ��� �Ҽ������� ���ڸ����� ��� => �Ҽ��� ���� ����° �ڸ����� �ݿø�
		String sf = String.format("%.2f", d+0.125);  //10.625->10.63
		System.out.println(sf);
		sf=String.format("%10d", i);  //10�ڸ� Ȯ���Ͽ� 100�� 10������ ���
		System.out.println(sf);
		sf=String.format("%x", i);  //100�� 16������ ��� (%X -> �빮��, %x -> �ҹ���)
		System.out.println(sf);
		sf=String.format("%o", i);  //100�� 8������ ���
		System.out.println(sf);
	}

}
