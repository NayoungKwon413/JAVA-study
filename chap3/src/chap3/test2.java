package chap3;

public class test2 {

	public static void main(String[] args) {
		byte var1 = 128; //A. byte�� ���� ������ -128~127������.
		short var2 = 128; //B. ����
		int var3 = 28L; //C. �ڵ� ����ȯ�̹Ƿ� L�ʿ����. Ȥ�� ����ȯ ������ ���. int(28L)
		long var4 = 128L; //D. ����
		float var5 = 1.2; //E. 1.2 ���ͳ��� double. ���̻� f �ʿ�.
		double var6 = 1.2; //F ����
		float var7 = 42e1f; //G ���� -> 42*10�� ���̻� f�� ���� ����(: �Ǽ���)
		float var8 = 0x0123; //H ���� -> 16���� 0123�� ��Ÿ��
		float var9 = '1'; //I ���� -> char ���� float ������ �ڵ� ����ȯ��. 49.0 ��, '1'�� �ƽ�Ű ���� ����

	}

}

/* 
3. ������ �����ϱ� ���ؼ��� �ڷ����� ������ �̸��� �����ؾ� �մϴ�. ���� �̸����� ����� �� �ִ� ����?
A. false  B. default  C. _var  D. a-class
C�� ����. A�� B�� �������̸� D���� �������� ���Ե�.
*/