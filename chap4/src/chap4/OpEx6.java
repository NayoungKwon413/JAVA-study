package chap4;
/*
 * 산술 연산자(이항 연산) : +, -, *, /(나누어진 몫), %(나머지)
 *  / : 나누어진 몫. 정수/정수=정수(소수점 이하 없음) 
 *  % : 결과 부호는 피젯수의 부호를 따른다.
 */
public class OpEx6 {

	public static void main(String[] args) {
		System.out.println(10/8);  //1 각 항의 연산이 int 이기 때문에 결과값 역시 int 여야 함. 따라서 실수가 아닌 정수로 나타나야 함.(소수점 이하를 가질 수 없음)
		System.out.println(10/-8);
		System.out.println(-10/8);
		System.out.println(-10/-8);
		
		System.out.println(10%8);  //2 : 나머지의 경우 나누어지는 수의 부호를 따라감.
		System.out.println(10%-8);  //2
		System.out.println(-10%8);  //-2
		System.out.println(-10%-8);  //-2

	}

}
