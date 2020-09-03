package Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Test3_re {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		while(set.size() <6) {
			if(set.size()==0)
				System.out.println("3등 복권 추첨합니다.");
			else if(set.size()==3)
				System.out.println("2등 복권 추첨합니다.");
			else if(set.size()==5)
				System.out.println("1등 복권 추첨합니다.");
			//int num = (int)(Math.random()*1000)+1;
			int num=rand.nextInt(1000)+1;
			if(set.add(num)) {  //중복된 경우 false
				System.out.println(num);
			}
		}
		System.out.println("*** 복권 추첨 결과 ***");
		List<Integer> list = new ArrayList<>(set);
		for(int i=list.size()-1; i>=0; i--) {
			if(i==list.size()-1)
				System.out.println("1등:"+list.get(i));
			else if(i==list.size()-3)
				System.out.println("2등:"+list.get(i));
			else if(i==list.size()-6)
				System.out.println("3등:"+list.get(i));
		}

	}

}
