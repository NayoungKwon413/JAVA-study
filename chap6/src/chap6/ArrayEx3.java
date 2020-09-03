package chap6;
/*
 * �ζ� ��ȣ ������
 */
public class ArrayEx3 {

	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		//balls �迭�� 1~45������ ��ȣ�� ����
		for(int i = 0; i<balls.length; i++) {
			balls[i] = i+1;
			
		}
		//balls �迭�� ������ ����
		for(int i=0; i<1000; i++) {
			int f = (int)(Math.random() * 45);
			int t = (int)(Math.random() * 45);
			int tmp = balls[f];
			balls[f] = balls[t];
			balls[t] =tmp;
		}
		//6���� ��ȣ�� �����Ͽ� lotto �迭�� ����
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = balls[i];
			System.out.print(lotto[i] + ",");
		}
		System.out.println("\n�����Ͽ� ����ϱ�");
		//�����ϱ�
		for(int i=0; i<lotto.length; i++) {
			boolean change = false;  //�̹� ���ĵǾ� �ִ� ���¶� ��ȭ�� ���� ��, �ٷ� �ݺ������� out -> ��� ��������� ���ɻ� �ʿ�
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
