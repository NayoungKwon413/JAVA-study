package chap3;

public class test2 {

	public static void main(String[] args) {
		byte var1 = 128; //A. byte의 값의 범위는 -128~127까지임.
		short var2 = 128; //B. 정상
		int var3 = 28L; //C. 자동 형변환이므로 L필요없음. 혹은 형변환 연산자 사용. int(28L)
		long var4 = 128L; //D. 정상
		float var5 = 1.2; //E. 1.2 리터널은 double. 접미사 f 필요.
		double var6 = 1.2; //F 정상
		float var7 = 42e1f; //G 정상 -> 42*10에 접미사 f가 붙은 형태(: 실수형)
		float var8 = 0x0123; //H 정상 -> 16진수 0123을 나타냄
		float var9 = '1'; //I 정상 -> char 형이 float 형으로 자동 형변환됨. 49.0 즉, '1'의 아스키 값을 뜻함

	}

}

/* 
3. 변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야 합니다. 변수 이름으로 사용할 수 있는 것은?
A. false  B. default  C. _var  D. a-class
C만 가능. A와 B는 예약자이며 D에는 하이픈이 포함됨.
*/