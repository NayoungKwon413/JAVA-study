package chap7;

public class MemberCallEx1 {
	static int cv1 =10;
	static int cv2 = cv1;  //Ŭ���� ��� �� ����(O)
	int iv1 = 100;
	int iv2 = iv1;  //�ν��Ͻ� ��� �� ����(O)
	int iv3 = cv1;  //�ν��Ͻ� ������� Ŭ���� ������� ����(O)
	//static int cv3 = iv1;  //Ŭ���� ������� �ν��Ͻ� ������� ����(X)
	static int cv3 = new MemberCallEx1().iv1;  //��üȭ �� ���ٰ���
	
	void method1() {
		System.out.println(cv1 + cv2);
		System.out.println(iv1 + iv2);
	}
	static void method2() {
		System.out.println(cv1 + cv2);
		//System.out.println(iv1 + iv2); //error
		MemberCallEx1 m = new MemberCallEx1();  //��üȭ �ʿ�
		System.out.println(m.iv1 + m.iv2);
	}

	public static void main(String[] args) {
		
		//method1();  //error
		new MemberCallEx1().method1();
		method2();

	}

}
