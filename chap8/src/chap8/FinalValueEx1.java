package chap8;
/*
 * final ���� : ���� �Ұ� ���� => ���
 * 
 * final ������ �����ڿ��� �� ���� ���� ������ �� �ִ�. => ��ü���� �ٸ� ��� ���� ���� �� �ֵ��� �ϱ� ����.
 *   => ��, ����� �ʱ�ȭ�� �ȵ� ��츸 ������. ����� �ʱ�ȭ�� �� ��쿡�� �����ڿ����� �ʱ�ȭ �ȵ�.
 */

class FinalValue {
	final int NUM;
	FinalValue(int num) {
		NUM = num;
	}
	public int getNUM() {
		return NUM;
	}
}

public class FinalValueEx1 {
	public static void main(String[] args) {
		FinalValue f1 = new FinalValue(10);
		System.out.println(f1.getNUM());  //10
//		f1.NUM = 100; //error "���"
		FinalValue f2 = new FinalValue(20);
		System.out.println(f2.getNUM());  //20
		FinalValue f3 = new FinalValue(30);
		System.out.println(f3.getNUM());  //30
	}

}
