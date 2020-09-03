package chap19;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * 외부 반복자와 내부 반복자
 *   기존의 방식으로 조회하는 방법과 스트림식 조회 방법 비교
 *   
 */
public class IteratorEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "김삿갓", "이몽룡", "성춘향", "임꺽정", "향단이");  //aslist:연결된 문자열을 list로 만들어줌
		System.out.println("외부 반복자 이용");
		Iterator it= list.iterator();
		while(it.hasNext())
			System.out.println(it.next());  //외부 반복자:하나씩 불러와서 출력
		
		System.out.println("내부 반복자 이용(Stream방식)");
		list.stream().forEach(s->System.out.println(s)); //list.stream() : stream 안쪽에 집어넣어 내부 반복으로 출력
		Stream<String> st = list.stream();
		System.out.println("forEach 메서드 사용하기1");
		st.forEach(s->System.out.println(s));
		System.out.println("forEach 메서드 사용하기2");
//		st.forEach(s->System.out.println(s));  //Stream 객체 st 기준, 앞에서 출력이 이미 끝났으므로 s의 위치는 가장 끝 -> 즉 읽을 내용이 없음.
		list.stream().forEach(s->System.out.println(s));   //list.stream() 부터 다시 시작해야 출력가능
	}

}
