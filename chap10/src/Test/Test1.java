package Test;
/*
 * 1. ���� �ҽ��� ������ ������ �߻��Ѵ�. ����� "Tested" �� ��µǵ��� ���α׷��� �����ϱ�.
 */
interface Beta {}

class Alpha implements Beta {  //Alpha �� Beta�� �����ϰ� �����Ƿ� Alpha�� Beta�� ����ȯ�� ������.

 String testIt() {

  return "Tested";

 }

}
class Gamma implements Beta {  //Gamma ���� Beta�� ����ȯ ���� -> �������̽��� Ŭ�������� �� ū �ڷ���
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

  System.out.println(((Alpha) b).testIt());  //Beta�� ����� ���� �������̽��̹Ƿ� �̸� ������ Ŭ�������� ����ȯ�� �ʿ��ϴ�.
  
/*  if(b instanceof Alpha) {  //b ��ü�� Alpha ��ü�ΰ�?
	 Alpha a=(Alpha)b;
	 System.out.println(a.testIt());
 }  testIt()�޼���� Beta �� ����� �ƴ�. */
  
 }

}