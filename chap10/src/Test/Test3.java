package Test;

/*
 * 3. Outer2Ŭ������ ����Ŭ���� Inner�� ������� iv�� ����ϴ� ���� Ŭ���� �ϼ��ϱ�
 */

class Outer2 {
	
 static class Inner {
  int iv = 200;

 }
}

public class Test3 {
 public static void main(String[] args) {
	
	 System.out.println(new Outer2.Inner().iv); //Ȥ�� 
	 
	 Outer2 out2 = new Outer2();
	 Outer2.Inner oi2 = new Outer2.Inner();
	 System.out.println(oi2.iv);
 }

}
