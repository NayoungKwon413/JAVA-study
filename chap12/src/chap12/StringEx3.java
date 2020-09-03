package chap12;
/*
 * String 클래스의 메서드2
 */
public class StringEx3 {
	public static void main(String[] args) {
		String s = "HTML-CSS-JavaScript-JAVA-JSP-스프링";
		String[] subject = s.split("-");  //split : 문자열을 분류하여 토큰화
		for(int i=0; i<subject.length; i++) {
			System.out.println((i+1)+":"+subject[i]);
		}
		s="홍길동,김삿갓,이몽룡,성춘향,임꺽정";
		String[] subject2 = s.split(",");
/*		for(String n :subject2) {
			System.out.println(n);
		}
*/
		for(int i=0; i<subject2.length; i++) {
			System.out.println(subject2[i]);	
		}
		System.out.println("총 " + subject2.length + "명") ;

		//숫자 <= 문자열
		int i = Integer.parseInt("255");
		System.out.println(i+1); //101
		double d = Double.parseDouble("10.5");
		System.out.println(d+1.1); //11.6
		float f = Float.parseFloat("10.5");
		System.out.println(f+1.1); //11.6
		
		//문자열을 Format 형태로 출력하기
		//%.2f : 실수를 소숫점이하 두자리까지 출력 => 소수점 이하 세번째 자리에서 반올림
		String sf = String.format("%.2f", d+0.125);  //10.625->10.63
		System.out.println(sf);
		sf=String.format("%10d", i);  //10자리 확보하여 100을 10진수로 출력
		System.out.println(sf);
		sf=String.format("%x", i);  //100을 16진수로 출력 (%X -> 대문자, %x -> 소문자)
		System.out.println(sf);
		sf=String.format("%o", i);  //100을 8진수로 출력
		System.out.println(sf);
	}

}
