package chap3;
/*
 * 특수문자 : \
 */
public class VarEx4 {

	public static void main(String[] args) {
	     char single = '\'';
	     System.out.println(single);
	     String str = "Hello \"홍길동\"";
	     System.out.println(str);  //Hello "홍길동"
	     String root = "c:\\";
	     System.out.println(root);  //c:\
	     
	     System.out.println("서울\t대구\t부산");  // \t : tab
	     System.out.println("안녕하세요\n이부분은 다음줄에 출력됩니다.");  // \n : new line
	     System.out.println("\uD64D\uAE38\uB3D9");  // \u : unicode. 직접 코드 입력. 

	}

}
