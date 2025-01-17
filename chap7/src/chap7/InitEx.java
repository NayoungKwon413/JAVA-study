package chap7;
/*
 * 초기화 블럭 예제
 *   static 초기화 블럭:
 *      주요기능 : 클래스 변수의 초기화
 *      실행시점 : 클래스 정보가 로드될 때 한 번 실행.
 *   인스턴스 초기화 블럭 :
 *      주요기능 : 인스턴스 변수의 초기화, 생성자와 기능이 겹침.
 *      실행시점 : 객체 생성 시 생성자 호출 전 먼저 호출됨.
 */
public class InitEx {
	static int cv;
	int iv;
	InitEx() {
		System.out.println("5. 생성자 호출됨");
	}
	static {  //static 초기화 블럭 혹은 클래스 초기화 블럭
		cv = (int)(Math.random() * 100);
		System.out.println("1. static 초기화 블럭 cv=" + cv);
	}
	{  //인스턴스 초기화 블럭
		iv = (int)(Math.random() * 100);
		System.out.println("4. 인스턴스 초기화 블럭 iv=" + iv);
	}

	public static void main(String[] args) {
		System.out.println("2. main 메서드 시작");
		System.out.println("3. main init1 객체 생성");
		InitEx init1 = new InitEx();
		System.out.println("3. main init2 객체 생성");
		InitEx init2 = new InitEx();
	
	}

}
