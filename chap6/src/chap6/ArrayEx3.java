package chap6;
/*
 * 로또 번호 생성기
 */
public class ArrayEx3 {

	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		//balls 배열에 1~45까지의 번호를 저장
		for(int i = 0; i<balls.length; i++) {
			balls[i] = i+1;
			
		}
		//balls 배열의 내용을 섞기
		for(int i=0; i<1000; i++) {
			int f = (int)(Math.random() * 45);
			int t = (int)(Math.random() * 45);
			int tmp = balls[f];
			balls[f] = balls[t];
			balls[t] =tmp;
		}
		//6개의 번호를 선택하여 lotto 배열에 저장
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = balls[i];
			System.out.print(lotto[i] + ",");
		}
		System.out.println("\n정렬하여 출력하기");
		//정렬하기
		for(int i=0; i<lotto.length; i++) {
			boolean change = false;  //이미 정렬되어 있는 상태라 변화가 없을 시, 바로 반복문에서 out -> 없어도 상관없으나 성능상 필요
			for(int j=0; j<lotto.length - 1 - i; j++) {
				if(lotto[j] > lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
					change = true;
				}
			}
			if(!change) break;
		}
		for(int l : lotto) {
			System.out.print(l + ",");
		}

	}

}
