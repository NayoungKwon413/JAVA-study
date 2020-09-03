package Test;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * 1. IntStream.rangeClosed 메서드를 이용하여 입력된 숫자까지의 합, 짝수의 합, 홀수의 합을 구하는 프로그램 작성하기
 */
public class Test1 {
	static int sum=0;
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("숫자를 입력하세요");
	int num =scan.nextInt();
	System.out.println("입력된 숫자까지의 합:"+IntStream.rangeClosed(1,num).sum());
	System.out.println("짝수의 합:"+IntStream.rangeClosed(1,num).filter(s->s%2==0).sum());
	System.out.println("홀수의 합:"+IntStream.rangeClosed(1,num).filter(s->s%2==1).sum());
	}
}
