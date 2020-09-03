package chap15;
/*
 * printf 메서드 예제  : 형식지정문자 사용가능
 *                   %d, %s, %c ...
 *                   String.format() 메서드에서도 똑같이 사용 가능.
 */
public class PrintStreamEx2 {
	public static void main(String[] args) {
		//char 형식지정문자 : %c
		System.out.printf("%c%n",'A');  //A 문자 출력 // %n==\n (printf에서만 사용가능)
		System.out.printf("%5c%n",'A'); //5자리 확보하여 A 문자 출력. 우측정렬
		System.out.printf("%-5c%n",'A'); //5자리 확보하여 A 문자 출력. 좌측정렬
		//정수출력 : %d(10진수), %o(8진수), %x(16진수), %X(16진수)
		System.out.printf("%d%n",12345);  //%d:10진수 출력
		System.out.printf("%,d%n",12345); //세자리마다, 10진수 출력
		System.out.printf("%10d%n",12345); //10자리 확보 후 10진수 출력+우측정렬
		System.out.printf("%010d%n",12345); //10자리 확보 후 10진수 출력+빈자리는 0으로 채우기
		System.out.printf("%3d%n",12345);  //최소 3자리확보.
		System.out.printf("%-10d%n",12345); //10자리 확보 후 10진수 출력+좌측정렬
		System.out.printf("%,10d%n",12345); //10자리 확보 후 10진수 출력+우측정렬+3자리마다 ,
		System.out.printf("%-,10d%n",12345); //10자리 확보 후 10진수 출력+좌측정렬+3자리마다 ,
		System.out.printf("%,010d%n",12345); //10자리 확보 후 10진수 출력+빈자리는 0으로 채우기+3자리마다 ,
		
		System.out.printf("%o%n",12345); //8진수 출력
		System.out.printf("%x%n",255); //16진수 출력(영문자를 소문자로 출력)
		System.out.printf("%X%n",255); //16진수 출력(영문자를 대문자로 출력)
		//실수출력 : %f(소수표현), %e(지수표현), %g(근사실수)
		System.out.printf("%f%n",12345.12345);  //실수출력
		System.out.printf("%.2f%n",12345.12345); //소수점 이하 2자리까지만 출력+3자리에서 반올림
		System.out.printf("%10.2f%n",12345.12345); //10자리 확보+소수점 이하 2자리까지만 출력+3자리에서 반올림
		System.out.printf("%,10.2f%n",12345.12345); //10자리 확보+소수점 이하 2자리까지만 출력+3자리에서 반올림+세자리마다 , 출력
		System.out.printf("%-,10.2f%n",12345.12345); //10자리 확보+소수점 이하 2자리까지만 출력+3자리에서 반올림+세자리마다 , 출력+좌측정렬
		System.out.printf("%,010.2f%n",12345.12345); //10자리 확보+소수점 이하 2자리까지만 출력+3자리에서 반올림+세자리마다 , 출력+빈자리는 0 채우기
		System.out.printf("%e%n",12345.12345); //지수출력 -> 1.234512*10의4승
		System.out.printf("%g%n",12345.12345); //근사실수표현출력
		//논리형 : %b
		System.out.printf("%b != %b%n", true, false);
		System.out.printf("(2>3) == %b%n",(2>3));
		//문자열: %s
		System.out.printf("%s는 %s이다.%n", "홍길동", "의적");
		System.out.printf("%10s는 %10s이다.%n", "홍길동", "의적");  //최소 10자리 확보 + 문자열 출력
		//문제1) 10진수 255는 8진수 377이고, 16진수는 FF이다. (printf로 출력하기)
		System.out.printf("10진수 %d는 8진수 %o이고, 16진수는 %X이다.%n",255,255,255);
		String hex = String.format("%X", 255);
		String octal = String.format("%o", 255);
		System.out.println("255의 16진수:"+hex);
		System.out.println("255의 8진수:"+octal);
	}

}
