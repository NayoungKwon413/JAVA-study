package chap14;

import java.util.Random;
import java.util.TreeSet;

/*
 * TreeSet 예제 (Random 클래스 사용)
 *  Lotto 번호를 TreeSet을 이용해 출력하기
 *  1~45 사이의 임의의 숫자를 중복없이 6개 찾아서 정렬하여 출력하기
 */
public class Exam3_re {

	public static void main(String[] args) {
		TreeSet<Integer> lotto =new TreeSet<>();
		Random ball = new Random();
		ball.setSeed(System.currentTimeMillis());
		while(lotto.size()<6) {
			lotto.add(ball.nextInt(45)+1); //1부터 45 사이의 랜덤한 수
		}
		System.out.println(lotto);
	}

}
