package chap7;

public class MemberCallEx1 {
	static int cv1 =10;
	static int cv2 = cv1;  //클래스 멤버 간 접근(O)
	int iv1 = 100;
	int iv2 = iv1;  //인스턴스 멤버 간 접근(O)
	int iv3 = cv1;  //인스턴스 멤버에서 클래스 멤버로의 접근(O)
	//static int cv3 = iv1;  //클래스 멤버에서 인스턴스 멤버로의 접근(X)
	static int cv3 = new MemberCallEx1().iv1;  //객체화 후 접근가능
	
	void method1() {
		System.out.println(cv1 + cv2);
		System.out.println(iv1 + iv2);
	}
	static void method2() {
		System.out.println(cv1 + cv2);
		//System.out.println(iv1 + iv2); //error
		MemberCallEx1 m = new MemberCallEx1();  //객체화 필요
		System.out.println(m.iv1 + m.iv2);
	}

	public static void main(String[] args) {
		
		//method1();  //error
		new MemberCallEx1().method1();
		method2();

	}

}
