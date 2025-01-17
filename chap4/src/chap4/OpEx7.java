package chap4;
/*
 * 비트 연산자 : &(and), |(or), ^(xor), ~(not)
 */
public class OpEx7 {

	public static void main(String[] args) {
		System.out.println("6 & 3 =" + (6 & 3));  //2
		/*
		 * 6 : 0000110
		 * 3 : 0000011
		 *--------------
		 * & : 0000010
		 */
		System.out.println("6 | 3 =" + (6 | 3));  //7
		/*
		 * 6 : 0000110
		 * 3 : 0000011
		 *--------------
		 * | : 0000111
		 */
		System.out.println("6 ^ 3 =" + (6 ^ 3));  //5
		/*
		 * 6 : 0000110
		 * 3 : 0000011
		 *--------------
		 * ^ : 0000101
		 */
		System.out.println("7 ^ 2 =" + (7 ^ 2));  //5
		/*
		 * 7 : 0000111
		 * 3 : 0000010
		 *--------------
		 * ^ : 0000101
		 */
		System.out.println("~10 =" + ~10);  //-11
		/*
		 * 10 : 00001010
		 * --------------
		 *  ~ : 11110101
		 *  
		 *  가장 왼쪽 비트 : 부호비트(0: 양수, 1: 음수)
		 *  음수는 2의 보수로 표현
		 *  2의 보수는 1의 보수 + 1;
		 *  
		 *  1110101(부호비트 제외) : 어떤 수의 2의 보수임. 다시 보수를 산출하면 어떤 수를 알 수 있다.
		 *  -> 1의 보수화: 0001010
		 *    -> +1 : 0001011
		 *  -------------------
		 *  어떤 수 = 0001011 =11
		 */
		

	}

}
