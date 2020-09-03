package chap18;
/*
 * �߻�޼����� �Ű������� �ְ�, ����Ÿ���� ���� ���
 * (�Ű�����) -> {...}
 * �Ű������� ������ �Ѱ��� ��� () ��������
 * ����Ǵ� ������ �� ������ ��� {} ��������
 */
@FunctionalInterface
interface LambdaInterface3{
	void method(int x);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		LambdaInterface3 fi = (x)->{
			System.out.println(x*5);
		};
		fi.method(2);
		fi.method(10);
		fi = x->System.out.println(x+x);
		fi.method(2);
		fi.method(10);
		//����:calc �޼��� �̿��ϱ�
		calc((x)->System.out.println(x+x)); //x+x�� �Լ� ȣ��
		calc((x)->System.out.println(x*x)); //x*x �Լ� ȣ��
	}
	static void calc(LambdaInterface3 f) {
		f.method(10);
	}
}
