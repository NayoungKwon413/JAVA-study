package chap18;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 * Supplier �������̽�
 *   �Ű������� ���� ���ϰ��� ������
 *   T getXXX() �޼��带 �߻� �޼���� ����.
 */
public class LambdaEx7 {
	public static void main(String[] args) {
//		Supplier<String> s1 = ()->{
//			return "java";
//		};
		Supplier<String> s1 = ()->"java";
		System.out.println(s1.get());
		//�ֻ����� ������ ��ȣ�� ����
//		IntSupplier s2 = ()->{
//			int num = (int)(Math.random()*6)+1;
//			return num;
//		};
		IntSupplier s2=()->(int)(Math.random()*6)+1;
		System.out.println(s2.getAsInt());
	}
}
