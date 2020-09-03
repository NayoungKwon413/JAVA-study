package chap9;
/*
 * 리턴타입을 인터페이스형으로 설정하기
 */
class LazerZet implements Printerable {
	@Override
	public void print() {
		System.out.println("레이저 Printer 에서 출력함");
	}	
}
class InkZet implements Printerable {
	@Override
	public void print() {
		System.out.println("잉크젯 Printer 에서 출력함");		
	}	
}
class PrinterManager {
	public static Printerable getPrinter(String type) {  //리턴타입을 Printerable이라는 인터페이스로 설정 -> 하나의 자료형 으로 생각할 것.
		if(type.equals("INK")) return new InkZet();  //InkZet()과 LazerZet()은 전혀 관계없는 클래스이나 Printerable 인터페이스로 연결됨.
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
