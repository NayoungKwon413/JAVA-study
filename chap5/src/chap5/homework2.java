package chap5;
/*
 * ������ 2x+4y=10�� ��� �ظ� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �� x�� y�� �����̰�  ������ ������ 0<=x<=10, 0<=y<=10�� 
 * [���]
 * x=1,y=2
 * x=3,y=1
 * x=5,y=0

 */
public class homework2 {

	public static void main(String[] args) {
		int x =0;
		int y =0;
		for(x=0; x<=10; x++) {
			for(y=0; y<=10; y++) {
				if((2*x) + (4*y) ==10 )
				System.out.println("x=" + x + ", " + "y=" + y);
			}
		}

}

}