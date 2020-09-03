package chap7;
/* 1. card1 객체 생성하기
 * 2. card1.kind = "Heart", number=1로 초기화하기
 * 3. card1 출력하기
 * 4. card2 객체 생성하기
 * 5. card2.kind = "Spade", number=1로 초기화하기
 * 6. card2 출력하기
 * 7. card의 크기를 (50,80) 으로 변경하기
*/

class Card {
	 String kind;
	 int number;
	 static int width = 100;
	 static int height = 250;
	 
	 //toString() 메서드 : 객체의 문자열화에 관여하는 메서드
	 public String toString() {
	  return kind + ":" + number + "(" + width + "," + height +")";
	 }

	}

public class hw3 {

	public static void main(String[] args) {
		//1. card1 객체 생성하기
		Card card1 = new Card();
		//2. card1.kind = "Heart", number=1로 초기화하기
		card1.kind = "Herat";
		card1.number =1;
		//3. card1 출력하기
		System.out.println(card1.toString()); //참조변수를 출력하고자 할 때, toString 메서드를 통해서 정보를 불러옴.
		//4. card2 객체 생성하기
		Card card2 = new Card();
		//5. card2.kind = "Spade", number=1로 초기화하기
		card2.kind = "Spade";
		card2.number = 1;
		//6. card2 출력하기
		System.out.println(card2);
		//7. card의 크기를 (50,80) 으로 변경하기
		Card.width = 50;
		Card.height = 80;
		System.out.println(card1);
		System.out.println(card2);

	}

}
