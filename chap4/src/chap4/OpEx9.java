package chap4;
/*
 * 대입 연산자 : =, +=, -=, ...
 */
public class OpEx9 {

	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);  //100
		num += 10;  //-> num = num + 10;
		System.out.println(num);  //110
		num /= 10;  //-> num = num / 10;
		System.out.println(num);  //11
		num *= 2+3;  //-> num = num * (2+3); 
		System.out.println(num);  //55
		
		
		byte b = 1;
		b *= 2;
		//b = b * 2; 일반연산일 경우 int로 형변환이 필요하나, 대입연산에서는 해당되지 않음
		System.out.println(b);
		b *= 200;
		System.out.println(b);

	}

}
