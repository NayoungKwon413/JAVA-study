package chap7;
/*
 * Exam2.java�� Rectangle2 Ŭ������ �����ڷ� �����ϱ�
 */

class Rectangle3 {
	int width, height, serialNo;
	static int sno;
	Rectangle3(int w, int h) {  //������
		width = w;
		height = h;
		serialNo = ++sno;
	}
	int area() {
		return width * height;
	}
	int length() {
		return (width + height) *2;
	}
	public String toString() {
		return serialNo + "/" + sno + " �簢��: (" + width + "," + height + ")" + " ����:" + area() + " �ѷ�:" + length() ;
	}
}

public class ConstructorEx3 {

	public static void main(String[] args) {
		/* Rectangle3 rec1 = new Rectangle3(10,20);
		Rectangle3 rec2 = new Rectangle3(15,25);
		Rectangle3 rec3 = new Rectangle3(20,30);
		
		System.out.println(rec1);
		System.out.println(rec2);
		System.out.println(rec3);
		
		System.out.println("��ü �簢���� ������ �� : " + (rec1.area() +rec2.area() +rec3.area()));
		System.out.println("��ü �簢���� �ѷ��� �� : " + (rec1.length() +rec2.length() +rec3.length())); */
		
		Rectangle3 arr[] = new Rectangle3[3];
		int totarea =0, totlength=0;
		for(int i=0; i<arr.length; i++) {
			arr[i] =new Rectangle3(i*5+10, i*5+20);
			totarea += arr[i].area();
			totlength += arr[i].length();
		}
		for(Rectangle3 r : arr) {
			System.out.println(r);
		}
		System.out.println("��ü �簢�� ������ �� : " + totarea);
		System.out.println("��ü �簢�� �ѷ��� �� : " + totlength);
	}

	}


