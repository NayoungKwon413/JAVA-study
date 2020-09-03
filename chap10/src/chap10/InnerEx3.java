package chap10;
/*
 * ���� Ŭ���� ��ü���� ���Ǵ� this
 */
class Outer3 {
	int iv = 10;
	int iv2 = 20;
	class InstanceInner{
		int iv = 100;
		void method1() {
			int iv = 300;
			System.out.println("iv=" + iv);  //���� ����� �������� iv =300
			System.out.println("iv2=" + iv2); //�ܺ� Ŭ���� ��� iv2 = 20 -> �ܺ� Ŭ���� ����� ���� ����
			System.out.println("this.iv = " + this.iv); //this.iv = 100 -> �ڱ��������� this : ����Ŭ������ ��ü�� �ǹ�
			//�ܺ�Ŭ���� iv �� ���
			System.out.println("Outer3.this.iv = " + Outer3.this.iv); //Outer3.this.iv = 10
			System.out.println("Outer3.this.iv2 = " + Outer3.this.iv2);
		}
	}
	 static class StaticInner{
		int iv=100;
		static int cv = 200;
		void method1() {
			int iv = 300;
			System.out.println("iv=" + iv);  
			System.out.println("cv=" + cv);
//			System.out.println("iv2=" + iv2);  //iv2 �ν��Ͻ� ����̱� ������ ��üȭ �ʿ�
			System.out.println("this.iv = " + this.iv); 
			//�ܺ�Ŭ���� iv �� ���
//			System.out.println("Outer3.this.iv = " + Outer3.this.iv); //static�� Ŭ��������̱� ������ Outer3.this ���� ����
			System.out.println("Outer3.iv=" + new Outer3().iv);
			System.out.println("Outer3.iv2=" + new Outer3().iv2);
	}
}
}
public class InnerEx3 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner oi = out.new InstanceInner();
		oi.method1();
		Outer3.StaticInner os = new Outer3.StaticInner();
		os.method1();
	}

}
