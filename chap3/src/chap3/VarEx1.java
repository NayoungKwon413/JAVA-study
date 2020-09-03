package chap3;
/* 여러줄 주석 
 * 주석이란 : 컴파일 문자에서 제외되는 영역. -> 문법이 틀려도 됨.
 *         자바 문법과 관련이 없는 부분. 
 *         
 * 자바의 특징 1: 자바 소스는 대소문자를 구분함.
 *         2: public class VarEx1 -> 파일의 이름은 반드시 VarEx1.java 여야 함.
 *           파일의 이름과 public class의 이름이 꼭 같아야 함.
 *           = 하나의 파일에는 하나의 public class만 존재해야함. 
 *         3. 자바컴파일러 : javac.exe -> 자바 소스를 .class 파일(바이트코드)로 변환하여 저장함.
 *         4. 자바인터프리터 : java.exe -> 바이트코드를 실행.
 */

public class VarEx1 {

	public static void main(String[] args) {
		//한줄주석 - 변수의 선언 : 변수 사용전에 반드시 선언이 필요함(자바의 특징). 메모리 할당. 할당의 크기는 자료형으로 결정.
		int num;
		//변수의 초기화
		num = 100;
		System.out.println(num);
		//변수의 선언과 초기화
		byte b1 = -22;  //-128~127까지 가능함. 1byte에 저장할 수 있는 크기
		short s1 = -220;
		int i1 = 100;
		long l1 = 1000;
		b1 = (byte)300;
		System.out.println(b1); //44
		float f1 = 1.0f; //실수형 리터널을 double 임. f를 명시하는 이유는 double을 float로 변환한 것이기 때문. -> 명시적 형변환
		double d1 = 1.0;
	 

	}

}

/*
 * 자료형
 *     기본형 : 논리형 boolean(1)
 *            문자형 char(2)
 *            정수형 byte(1) short(2) int(4) long(8)
 *            실수형 float(4) double(8)
 *     참조형 : 배열
 *            클래스
 *            인터페이스
 *            
 * 형변환 1.기본형과 참조형은 형변환이 안됨.(단 Wrapper class 는 예외)
 *      2. boolean 을 제외한 7가지는 서로 형변환이 가능함.
 *      3. 작은 자료형에서 큰 자료형으로 형변환 시, 형변환 연산자 생략 가능 -> 자동 형변환
 *      4. 반면 큰 자료형에서 작은 자료형으로 형변환 시, 형변환 연산자 생략 불가능 -> 명시적 형변환
 *      
 * 실수형 리터널의 기본형은 double임. float형 리터널로 표시하기 위해서는 f 접미사가 필요.
 *    F, f : float 형 리터널 표시
 *    D, d : double 형 리터널
 *    L, l : long 형 리터널
 */