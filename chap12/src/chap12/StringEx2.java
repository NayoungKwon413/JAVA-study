package chap12;
/*
 * String 클래스의 주요 메서드
 */
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println(s.charAt(4));  //s.charAt(4) : 4번 인덱스(0부터 시작해서 5번째) 문자 리턴 -> E
		System.out.println(s.compareTo("abc"));  //s.compareTo("abc") : 'A'-'a' :-32 => 정렬시 사용되는 메서드
		System.out.println(s.compareToIgnoreCase("abcdefgh"));  //IgnoreCase : 대소문자 상관없이 =>0
		System.out.println(s.concat("abc"));  //s.concat("abc") : s+"abc"
		System.out.println(s.endsWith("GH")); //s.endsWith("GH") : s문자열이 "GH" 문자열로 종료하나? => true
		System.out.println(s.startsWith("AB"));  //s.startsWith("AB") : s문자열이 "AB" 문자열로 시작하니? => true
		System.out.println(s.equalsIgnoreCase("abcdefgh")); //s.equalsIgnoreCase("abcdefgh") : 대소문자 상관없이 같나? => true
		s = new String("This is a String"); 
		System.out.println(s.indexOf('i'));  //s.indexOf('i') : s문자열에서 'i' 문자의 인덱스 리턴
		System.out.println(s.indexOf('i',5));  //s.indexOf('i',5) : s문자열에서 5번 인덱스부터 존재하는 'i' 문자의 인덱스 리턴=>5
		System.out.println(s.indexOf('i',15)); //s.indexOf('i',15) : s문자열에서 15번 인덱스부터 존재하는 'i' 문자의 인덱스 리턴=>-1(:해당 문자 찾을 수 없음)
		System.out.println(s.indexOf("is"));  //s.indexOf("is") : s문자열에서 "is" 문자열의 인덱스 리턴
		System.out.println(s.indexOf("is",5));
		System.out.println(s.lastIndexOf("is"));  //s.lastIndexOf("is") : 뒤에서부터 "is" 문자열의 인덱스 리턴. 단, 인덱스 처음 0부터 카운트
		System.out.println(s.length()); //s.length() : s문자열의 길이 => 16
		System.out.println(s.replace("is", "QR")); //s.replace("is", "QR"):"is"를 모두 "QR" 로 치환
		System.out.println(s.substring(5));  //substring: 부분 문자열 -> 5번 인덱스 이후를 부분 문자열로 리턴 => is a String
		System.out.println(s.substring(5,13));  //s.substring(5,13) : 5번 인덱스 부터 13번 인덱스 앞까지 즉, 12번 인덱스까지 => is a Str
		System.out.println(s.toLowerCase());  //s.toLowerCase(): 문자열을 소문자로 변경 후 리턴
		System.out.println(s.toUpperCase());  //s.toUpperCase() : 문자열을 대문자로 변경 후 리턴 
		System.out.println("       문자열 trim 메서드            ".trim());  //"문자열".trim() : 양쪽의 공백을 제거 단, 중간 공백은 제거 불가
	}

}
