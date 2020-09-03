package chap6;

public class hw2 {

	public static void main(String[] args) {
		 int a = Integer.parseInt(args[0]);
		 System.out.print(a + "ÀÇ ¾à¼ö : ");
		 for(int i=1; i<=a; i++) {
			 if(a%i == 0) {
				 System.out.print(i + ", ");
			 }
		 }

	}

}
