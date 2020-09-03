package chap5;
/*
 * 제어문
 * break    : 반복문이나 switch 구문을 벗어남.
 * continue : 반복문의 처음으로 제어를 이동함.(반복문에서만 사용가능)
 */
public class LoopEx5 {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) { 
			System.out.println("\n" + i + "단");
			for(int j = 2; j <= 9; j++) {
//				if(j==5) break;
				if(j==5) continue;  //각 단에 5항만 제외됨. 조건이 맞는 경우 이후의 항목을 실행하지 않고 다시 위로 올라가 반복됨.
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}

	}

}
