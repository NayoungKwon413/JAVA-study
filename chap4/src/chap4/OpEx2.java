package chap4;
/*
 * ���� ������ ���� 2 : ���� �����ڿ� �ٸ� �����ڰ� ���� ���� ���
 *    ������ : ++x -> �ٸ� ���꺸�� ���� �������� ������
 *    ������ : x++ -> �ٸ� ������ ���� �� ���߿� �������� ������
 */
public class OpEx2 {

	public static void main(String[] args) {
		int x=5, y=0;
		y = x++; 
		System.out.println("x="+x+", y="+y);
		y = ++x;
		System.out.println("x="+x+", y="+y);
		y = x--;
		System.out.println("x="+x+", y="+y);  //x=6 y=7
		y = --x;
		System.out.println("x="+x+", y="+y);  //x=5 y=5
		System.out.println("x="+ x++);  //x=5 : x�� ���� x���� ������ ����
		System.out.println("x="+x);     //x=6 
		System.out.println("x="+ ++x);  //x=7 : x ���� ���� 1 ���� �� �ٽ� ����

	}

}
