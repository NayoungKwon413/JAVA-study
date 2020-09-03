package chap11;

import java.util.Scanner;

/*
 * 화면에서 1부터 10까지의 숫자를 입력받아서 숫자만큼 *을 가로로 출력하기
 * 단 99 숫자가 입력되면 입력 종료
 * 입력값이 숫자가 아닌 경우, "숫자만 입력하세요" 메세지 출력 후 다시 입력받도록 수정
 * 입력된 숫자가 1~10사이가 아닌 경우 NumberMismatchException 을 생성 -> get.message "1부터 10까지의 숫자만 입력하세요"
 */
class NumberMismatchException extends Exception {
	NumberMismatchException(String i){
		super(i);
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 10까지의 숫자를 입력하세요(종료:99)");
		//int num=0;
		while(true) {
			try {
		      int num = scan.nextInt();	
		    if(num==99) {
			break;
	   } else if (num<1 || num > 10) {
			throw new NumberMismatchException("1부터 10까지의 숫자만 입력하세요");
		    }
		   System.out.print(num + ":");
		   for(int i=1; i<=num; i++) {
			   System.out.print("*");
		    }
		System.out.println();
			} catch(NumberMismatchException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println(scan.next() + "은(는) 숫자가 아닙니다. 숫자만 입력하세요");
				continue;
			}
		}
		System.out.println("프로그램 종료");
	}

}
