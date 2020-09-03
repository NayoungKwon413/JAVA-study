package chap9;
/*
 * 인터페이스 예제
 * 
 * 인터페이스
 *   1. 인터페이스의 멤버는 상수, 추상메서드, default메서드, static 메서드만 가능하다.
 *      상수: (public static final) 자료형 상수명;
 *      int INK = 100;
 *      public int INK = 100;
 *      static int INK = 100;
 *      final int INK = 100; => 모두 가능. 안쓴 부분은 컴파일러가 자동으로 삽입함
 *      추상 메서드 : (public abstract)리턴타입 메서드명();
 *                int getA();
 *                abstract int getA();
 *                public int getA();  => 모두 가능
 *      default 메서드  => jdk 8.0 이후부터 사용가능. 구현부 존재함.
 *                  public default 리턴타입 메서드명() {  }
 *      static 메서드  => jdk 8.0 이후부터 사용가능. 구현부 존재함.
 *                  public static 리턴타입 메서드명() {  }
 *   2. 인터페이스의 멤버의 접근제어자는 public
 *   3. 객체화 불가 -> 구현클래스의 객체화를 통해서 객체화 됨.
 *   4. 클래스와 인터페이스 간은 구현으로 표현함.  => 다중구현 가능함.
 *   5. 인터페이스간의 상속이 가능하다. => 다중상속 가능함.
 */

interface Printerable {
//	(public static final) int INK = 100; -> (  )생략되어 있음
	int INK = 100;  //상수
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

//구현클래스 : 인터페이스를 구현한 클래스
class Complexer implements Complexerable {
	int ink;
	Complexer() {
		this.ink = INK;
	}

@Override
public void print() {
	System.out.println("종이에 출력합니다. 남은 잉크량" + --ink);
}

@Override
public void scan() {
	System.out.println("이미지를 scan 합니다.");	
}

@Override
public void send(String tel) {
	System.out.println(FAX_NO + "에서" + tel + "번호로 FAX를 전송합니다.");
}

@Override
public void receive(String tel) {
	System.out.println(tel + "에서" + FAX_NO + "로 FAX를 받았습니다.");
}	}

public class ComplexerEx1 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println("기본 잉크량 : " + Printerable.INK);
		System.out.println("FAX 번호 : " + Complexerable.FAX_NO);
		System.out.println("기본 잉크량 : " + Complexerable.INK);
		com.print();
		com.scan();
		com.receive("02-5678");
		com.send("02-5678");
		if(com instanceof Complexer) {
			System.out.println("com 객체는 Complexer 객체임");
		}
		if(com instanceof Complexerable) {
			System.out.println("com 객체는 Complexerable 객체임");
		}
		if(com instanceof Printerable) {
			System.out.println("com 객체는 Printable 객체임");
			Printerable p = (Printerable)com; //(Printerable) 생략가능
			p.print();
//			p.scan(); //error -> Printerable 멤버가 아니기 때문에 접근 불가
		}
		if(com instanceof Scannerable) {
			System.out.println("com 객체는 Scannerable 객체임");
		    Scannerable s = com;
		    s.scan(); 
		}
		if(com instanceof Faxable) {
			System.out.println("com 객체는 Faxable 객체임");
			Faxable f = com;
			System.out.println(f.FAX_NO);
			f.send("01234");
			f.receive("5678");
		}
	}
}

