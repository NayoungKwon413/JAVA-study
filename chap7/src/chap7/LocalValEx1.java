package chap7;
/*
 * 지역변수 예제
 *   지역변수 :
 *     1. 메서드 내부에 선언된 변수
 *     2. 매개변수도 지역변수임.
 *     3. 반드시 초기화 필요
 *     
 *     LocalValEx1 의 지역변수 : args, num, b, grade, score
 *     매개변수는 호출시 이미 초기화됨.
 */
public class LocalValEx1 {

	public static void main(String[] args) {
		int num;
		boolean b= true;
		if(b) {
			num = 100;
		} else {
			num = 200;
		}
		System.out.println(num);
		String grade;
		int score = 80;
		switch(score/10) {
		case 9 : grade="A";break;
		case 8 : grade="B";break;
		case 7 : grade="C";break;
		case 6 : grade="D";break;
		default : grade = "F";
		}
		System.out.println("학점 :" + grade);

	}

}
