package chap14;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet 예제
 *   Set 인터페이스의 하위 인터페이스인 SortedSet의 구현 클래스
 *   Set : 중복불가
 *   SortedSet : Set 인터페이스의 하위 인터페이스. 정렬됨
 */
public class SetEx3 {
	public static void main(String[] args) {
//		Set<String> set = new TreeSet<>();  //가능하나 subSet 사용할 수 없음 -> 순서가 없기 때문. TreeSet의 경우 자동정렬되기 때문에 고정된 자리가 생겨 사용가능
//		SortedSet<String>set = new TreeSet<>(); //가능
		TreeSet<String> set = new TreeSet<>();
		String from = "bat";
		String to = "d";
		set.add("abc"); set.add("alien");
		set.add("bat"); set.add("azz");
		set.add("car"); set.add("Car");
		set.add("disc"); set.add("dance");
		set.add("dZZZZ"); set.add("dzzzz");
		set.add("elevator"); set.add("fan");
		set.add("flower"); 
		System.out.println(set);
		System.out.println("from:" +from+", to:"+to);
		System.out.println(set.subSet(from, to));
		System.out.println("from:" +from+", to:"+to+"zzzz");
		System.out.println(set.subSet(from, to+"zzzz"));
		//내림차순 정렬하기
//		set = new TreeSet<>(new Descending());
		
//		set = new TreeSet<>(new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return s2.compareTo(s1);
//			}
//		});  //이렇게 구현도 가능
		
		//jdk8.0 이후 역순 정렬
//		set = new TreeSet<>(Comparator.reverseOrder()); //Comparator.reverseOrder() 메서드 사용하면 바로 역순으로 변환됨.
		
		//set 순서를 대소문자 상관없이 오름차순으로 정렬하기
		set = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareToIgnoreCase(s2);
			}
		});
		//set 순서를 대소문자 상관없이 오름차순으로 정렬하기 => 람다방식으로
		set = new TreeSet<>((s1,s2)->s1.compareToIgnoreCase(s2));
		
		set.add("abc"); set.add("alien");
		set.add("bat"); set.add("azz");
		set.add("car"); set.add("Car");
		set.add("disc"); set.add("dance");
		set.add("dZZZZ"); set.add("dzzzz");
		set.add("elevator"); set.add("fan");
		set.add("flower"); 
		System.out.println(set);
	}

}
class Descending implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2)* (-1);
//		return s2.compareTo(s1);  //이렇게 구현도 가능
	}
}