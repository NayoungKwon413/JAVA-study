package chap12;
/*
 * 
 */
public class MathEx1 {
	public static void main(String[] args) {
		//절대값
		System.out.println("Math.abs(5)="+Math.abs(5));  //절대값 리턴
		System.out.println("Math.abs(-5)="+Math.abs(-5));
		System.out.println("Math.abs(3.14)="+Math.abs(3.14));  //메서드 오버로딩(매개변수형이 다른, 같은 메서드)
		System.out.println("Math.abs(-3.14)="+Math.abs(-3.14));
		//근사정수
		System.out.println("Math.ceil(5.4)="+Math.ceil(5.4));  //해당 실수보다 큰 근사정수
		System.out.println("Math.ceil(-5.4)="+Math.ceil(-5.4));
		System.out.println("Math.floor(5.4)="+Math.floor(5.4));  //해당 실수보다 작은 근사정수
		System.out.println("Math.floor(-5.4)="+Math.floor(-5.4));
		System.out.println("Math.rint(5.4)="+Math.rint(5.4));  //해당 실수에 가장 가까운 근사정수
		System.out.println("Math.rint(-5.4)="+Math.rint(-5.4));
		//최소 최대값
		System.out.println("Math.min(5,4)="+Math.min(5,4));  //두 수중 더 작은 값
		System.out.println("Math.min(5.4,5.3)="+Math.min(5.4,5.3));
		System.out.println("Math.max(5,4)="+Math.max(5,4));  //두 수중 더 큰 값
		System.out.println("Math.max(5.4,5.3)="+Math.max(5.4,5.3));
		//반올림
		System.out.println("Math.round(5.4)="+Math.round(5.4));
		System.out.println("Math.round(5.5)="+Math.round(5.5));
		//임의의 수
		System.out.println("Math.random()="+Math.random());  //0<= x < 1.0  범위의 임의의 수
		
		//삼각함수 : 각도는 라디안 단위로 처리됨.
		System.out.println("Math.sin(Math.PI/2)=" + Math.sin(Math.PI/2));  //sin90도의 값
		System.out.println("Math.cos(Math.toRadians(60))=" + Math.cos(Math.toRadians(60)));  //cos60도를 라디안으로 변환
		System.out.println("Math.tan(Math.PI/4)=" + Math.tan(Math.PI/4));  //tan45도의 값
		System.out.println("Math.toDegrees(Math.PI/2)=" + Math.toDegrees(Math.PI/2));  //90도를 degrees 값으로 변환 -> 90.0
		//log
		System.out.println("Math.log(Math.E)=" + Math.log(Math.E));
		//제곱근
		System.out.println("Math.sqrt(25)=" + Math.sqrt(25));  //25에 루트를 씌운 값
		//제곱
		System.out.println("Math.pow(5,4)=" + Math.pow(5,4));  //5의 4승 값 리턴
	}
}
