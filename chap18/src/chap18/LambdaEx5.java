package chap18;

interface LambdaInterface5{
	void method();
}
class Outer{
	public int iv=10;
	void method() {
		int iv=20;  //���������� ���ȭ �� �ʿ�
		LambdaInterface5 f5 =()->{
			System.out.println("Outer.this.iv:"+Outer.this.iv);  //Outer ��ü ���ٰ���
			System.out.println("this.iv:"+this.iv); //Outer ��ü ���ٰ���
			System.out.println("iv:"+iv);  //�޼��� �ȿ� �ִ� �������� iv�� ����
		};
		f5.method();
	}
}
public class LambdaEx5 {
	public static void main(String[] args) {
		Outer o= new Outer();
		o.method();
	}

}
