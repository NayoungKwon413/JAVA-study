package chap5;

public class homework1_1 {

	public static void main(String[] args) {
		for (int k = 2; k <= 9; k += 4) {
			for (int i = 0; i <4; i++) {
				System.out.print((i + k) + "´Ü\t");
			
			}
		
		System.out.println();
		for (int j = 2; j <= 9; j++) {
			for (int i = k; i < k + 4; i++) {
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		}
	}

	}
