package chap10;
/*
 * ���� Ŭ���� ����
 * 
 *    static ���� Ŭ���� : Ŭ���� ���ο� �����. Ŭ���� ����� ���� �� �ִ�.
 *    �ν��Ͻ� ���� Ŭ���� : Ŭ���� ���ο� �����. Ŭ���� ����� ���� �� ����. ����� ����
 *    ���� ���� Ŭ���� : �޼��� ������ ����� Ŭ����
 *    
 * ���� Ŭ���� Ư¡
 *   1. Ŭ���� ���ο� �����ϴ� Ŭ����
 *   2. �ڷ������� ����. ��üȭ ����. Object Ŭ������ ���� Ŭ������. �������̽� ���� ����. ����Ʈ�ڵ嵵 ������.
 *      ���(����, �޼���, ������)�� ������ �� ����. 
 *   3. �ܺ� Ŭ������ �����. => �ܺ� Ŭ������ private ����� ���� ����
 *                      => static ���� Ŭ���� : ��üȭ���� �ʰ� new �ܺ�Ŭ������.����Ŭ������(); ���� ��ü ���� ����.
 *                      => �ν��Ͻ� ���� Ŭ���� : �ܺ�Ŭ������ü�� ��������.new ����Ŭ������(); ���·� ��ü ���� ����.
 */
class Outer1{
	static class StaticInner {  //static ���� Ŭ���� : �ν��Ͻ� ���, static(Ŭ����) ���, ��� ��� ���� �� ����.
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	class InstanceInner {  //�ν��Ͻ� ���� Ŭ���� : static ��� ���� �� ����
		int iv= 100;
//		static int cv = 10;
		final static int MAX = 200;  //����� ��� ����
	}
	void method() {
		class LocalInner {   //���� ���� Ŭ���� : static ��� ���� �� ����
			int iv = 600;
//			static int cv=700;
			final static int MAX = 700;
		}
		LocalInner lc = new LocalInner();
		System.out.println(lc.iv);
		System.out.println(lc.MAX);
	}
	void method2() {
//		LocalInner lc = new LocalInner(); //���Ұ� LocalInner Ŭ������ method()�޼��� �ȿ����� ��밡��
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		//Outer1 Ŭ������ method �޼��� ȣ���ϱ�
		Outer1 o = new Outer1();
		o.method();
		Outer1.StaticInner os = new Outer1.StaticInner(); //static ���� Ŭ���� ��üȭ -> Ŭ���� ������ �ε�Ǹ� ��üȭ ��
		System.out.println(os.iv);
		System.out.println(Outer1.StaticInner.cv);
		System.out.println(Outer1.StaticInner.MAX);
		
//		Outer1.InstanceInner oi = new Outer1.InstanceInner(); // X
		Outer1.InstanceInner oi = o.new InstanceInner();  //�ν��Ͻ� ���� Ŭ���� ��üȭ -> ����������.new �ν��Ͻ�����Ŭ������
		System.out.println(oi.iv);
        System.out.println(Outer1.InstanceInner.MAX);
	}

}
