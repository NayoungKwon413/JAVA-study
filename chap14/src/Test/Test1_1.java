package Test;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 *  화면에서 여러개의 자연수를 입력받아 이들 중 홀수 인 자연수들을 모두 골라
 그 합을 구하고, 홀수중 최대값과 최소값을 찾는 프로그램을 작성하기
 홀수 들로만 이루어진 List 객체를 생성하여 출력하기
 최대값 : Collections.max(list)  
 최소값 : Collections.min(list)
 7개의 자연수 : 12 77 38 41 53 92 85 인 경우
  77 41 53 85 만 홀수 이므로
  77+41+53+85 = 합 
  홀 수의 최대값 : 85
  홀 수의 최소값 : 41
  입력된 홀수 : [77,41,53,85]
 */
public class Test1_1 {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("여러개의 자연수를 입력하세요");
		String str = scan1.nextLine();
		Scanner scan2 = new Scanner(str).useDelimiter(" ");
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		while(scan2.hasNextLine()) {
			int num = scan2.nextInt();
			if(num%2==1) {
				list.add(num);
				sum += num;
			}
		}
		System.out.println("입력된 홀수들의 합:" + sum);
		System.out.println("홀수의 최대값:"+Collections.max(list));
		System.out.println("홀수의 최소값:"+Collections.min(list));
		System.out.println("입력된 홀수:"+list);
	}

}
