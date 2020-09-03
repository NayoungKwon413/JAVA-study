package chap7;
/*
 * ����Ŭ������ �������� �� ����� ��µǵ��� SutdaCard Ŭ������ �����ϱ�
 * ��� ������ number, isKwang�� �ִ�.
 * [���]
 * 3
 * 1K
 */

class SutdaCard {
	int number;
	boolean isKwang;
	SutdaCard(int n, boolean b) {
		number =n;
		isKwang = b;
		
	}
	SutdaCard() {
		number=1;
		isKwang = true;
		
	}
	public String toString() {
		return number + ((isKwang)?"K":" ");
	}
	
}

public class Exam3 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		SutdaCard card3 = new SutdaCard(3, true);
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);

	}

}
