package chap14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 1. 대한민국(서울), 캐나다(오타와), 영국(런던), 스위스(베른)를 HashMap에 저장하고
 *    화면에서 나라이름을 입력받아 해당 수도를 출력하는 프로그램 작성하기
 * 2. 등록된 나라가 아닌 경우, "등록된 나라가 아닙니다. 수도를 입력하시겠습니까?(y)"
 *    y 일떄 "수도를 입력하세요" 메시지 출력 후 HashMap 나라이름과 수도이름 등록하기
 * 3. 프로그램 종료 시 map의 정보 출력하기
 *    keySet()
 *    entrySet()
 */
public class Exam4 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		String[] nation = {"대한민국", "캐나다", "영국", "스위스"};
		String[] city = {"서울", "오타와", "런던", "베른"};
		for(int i=0; i<nation.length; i++) {
			map.put(nation[i], city[i]);
		}
		Scanner scan = new Scanner(System.in);
		while(true) {
	    System.out.println("나라이름을 입력하세요(종료:종료)");
		String n = scan.next();
//      keySet()
//		if(n.equals("종료")) {
//			for(String key:map.keySet()) System.out.println(key+"의 수도:"+map.get(key));
//			break;
//		}
		//entrySet()
		if(n.equals("종료")) {
			Set<Map.Entry<String, String>> entry = map.entrySet();
			for(Map.Entry<String, String> m : entry) {
				System.out.println(m.getKey() +"의 수도:"+ m.getValue());
				
			}break;
		}
		if(map.get(n)==null) {
			System.out.println("등록된 나라가 아닙니다. 수도를 입력하시겠습니까?");
			if(scan.next().equals("y")) {System.out.println("수도를 입력하세요.");
			map.put(n, scan.next());continue;
			}else if(scan.next().equals("n"))continue;
		}
		System.out.println(n+"의 수도는 "+map.get(n)+"입니다.");
		}
		
	}

}
