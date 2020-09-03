package chap18;

interface LambdaInterface5{
	void method();
}
class Outer{
	public int iv=10;
	void method() {
		int iv=20;  //지역변수의 상수화 꼭 필요
		LambdaInterface5 f5 =()->{
			System.out.println("Outer.this.iv:"+Outer.this.iv);  //Outer 객체 접근가능
			System.out.println("this.iv:"+this.iv); //Outer 객체 접근가능
			System.out.println("iv:"+iv);  //메서드 안에 있는 지역변수 iv를 뜻함
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
