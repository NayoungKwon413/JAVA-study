package Test;
/*
 * 1. 다음 소스는 컴파일 오류가 발생한다. 결과가 "Tested" 가 출력되도록 프로그램을 수정하기.
 */
interface Beta {}

class Alpha implements Beta {  //Alpha 는 Beta를 구현하고 있으므로 Alpha는 Beta로 형변환이 가능함.

 String testIt() {

  return "Tested";

 }

}
class Gamma implements Beta {  //Gamma 역시 Beta로 형변환 가능 -> 인터페이스가 클래스보다 더 큰 자료형
	String testIt2() {
		return "Gamma";
	}
}
public class Test1 {

 static Beta getIt() {

  return new Alpha();

 }

 public static void main(String[] args) {
  
  Beta b = getIt();

  System.out.println(((Alpha) b).testIt());  //Beta는 멤버가 없는 인터페이스이므로 이를 구현한 클래스로의 형변환이 필요하다.
  
/*  if(b instanceof Alpha) {  //b 객체가 Alpha 객체인가?
	 Alpha a=(Alpha)b;
	 System.out.println(a.testIt());
 }  testIt()메서드는 Beta 의 멤버가 아님. */
  
 }

}