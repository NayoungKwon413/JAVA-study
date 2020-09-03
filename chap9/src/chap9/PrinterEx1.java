package chap9;
/*
 * ����Ÿ���� �������̽������� �����ϱ�
 */
class LazerZet implements Printerable {
	@Override
	public void print() {
		System.out.println("������ Printer ���� �����");
	}	
}
class InkZet implements Printerable {
	@Override
	public void print() {
		System.out.println("��ũ�� Printer ���� �����");		
	}	
}
class PrinterManager {
	public static Printerable getPrinter(String type) {  //����Ÿ���� Printerable�̶�� �������̽��� ���� -> �ϳ��� �ڷ��� ���� ������ ��.
		if(type.equals("INK")) return new InkZet();  //InkZet()�� LazerZet()�� ���� ������� Ŭ�����̳� Printerable �������̽��� �����.
		else return new LazerZet();
	}
}
public class PrinterEx1 {
	public static void main(String[] args) {
		Printerable a = PrinterManager.getPrinter("INK");
		a.print();
		a=PrinterManager.getPrinter("LAZER");
		a.print();

	}
}
