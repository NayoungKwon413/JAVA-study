package chap18;

import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

/*
 * Consumer �������̽�
 *   - Java Api �� �Լ��� �������̽�
 *   - �Ű������� �ְ� ���ϰ��� ���� �޼���(accept)�� ����
 */
public class LambdaEx6 {
	public static void main(String[] args) {
		// accept(String s);
		// t : String Ÿ��
		Consumer<String> c1 = t-> System.out.println(t+8);
		c1.accept("Java");
		Consumer<Integer> c11 = t-> System.out.println(t+8);
		c11.accept(100);  //108
		
		//�Ű����� 2��
		//accept(T t, U u)
		BiConsumer<String,String> c2 = (t,u)->System.out.println(t+u);
		c2.accept("Java", "8.0 ����");
		
		//�Ű����� Ÿ���� double -> ���׸� �ʿ����
		//accept(double d)
		DoubleConsumer c3 = d->System.out.println("java"+d);
		c3.accept(8);  //java8.0
		
		// ObjIntConsumer : �Ű����� 2�� accept(��ü, int)
		// accept(T t, int i)
		ObjIntConsumer<String> c4 = (t,i)->System.out.println(t+i);
		c4.accept("Java", 8);
		
		//�Ű����� 1��(int)
		//accept(int i)
		IntConsumer c5 = x->{
			int sum=0;
			for(int i=1; i<=x; i++) sum +=i;
			System.out.println("1����"+ x + "������ ��:"+ sum);
		};
		c5.accept(10);
		c5.accept(100);
	}
}
