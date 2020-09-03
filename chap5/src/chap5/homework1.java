package chap5;

public class homework1 {

	public static void main(String[] args) {
			for(int i=2; i<=5; i++)
			System.out.print(i + "´Ü" + "\t");
			for(int i=2; i<=9; i++) {
				System.out.println();
				for(int j=2; j<=5; j++) {
					System.out.print(j + "*" + i + "=" + (i*j) + "\t");
				}
			}
			System.out.println();
			System.out.println();
			for(int i=6; i<=9; i++) {
			    System.out.print(i + "´Ü" + "\t");
			}
			for(int i=2; i<=9; i++) {
				System.out.println();
				for(int j=6; j<=9; j++) {
					System.out.print(j + "*" + i + "=" + (i*j) + "\t");
				}

		}
		
	}
	
}