package chap4;
/*
 * ���� ������
 *     ���� ������
 *     ++ : ������ ���� 1 ����
 *     -- : ������ ���� 1 ����
 */
public class OpEx1 {

	public static void main(String[] args) {
		int x=5, y=5;
		x++;   //������(:�����ڰ� �ڿ� �پ�����)
		y++;
	    System.out.println("x="+x + ",y=" +y);
	    x=y=5;
	    ++x;   //������(:�����ڰ� �տ� �پ�����) 
	    --y;
	    System.out.println("x="+x + ",y=" +y);

	
	}

}
