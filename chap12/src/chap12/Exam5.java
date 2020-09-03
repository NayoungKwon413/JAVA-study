package chap12;
/*
 * delChar 메서드구현하기
 * delChar(원본문자열, 삭제문자열)
 */
public class Exam5 {
	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5)", "~!@#$%^&*()")); //12345
		System.out.println(delChar("(1!2@3^4~5)", "12345")); //(!@^~)

	}
	static StringBuffer delChar(String str, String del) {
		StringBuffer sb1 = new StringBuffer(str);
		StringBuffer sb2 = new StringBuffer(del);
		for(int i=0; i<sb1.length();i++) {
			for(int j=0; j<sb2.length(); j++) {
				if(sb1.charAt(i) == sb2.charAt(j)) {
					sb1.deleteCharAt(i);
				}
			}
			
		}return sb1;
		
	}
	/*
	 * 	static int count(String str, String find) {
	 *    StringBuffer sb = new StringBuffer();
	 *    for(int i =0; i<str.length(); i++) {
	 *       char c = str.charAt(i);
	 *       if(del.indexOf(c) <0) sb.append(c);
	 *    }
	 *    return sb;
	 * }
	 */

}
