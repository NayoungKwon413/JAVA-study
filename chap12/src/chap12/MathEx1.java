package chap12;
/*
 * 
 */
public class MathEx1 {
	public static void main(String[] args) {
		//���밪
		System.out.println("Math.abs(5)="+Math.abs(5));  //���밪 ����
		System.out.println("Math.abs(-5)="+Math.abs(-5));
		System.out.println("Math.abs(3.14)="+Math.abs(3.14));  //�޼��� �����ε�(�Ű��������� �ٸ�, ���� �޼���)
		System.out.println("Math.abs(-3.14)="+Math.abs(-3.14));
		//�ٻ�����
		System.out.println("Math.ceil(5.4)="+Math.ceil(5.4));  //�ش� �Ǽ����� ū �ٻ�����
		System.out.println("Math.ceil(-5.4)="+Math.ceil(-5.4));
		System.out.println("Math.floor(5.4)="+Math.floor(5.4));  //�ش� �Ǽ����� ���� �ٻ�����
		System.out.println("Math.floor(-5.4)="+Math.floor(-5.4));
		System.out.println("Math.rint(5.4)="+Math.rint(5.4));  //�ش� �Ǽ��� ���� ����� �ٻ�����
		System.out.println("Math.rint(-5.4)="+Math.rint(-5.4));
		//�ּ� �ִ밪
		System.out.println("Math.min(5,4)="+Math.min(5,4));  //�� ���� �� ���� ��
		System.out.println("Math.min(5.4,5.3)="+Math.min(5.4,5.3));
		System.out.println("Math.max(5,4)="+Math.max(5,4));  //�� ���� �� ū ��
		System.out.println("Math.max(5.4,5.3)="+Math.max(5.4,5.3));
		//�ݿø�
		System.out.println("Math.round(5.4)="+Math.round(5.4));
		System.out.println("Math.round(5.5)="+Math.round(5.5));
		//������ ��
		System.out.println("Math.random()="+Math.random());  //0<= x < 1.0  ������ ������ ��
		
		//�ﰢ�Լ� : ������ ���� ������ ó����.
		System.out.println("Math.sin(Math.PI/2)=" + Math.sin(Math.PI/2));  //sin90���� ��
		System.out.println("Math.cos(Math.toRadians(60))=" + Math.cos(Math.toRadians(60)));  //cos60���� �������� ��ȯ
		System.out.println("Math.tan(Math.PI/4)=" + Math.tan(Math.PI/4));  //tan45���� ��
		System.out.println("Math.toDegrees(Math.PI/2)=" + Math.toDegrees(Math.PI/2));  //90���� degrees ������ ��ȯ -> 90.0
		//log
		System.out.println("Math.log(Math.E)=" + Math.log(Math.E));
		//������
		System.out.println("Math.sqrt(25)=" + Math.sqrt(25));  //25�� ��Ʈ�� ���� ��
		//����
		System.out.println("Math.pow(5,4)=" + Math.pow(5,4));  //5�� 4�� �� ����
	}
}
