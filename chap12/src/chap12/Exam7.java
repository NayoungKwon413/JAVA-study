package chap12;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아 달력을 완성하세요
 * 년도를 입력하세요
 * 
 * 월을 입력하세요
 * 
 * 1. 달의 1일의 요일을 구하고 마지막날짜를 구함
 * 2. for(i=1; i<=6; i++){
 *      for(j=1; j<=7; j++){
 *          if(날짜> 달의 마지막 날짜) break;
 *          if(i==1 && j<1일의 요일) 공백출력
 *          else 날짜 출력 + 날짜 1씩 증가
 *    }
 *    system.out.println();
 * }
 */
public class Exam7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = scan.nextInt();
		System.out.println("월을 입력하세요");
		int month = scan.nextInt();
		Calendar cal = Calendar.getInstance();
		System.out.println("\t" + year + "년" + month + "월");
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n","일,월,화,수,목,금,토".split(","));
		int date=1;
		cal.set(year, month-1, date);
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=7; j++) {
				if(date>cal.getActualMaximum(Calendar.DATE)) break;
				if(i==1 && j<cal.get(Calendar.DAY_OF_WEEK)) {
					System.out.printf("%3s"," ");
				
				}else {
					System.out.printf("%3d",date++);
				    }

			}
			if(date>cal.getActualMaximum(Calendar.DATE)) break;
			System.out.println();
		}
		/*
		 * int firstw
		 * int lastday
		 * for(int i=1, day=1; day<=lastday; i++){
		 *    if(i<firstw) System.out.printf("%3d"," ");
		 *    else System.out.printf("%3d",day++);
		 *    if(i%7==0) System.out.println();
		 * }
		 */
	}
}
