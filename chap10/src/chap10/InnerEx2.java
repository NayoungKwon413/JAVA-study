package chap10;
/*
 * �ܺ� Ŭ������ ���� Ŭ������ ��ȣ ȣ��
 */
class Outer2{
	private int outeriv = 10;
	private static int outercv=20;
	class InstanceInner{
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner{
//		int siv = outeriv; //Ŭ���� ������� �ν��Ͻ� ��� ȣ�� �� ��üȭ �ʿ�
//		int siv = new Outer2().outeriv;
		static int scv = outercv;
	}
	static StaticInner cv = new StaticInner();
	InstanceInner iv = new InstanceInner();
//	static InstanceInner cv2 = new InstanceInner();  //cv2�� static ���. 
	static InstanceInner cv2 = new Outer2().new InstanceInner();
	StaticInner iv2 = new StaticInner();
	
	void method(final int pv) {
//		pv++;
		final int num=100;
//		num++;
		class LocalInner{  //���� ���� Ŭ����
			int liv = outeriv;  //�ܺ� Ŭ������ private ��� ���� ���� -> Outer2 Ŭ������ ���� ���
			int liv2 = outercv;
			void method() {
				//��������Ŭ�������� �ܺ� �޼����� ���������� ��� ��, �ش� ���������� ���ȭ �Ǿ�� �Ѵ�.
				System.out.println("pv=" + pv);  
				System.out.println("num=" + num);
				System.out.println("liv="+ liv);
				System.out.println("outeriv=" +outeriv);
			}
		}
		LocalInner li = new LocalInner();
		li.method();
	}
}
public class InnerEx2 {
	public static void main(String[] args) {
		//InstanceInner Ŭ������ ��üȭ, ������� ȭ�鿡 ���
		Outer2 out2 = new Outer2();
		Outer2.InstanceInner oi = out2.new InstanceInner();
		System.out.println(oi.iiv);
		System.out.println(oi.iiv2);
		//StaticInner Ŭ������ ��üȭ, ������� ȭ�鿡 ���
		Outer2.StaticInner os = new Outer2.StaticInner();
		System.out.println(os.scv);
		System.out.println(Outer2.StaticInner.scv);
		//method() ȣ���ϱ�
		out2.method(100);
	}

}
