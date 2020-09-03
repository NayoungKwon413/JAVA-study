package chap14;

import java.util.TreeSet;

/*
 * TreeSet 예제
 *  Lotto 번호를 TreeSet을 이용해 출력하기
 *  1~45 사이의 임의의 숫자를 중복없이 6개 찾아서 정렬하여 출력하기
 */
public class Exam3 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		while(true) {
			set.add((int)(Math.random()*45+1));
			if(set.size()==6)break;
		}
		System.out.println(set);

	}

}
