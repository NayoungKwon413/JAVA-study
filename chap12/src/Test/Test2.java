package Test;
/*
������ ����� �������� ���α׷��� �����ϱ�
[���]
fullPath:c:/jdk12/work/Test.java
path:c:/jdk12/work
fileName:Test.java
*/
public class Test2 {

	public static void main(String[] args) {
		String fullPath = "c:/jdk12/work/Test.java";
		String path=fullPath.substring(0,13);
		String fileName = fullPath.substring(14);
		System.out.println("fullPath:" + fullPath);
	    System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
/*
 * String fullPath = "c:/jdk12/work/Test.java";
		String path="";
		String fileName = "";
		
		int idx = fullPath.lastIndexOf("/");
		
		
		System.out.println("fullPath:" + fullPath);
	    System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);		
 */
		
	}

}
