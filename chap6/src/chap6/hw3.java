package chap6;

public class hw3 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		 System.out.print(a + "과 " + b + "의 공약수 : ");
		 for(int i=1; i<=b; i++) {
			 if(a%i == 0 && b%i ==0) {
				 System.out.print(i + ", ");
			 }
		 }

	}

}
