package chap8;
/*
 * Coin 클래스를 이용하여 동전 2개를 던져서 앞면이 세번 연속해서 나오는 동전이 승리한다.
 * 승리한 동전의 번호를 출력하기
 */
public class Test3 {

	public static void main(String[] args) {
		Coin coin1 = new Coin();
		Coin coin2 = new Coin();
		int cnt1=0, cnt2=0;
		while(cnt1 < 3 && cnt2 < 3) {
			coin1.flip();
			coin2.flip();
			System.out.println(((coin1.side==0)?"앞면":"뒷면") + "\t" + ((coin2.side==0)?"앞면":"뒷면"));
			
		if(coin1.side == 0) cnt1++;
		else cnt1=0;
		if(coin2.side == 0) cnt2++;
		else cnt2=0;
		}
		if(cnt1 > cnt2) System.out.println(coin1.serialNo + "번 동전 승리");
		else if (cnt2 > cnt1) System.out.println(coin2.serialNo + "번 동전 승리");
		else System.out.println("두개의 동전은 비겼습니다.");
		}

	}


