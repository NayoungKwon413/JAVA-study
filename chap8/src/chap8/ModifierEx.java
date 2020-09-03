package chap8;
/*
 * ���� ������
 *   private < (default) < protected < public
 */

import chap8.test.Modifier2;


class Modifier {
	private int v1 = 100;
			int v2 = 200;
	protected int v3 = v1;
	public void method() {
		System.out.println("chap8.Modifier.method() �޼�����");
		System.out.println("v1 =" + v1);
		System.out.println("v2 =" + v2);
	}
}
class Modifier3 extends Modifier2 {
	public void method() {
	//	System.out.println("v1 =" + v1); //error ���������ڰ� private
	//	System.out.println("v2 =" + v2); //error ���������ڰ� (default)
		System.out.println("v3 =" + v3); //protected ���������� -> �ٸ� ��Ű������ ��Ӱ��迡���� ���� ���
		System.out.println("v4 ="+ v4); //public  ����������
	}
}

public class ModifierEx {
	public static void main(String[] args) {
		Modifier m1 = new Modifier();
		//System.out.println(m1.v1);  //error : ������ ���� �����ڰ� private�� -> ���ٺҰ�
		System.out.println(m1.v2);
		System.out.println(m1.v3);
		m1.method();
		Modifier3 m3 = new Modifier3();
	//	System.out.println("m3=" +m3.v1); //���� Ŭ������ �ƴ϶� ���� �ȵ�
	//	System.out.println("m3=" +m3.v2); //��Ű���� �޶� ���� �ȵ�
	//	System.out.println("m3=" +m3.v3); //��Ӱ��谡 �ƴϹǷ� ���� �ȵ�
		System.out.println("m3=" +m3.v4);

	}

}
