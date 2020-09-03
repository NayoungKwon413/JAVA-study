import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<String,String>();
		map.put("대한민국", "서울");  map.put("영국", "런던");
		map.put("미국", "워싱턴");  map.put("중국", "베이징");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("수도를 알고 싶은 나라를 입력하세요(종료:끝)");
			String key = scan.next();
			if(key.equals("끝")) break;
			if(map.get(key)==null) {
				System.out.println("등록되지 않은 국가입니다."); 
			}else System.out.println(key+"=" + map.get(key));
			
		}
		System.out.println(map.entrySet());
		
	}

}
