package chap7;
/* 1. card1 ��ü �����ϱ�
 * 2. card1.kind = "Heart", number=1�� �ʱ�ȭ�ϱ�
 * 3. card1 ����ϱ�
 * 4. card2 ��ü �����ϱ�
 * 5. card2.kind = "Spade", number=1�� �ʱ�ȭ�ϱ�
 * 6. card2 ����ϱ�
 * 7. card�� ũ�⸦ (50,80) ���� �����ϱ�
*/

class Card {
	 String kind;
	 int number;
	 static int width = 100;
	 static int height = 250;
	 
	 //toString() �޼��� : ��ü�� ���ڿ�ȭ�� �����ϴ� �޼���
	 public String toString() {
	  return kind + ":" + number + "(" + width + "," + height +")";
	 }

	}

public class hw3 {

	public static void main(String[] args) {
		//1. card1 ��ü �����ϱ�
		Card card1 = new Card();
		//2. card1.kind = "Heart", number=1�� �ʱ�ȭ�ϱ�
		card1.kind = "Herat";
		card1.number =1;
		//3. card1 ����ϱ�
		System.out.println(card1.toString()); //���������� ����ϰ��� �� ��, toString �޼��带 ���ؼ� ������ �ҷ���.
		//4. card2 ��ü �����ϱ�
		Card card2 = new Card();
		//5. card2.kind = "Spade", number=1�� �ʱ�ȭ�ϱ�
		card2.kind = "Spade";
		card2.number = 1;
		//6. card2 ����ϱ�
		System.out.println(card2);
		//7. card�� ũ�⸦ (50,80) ���� �����ϱ�
		Card.width = 50;
		Card.height = 80;
		System.out.println(card1);
		System.out.println(card2);

	}

}
