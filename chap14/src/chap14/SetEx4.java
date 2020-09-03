package chap14;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * 사용자 정의 클래스의 객체를 TreeSet에 저장하기
 * 
 * 정렬 관련 인터페이스
 *   1. Comparable<T> 인터페이스
 *     int compareTo(T) : 객체의 기본 정렬방식을 지정할때 사용
 *   2. Comparator<T> 인터페이스
 *     int compare(T,T) : 실행 시 정렬방식을 변경할 수 있음.
 */
class Phone implements Comparable<Phone>{
	String name;
	int number;
	public Phone(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public String toString() {
		return "(" + name + "," + number + ")";
	}
	@Override
	public int compareTo(Phone p) {
		return name.compareTo(p.name);  //정렬방식 :이름순 으로 지정
	}
	
}
public class SetEx4 {
	public static void main(String[] args) {
		System.out.println("이름순으로 정렬하여 출력하기");
		TreeSet<Phone> set = new TreeSet<>();
		set.add(new Phone("홍길동", 1234));
		set.add(new Phone("김삿갓", 3456));
		set.add(new Phone("이몽룡", 5678));
		System.out.println(set);
		System.out.println("전화번호순으로 정렬하여 출력하기");
		set = new TreeSet<>(new Comparator<Phone>() {
			@Override
			public int compare(Phone o1, Phone o2) {
				return o1.number-o2.number;
			}
		});
		set.add(new Phone("홍길동", 1234));
		set.add(new Phone("김삿갓", 3456));
		set.add(new Phone("이몽룡", 5678));
		System.out.println(set);
		System.out.println("전화번호 내림차순으로 정렬하여 출력하기");
		set = new TreeSet<>(new Comparator<Phone>() {
			@Override
			public int compare(Phone o1, Phone o2) {
				return o2.number-o1.number;
			}
		});
		set.add(new Phone("홍길동", 1234));
		set.add(new Phone("김삿갓", 3456));
		set.add(new Phone("이몽룡", 5678));
		System.out.println(set);
		System.out.println("이름의 역순으로 정렬하여 출력하기");
//		set = new TreeSet<>(Comparator.reverseOrder()); //Comparator.reverseOrder() 사용-> 더 간단히 가능
		set = new TreeSet<>(new Comparator<Phone>() {
			public int compare(Phone o1, Phone o2) {
				return o1.compareTo(o2)*(-1);
			}
		});
		set.add(new Phone("홍길동", 1234));
		set.add(new Phone("김삿갓", 3456));
		set.add(new Phone("이몽룡", 5678));
		System.out.println(set);
	}

}
