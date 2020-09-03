package chap18;

import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

/*
 * Consumer 인터페이스
 *   - Java Api 의 함수적 인터페이스
 *   - 매개변수가 있고 리턴값은 없는 메서드(accept)를 가짐
 */
public class LambdaEx6 {
	public static void main(String[] args) {
		// accept(String s);
		// t : String 타입
		Consumer<String> c1 = t-> System.out.println(t+8);
		c1.accept("Java");
		Consumer<Integer> c11 = t-> System.out.println(t+8);
		c11.accept(100);  //108
		
		//매개변수 2개
		//accept(T t, U u)
		BiConsumer<String,String> c2 = (t,u)->System.out.println(t+u);
		c2.accept("Java", "8.0 이후");
		
		//매개변수 타입이 double -> 제네릭 필요없음
		//accept(double d)
		DoubleConsumer c3 = d->System.out.println("java"+d);
		c3.accept(8);  //java8.0
		
		// ObjIntConsumer : 매개변수 2개 accept(객체, int)
		// accept(T t, int i)
		ObjIntConsumer<String> c4 = (t,i)->System.out.println(t+i);
		c4.accept("Java", 8);
		
		//매개변수 1개(int)
		//accept(int i)
		IntConsumer c5 = x->{
			int sum=0;
			for(int i=1; i<=x; i++) sum +=i;
			System.out.println("1부터"+ x + "까지의 합:"+ sum);
		};
		c5.accept(10);
		c5.accept(100);
	}
}
