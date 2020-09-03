package chap11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 오버라이딩 된 메서드의 예외처리
 *   부모클래스타입을 더 큰 자료형으로 취급 
 *   부모보다 더 큰 예외를 처리할 수 없음. 같거나, 작은 범위의 처리만 가능함.
 *   부모가 RuntimeException일 경우, 자손클래스에서 예외를 오버라이딩 할 떄 Exception으로 (X)
 *   부모가 Exception일 경우, 자손클래스 RuntimeExcption(o)
 *   
 *   부모에 속하지 않는 예외를 처리하고 싶을 때-> throws 대시 try-catch 구문을 통해 처리할 것
 */
class Parent{
	void method(int i) throws RuntimeException, InterruptedException {
		System.out.println(i);
		Thread.sleep(1000);
	}
}
class Child extends Parent{
//	@Override
	void method(int i) throws RuntimeException{ 
		System.out.println(i/0);
		try {
			new FileInputStream("aaa.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
public class ExceptionEx9 {
	public static void main(String[] args) {

	}
}
