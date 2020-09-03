package chap8;
/*
 * SutdaDeck Ŭ���� �����ϱ�
 *   ������� : cards : SutdaCard 20�� ������ �迭
 *   ������ : SutdaCard 20���� �����Ͽ� cards �迭�� ����
 *   �޼��� : toString() �������̵��Ͽ� ����� ��µǵ��� ����
 *          shuffle() : cards 20�� ī�带 ����
 *          SutdaCard pick(int index) : index�� �ش��ϴ� ī�� �� ���� ����
 *          SutdaCard pick() : ������ ī�� �� �� ����
 */

class SutdaCard {
	int number;
	boolean isKwang;
	SutdaCard() {
		this(1, true);
	}
	SutdaCard(int number, boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}
	public String toString() {
		return number + ((isKwang)?"K":"");
	}
}
class SutdaDeck {
	SutdaCard[] cards = new SutdaCard[20];
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			cards[i] = new SutdaCard((i%10)+1, ((i==0||i==2||i==7)?true:false));
			
		}
				
	}
	@Override  //object�� toString �޼��带 �������̵� �� ��.
	public String toString() {
		String result = "";
		for(SutdaCard s : cards) {
			result += s + ",";
		}
		return result;
	}
	void shuffle() {
		for(int i=0; i<=100; i++) {
			int a = (int)(Math.random() *20);
			int b = (int)(Math.random() *20);
			SutdaCard temp = new SutdaCard();
			temp = cards[a];
			cards[a] = cards[b];
			cards[b] = temp;
			
		}
	}
	SutdaCard pick(int index) {
		return cards[index];
		
	}
	SutdaCard pick() {
		return cards[(int)(Math.random() *20)];
	}
}

public class Exam1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck); //1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10
		deck.shuffle();
		System.out.println(deck);
		System.out.println("ù��° ī�� : " + deck.pick(0));
		System.out.println("�ι�° ī�� : " + deck.pick());

	}

}
