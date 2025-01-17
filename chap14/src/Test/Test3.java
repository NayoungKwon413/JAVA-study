package Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
 * 다음 결과가 나오도록 프로그램을 작성하시오
 1 ~ 1000번까지의 번호를 가지는 복권이 있다.
 1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기
  단 추첨은 3등부터 추첨하고, 당첨번호는 중복되면 안된다.
  추첨된 번호는 임의의 수이므로 숫자 값은 실행 할때 마다 다르다.
  
  LinkedHashSet : 순서유지, 중복불가
  Random
  new ArrayList(Set) : Set 객체를 List객체로 생성
  
 [결과]
3등 복권 추첨합니다.
945
123
6
2등 복권 추첨합니다.
611
404
1등 복권 추첨합니다.
797

*** 복권 추첨 결과 ***
1등:797,
2등:404,611,
3등:6,123,945,  
 */
public class Test3 {
	public static void main(String[] args) {
		Set<Integer> lotto = new LinkedHashSet<>();
		Random balls = new Random();
		balls.setSeed(System.currentTimeMillis());
		while(lotto.size()<6) {
			lotto.add(balls.nextInt(1000)+1);
		}
		System.out.println(lotto);
		List<Integer> list = new ArrayList<>(lotto);
		List<Integer> list_3rd = new ArrayList<Integer>(list.subList(0, 3));
		List<Integer> list_2nd = new ArrayList<Integer>(list.subList(3, 5));
		List<Integer> list_1st = new ArrayList<Integer>(list.subList(5, 6));
		System.out.println("3등 복권을 추첨합니다.");
		System.out.println(list_3rd);
		System.out.println("2등 복권을 추첨합니다.");
		System.out.println(list_2nd);
		System.out.println("1등 복권을 추첨합니다.");
		System.out.println(list_1st);
		System.out.println("*** 복권 추첨 결과 ***");
		System.out.println("1등:"+ list_1st);
		System.out.println("2등:"+ list_2nd);
		System.out.println("3등:"+ list_3rd);
	}

}
