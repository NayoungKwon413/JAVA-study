package Test;
/*
 * 2. OuterŬ������ ���� Ŭ���� Inner�� ������� iv�� �� ����ϴ� ���� Ŭ���� �ϼ��ϱ�
 */
class Outer {

	 class Inner {
	  int iv = 100;

	 }
	}

public class Test2 {
	 public static void main(String[] args) {
		
		 
		 Outer out = new Outer();
		 Outer.Inner oi = out.new Inner();
		 System.out.println(oi.iv);

	 }

	}