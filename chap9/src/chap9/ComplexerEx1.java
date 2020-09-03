package chap9;
/*
 * �������̽� ����
 * 
 * �������̽�
 *   1. �������̽��� ����� ���, �߻�޼���, default�޼���, static �޼��常 �����ϴ�.
 *      ���: (public static final) �ڷ��� �����;
 *      int INK = 100;
 *      public int INK = 100;
 *      static int INK = 100;
 *      final int INK = 100; => ��� ����. �Ⱦ� �κ��� �����Ϸ��� �ڵ����� ������
 *      �߻� �޼��� : (public abstract)����Ÿ�� �޼����();
 *                int getA();
 *                abstract int getA();
 *                public int getA();  => ��� ����
 *      default �޼���  => jdk 8.0 ���ĺ��� ��밡��. ������ ������.
 *                  public default ����Ÿ�� �޼����() {  }
 *      static �޼���  => jdk 8.0 ���ĺ��� ��밡��. ������ ������.
 *                  public static ����Ÿ�� �޼����() {  }
 *   2. �������̽��� ����� ���������ڴ� public
 *   3. ��üȭ �Ұ� -> ����Ŭ������ ��üȭ�� ���ؼ� ��üȭ ��.
 *   4. Ŭ������ �������̽� ���� �������� ǥ����.  => ���߱��� ������.
 *   5. �������̽����� ����� �����ϴ�. => ���߻�� ������.
 */

interface Printerable {
//	(public static final) int INK = 100; -> (  )�����Ǿ� ����
	int INK = 100;  //���
//	(public abstract) void print();
	void print();
}
interface Scannerable {
	void scan();
}
interface Faxable {
	String FAX_NO = "010-12345";
	void send(String tel);
	void receive(String tel);
}
interface Complexerable extends Printerable, Scannerable, Faxable {}

//����Ŭ���� : �������̽��� ������ Ŭ����
class Complexer implements Complexerable {
	int ink;
	Complexer() {
		this.ink = INK;
	}

@Override
public void print() {
	System.out.println("���̿� ����մϴ�. ���� ��ũ��" + --ink);
}

@Override
public void scan() {
	System.out.println("�̹����� scan �մϴ�.");	
}

@Override
public void send(String tel) {
	System.out.println(FAX_NO + "����" + tel + "��ȣ�� FAX�� �����մϴ�.");
}

@Override
public void receive(String tel) {
	System.out.println(tel + "����" + FAX_NO + "�� FAX�� �޾ҽ��ϴ�.");
}	}

public class ComplexerEx1 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println("�⺻ ��ũ�� : " + Printerable.INK);
		System.out.println("FAX ��ȣ : " + Complexerable.FAX_NO);
		System.out.println("�⺻ ��ũ�� : " + Complexerable.INK);
		com.print();
		com.scan();
		com.receive("02-5678");
		com.send("02-5678");
		if(com instanceof Complexer) {
			System.out.println("com ��ü�� Complexer ��ü��");
		}
		if(com instanceof Complexerable) {
			System.out.println("com ��ü�� Complexerable ��ü��");
		}
		if(com instanceof Printerable) {
			System.out.println("com ��ü�� Printable ��ü��");
			Printerable p = (Printerable)com; //(Printerable) ��������
			p.print();
//			p.scan(); //error -> Printerable ����� �ƴϱ� ������ ���� �Ұ�
		}
		if(com instanceof Scannerable) {
			System.out.println("com ��ü�� Scannerable ��ü��");
		    Scannerable s = com;
		    s.scan(); 
		}
		if(com instanceof Faxable) {
			System.out.println("com ��ü�� Faxable ��ü��");
			Faxable f = com;
			System.out.println(f.FAX_NO);
			f.send("01234");
			f.receive("5678");
		}
	}
}

