package chap7;
/*
 * 
 */

class Rectangle5 {
	int width, height, serialNo;
	static int sno;
	int area() {
		return width * height;
	}
	int length() {
		return 2 * (width + height);
	}
	/*
	 * boolean isSquare() {
	 *    return width == height;
	 * }
	 * ->
	 * public String toString() {
	 * ... +((isSquare())?"���簢��":"���簢��);
	 * }
	 */
	
	Rectangle5(int width, int height) {
		this.width = width;
		this.height = height;
		serialNo = ++sno;
	}
	Rectangle5(int width) {
		this(width, 1);
	}
	Rectangle5() {
		this(1, 1);
	}
	
	public String toString() {
		return serialNo + "�� �簢��: (" + width + "," + height + ") ����:" + area() + ", �ѷ�:" + length() + ", " 
	           +((width==height)?"���簢��":"���簢��");
	}
	
}

public class Exam5 {

	public static void main(String[] args) {
		Rectangle5 r1 = new Rectangle5();
		Rectangle5 r2 = new Rectangle5(10);
		Rectangle5 r3 = new Rectangle5(10,10);
		System.out.println(r1);  //1�� �簢��: (1,1) ����:1, �ѷ�:2, ���簢��
		System.out.println(r2);  //2�� �簢��: (10,1) ����:10, �ѷ�:22, ���簢��
		System.out.println(r3);  //3�� �簢��: (10,10) ����:100, �ѷ�:40, ���簢��
	}

}
