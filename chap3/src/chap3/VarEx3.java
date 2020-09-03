package chap3;
/*
 * 다른 자료형간의 연산 -> 결과는 큰 자료형으로 귀결.
 * int 형보다 작은 자료형의 경우, 결과는 int
 */
public class VarEx3 {

	public static void main(String[] args) {
		byte b1 = 10;
		int i1 = 20;
		float f1 = 10.5f;
		double d1 = 1.0;
		
		int i2 = b1 + i1;
		float f2 = i1 + f1;
		double d2 = f2 + d1;
		
		byte b2 = (byte)(b1 + b1);
		
		char c1 = 'A';
		char c2 = (char)(c1 + 1);
		System.out.println(c2);  //B

	}

}
