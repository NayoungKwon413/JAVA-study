package chap8;
/*
 * Coin Ŭ������ �̿��Ͽ� ���� 2���� ������ �ո��� ���� �����ؼ� ������ ������ �¸��Ѵ�.
 * �¸��� ������ ��ȣ�� ����ϱ�
 */
public class Test3 {

	public static void main(String[] args) {
		Coin coin1 = new Coin();
		Coin coin2 = new Coin();
		int cnt1=0, cnt2=0;
		while(cnt1 < 3 && cnt2 < 3) {
			coin1.flip();
			coin2.flip();
			System.out.println(((coin1.side==0)?"�ո�":"�޸�") + "\t" + ((coin2.side==0)?"�ո�":"�޸�"));
			
		if(coin1.side == 0) cnt1++;
		else cnt1=0;
		if(coin2.side == 0) cnt2++;
		else cnt2=0;
		}
		if(cnt1 > cnt2) System.out.println(coin1.serialNo + "�� ���� �¸�");
		else if (cnt2 > cnt1) System.out.println(coin2.serialNo + "�� ���� �¸�");
		else System.out.println("�ΰ��� ������ �����ϴ�.");
		}

	}


