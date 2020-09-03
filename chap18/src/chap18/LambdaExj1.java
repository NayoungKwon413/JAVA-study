package chap18;
/*
 * 람다식 예제 : jdk8.0 이후부터 사용가능
 *    람다식에서 사용할 수 있는 인터페이스는 반드시 FunctionalInterface 이어야 함.
 *    
 *    FunctionalInterface  : 추상메서드가 한개만 존재하는 인터페이스
 *    
 *    추상메서드의 매개변수가 없고, 리턴타입도 없는 경우
 *    ()->{...}
 *    람다식 내부에 실행되는 구문이 한 개인 경우 {} 생략가능
 */
@FunctionalInterface  //어노테이션 : 알고리즘에 영향은 미치지 않으나, 부가적 기능을 수행하는 심볼-> 컴파일러가 검증해주는 기능 
interface LambdaInterface1{
	void method();
}
public class LambdaExj1 {
	public static void main(String[] args) {
		//기존 코딩방식
		LambdaInterface1 fi = new LambdaInterface1() {  //이름없는 내부클래스
			@Override
			public void method() {
				System.out.println("기존방식으로 코딩");
			}
		};
		fi.method();
		fi = ()->{
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		fi = ()->{
			System.out.println("method call2");
		};
		fi.method();
		fi=()->System.out.println("method call3");
		fi.method();
		execute(()->System.out.println("method call4"));
		execute(()->System.out.println("method call5"));
	}
	static void execute(LambdaInterface1 f) {
		f.method();  
	}
}
