package Test;
/*
*  int getRand(시작값,끝값) : 메서드 구현하기
*   시작값 ~ 끝값 또는 끝값~ 시작값 까지  범위에 숫자를 임의의 수로 리턴하는 함수
*   시작값, 끝값 은 포함됨. 
*   임의의 수이므로 결과값은 달라질수 있음. 단 -3 ~ 1 까지의 수만 출력됨.  
*/
public class Test3 {

	public static void main(String[] args) { 
		for(int i=0;i<20;i++) {
			System.out.print(getRand(1,-3)+",");
		}
			System.out.println();
			for(int i=0;i<20;i++) {
			System.out.print(getRand(-1,3)+",");
		 }
	}
	static int getRand(int start, int end) {
		int random=0;
		if(start>end) {
			random = (int)(Math.random()*(start-end+1))+end;	
		}else if(end>start) {
			random = (int)(Math.random()*(end-start+1))+start;		
		}
		return random;		
	}
	
	/*
	 * int min = (start>end)?end:start;
	 * int max = (start>end)?start:end;
	 * int cha = max-min;
	 * return (int)(Math.random() * (cha+1)) + min;
	 */
}
