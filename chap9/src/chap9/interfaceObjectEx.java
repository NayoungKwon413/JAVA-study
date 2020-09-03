package chap9;
/*
 * �������̽��� ��ü �����ϱ�
 */
interface Action {
	void action();
}
abstract class Abs {
	abstract void method();
}
public class interfaceObjectEx {
	public static void main(String[] args) {
		//(����Ŭ������ ���� �������̵� �Ǳ� ����)�̸����� ���� Ŭ���� => ��ȸ�� ��ü�� ����
		Action a = new Action() {
			@Override
			public void action() {
				System.out.println("�������̽� ��ü 1");
			}
			
		};
		a.action();
		a = new Action() {
			@Override
			public void action() {
				System.out.println("�������̽� ��ü 2");
			}
			
		};
		a.action();
		
		Abs ab = new Abs() {
			@Override
			void method() {
				System.out.println("method() �޼��� �������̵�");
				
			}
			
		};
		ab.method();
	 
		//jdk8.0 ���� �������̽��� ���ٹ������ ó���ϱ� : �������̽��� ����(�߻�Ŭ������ x)
		a=() -> System.out.println("�������̽��� ���ٽ����� ó��");
		a.action();
	}

}
