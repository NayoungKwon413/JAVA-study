package chap5;
/*
 * switch 구문의 조건값으로 사용가능한 자료형
 *   byte, short, int, char, String
 *   
 * 조건문 : if, switch
 *   모든 switch 구문은 if 구문으로 변경 가능함.
 *   모든 if 구문은 switch 구문으로 변경할 수 없다. (가능한 것도 있지만 불가능한 부분도 있음)
 *   
 */
public class switchEx2 {

	public static void main(String[] args) {
		int value =1;   //switch 구문에 쓸 수 있는 자료형만 가능.
		switch(value) {
		case 1 : System.out.println(value); break;
		case 2 : System.out.println(value); break;
	
		}

	}

}
