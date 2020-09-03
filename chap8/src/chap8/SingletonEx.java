package chap8;
/*
 * ���� �����ڸ� �̿��� ��ü�� �����ϱ�
 */

class SingleObject {
	private static SingleObject obj = new SingleObject();
	private SingleObject() {}  //������ : Ŭ�����̸��� ���� ���ϰ� ����. private ������ -> ��ü ���� �� ����.
	private int value = 100;
	public static SingleObject getObject() {
		return obj;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}

public class SingletonEx {
	public static void main(String[] args) {
		//SingleObject so = new SingleObject(); error -> ��ü�����Ұ�. �����ڿ� ���� �Ұ�
		SingleObject so1 = SingleObject.getObject();
		SingleObject so2 = SingleObject.getObject();
		System.out.println(so1.getValue());
		System.out.println(so2.getValue());
		so1.setValue(500);
		System.out.println(so1.getValue());
		System.out.println(so2.getValue());
		if(so1 == so2) {
			System.out.println("so1�� so2�� ���� ��ü�� �����ϰ� �ִ�.");
		}

	}

}
