package chap18;
/*
 * �Ű������� �ְ�, ����Ÿ�Ե� �ִ� ���
 */
interface LambdaInterface4{
	int method(int x, int y);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		LambdaInterface4 f4 = (x,y)->{  //�Ű������� 2�� �̻��̱� ������ () ������ �� ����
			return x*y;
		};
		System.out.println("�μ��� ��:"+f4.method(2, 5));
		f4 = (x,y)->x+y;  //������ �ϳ��� {}�� return ��������
		System.out.println("�μ��� ��:"+f4.method(2, 5));
		f4=(x,y)->x-y;
		System.out.println("�μ��� ����:"+f4.method(5, 2));
		f4=(x,y)->x%y;
		System.out.println("�μ��� ���� ������:"+f4.method(5, 2));
		f4=(x,y)->sum(x,y);
		System.out.println("�μ��� ��:"+f4.method(2, 5));
		f4=(x,y)->(x>y)?x:y;
		System.out.println("�μ� �� ū��:"+f4.method(2, 5));
		f4=(x,y)->(x<y)?x:y;
		System.out.println("�μ� �� ������:"+f4.method(2, 5));
	}
	private static int sum(int x, int y) {
		return x+y;
	}
	
}
