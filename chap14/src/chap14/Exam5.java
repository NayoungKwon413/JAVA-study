package chap14;
/*
 * 섯다게임하기
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//SutdaCard 클래스 구현하기
class SutdaCard {
	int num;
	boolean isKwang;
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public SutdaCard() {
		this(1,true);
	}
	public String toString() {
		return num + (isKwang?"K":"");
	}
}
/*
 * SutdaDeck 클래스
 *   멤버변수 : List<SutdaCard> cards;
 *           Map<String, Integer> jokbo;
 *    생성자 : 매개변수없음
 *           SutdaCard 2장을 cards에 저장 
 *           1~10 숫자를 가진 카드가 각 2장씩 -> 1,3,8인 경우 한 장은 isKwang=true
 */
class SutdaDeck {
	List<SutdaCard> cards;
	Map<String, Integer> jokbo;
	SutdaDeck(){
		cards = new ArrayList<>();
		for(int i=0; i<20; i++) {
			cards.add(new SutdaCard(i%10+1,(i==0||i==2||i==7)?true:false));
		}
		System.out.println(cards);
		jokbo = new HashMap<>();
		jokbo.put("KK", 4000);
		for(int i=1; i<=10; i++) {
			jokbo.put(""+i+i, 3000+(i*10));
		}
		jokbo.put("12", 2060);
		jokbo.put("21", 2060);
		jokbo.put("14", 2050);
		jokbo.put("41", 2050);
		jokbo.put("19", 2040);
		jokbo.put("91", 2040);
		jokbo.put("110", 2030);
		jokbo.put("101", 2030);
		jokbo.put("410", 2020);
		jokbo.put("104", 2020);
		jokbo.put("46", 2010);
		jokbo.put("64", 2010);
		}
	public void shuffle() {
		Collections.shuffle(cards);
		System.out.println(cards);
	}
	public SutdaCard pick() {
		return cards.remove(0);
	}
	
}
/*
 * Gambler 클래스
 *   멤버변수 :이름(name), SutdaCard c1, c2
 *   생성자 : 구동클래스에 맞게
 *   메서드 : getScore() : c1과 c2 카드 점수를 더한 값 리턴
 *          c1, c2카드가 jokbo에 있는 경우는 족보점수 리턴
 *          jokbo에 없는 경우는 (c1번호+c2번호)%10 리턴
 *          toString() : 이름과 카드 2장 문자열로 리턴
 */
class Gambler {
	String name;
	SutdaCard c1, c2;
	SutdaDeck deck;
	Gambler(String name, SutdaCard c1, SutdaCard c2, SutdaDeck deck){
		this.name=name;
		this.c1=c1;
		this.c2=c2;
	}
	public int getScore() {
		Integer score = null;
		if(c1.isKwang && c2.isKwang) {
			deck.jokbo.get("KK");
		}else {
			score= deck.jokbo.get(""+c1.num+c2.num);  //c1.num과 c2.num을 붙여 문자열로 만듦
			if(score == null) {
				score=(c1.num+c2.num)%10;
			}
		}
		return score;
	}
	public String toString() {
		return "이름:"+name+ "카드: (" + c1 +"," +c2+") 점수:"+getScore();
	}
	
}
public class Exam5 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		Gambler g1 = new Gambler("타짜", deck.pick(), deck.pick(),deck);
		Gambler g2 = new Gambler("고수", deck.pick(), deck.pick(),deck);
		System.out.println(g1);
		System.out.println(g2);
		System.out.println("deck에 남은 카드의 갯수:"+deck.cards.size());
		if(g1.getScore()>g2.getScore()) {
			System.out.println(g1.name+"승리");
		}else if(g1.getScore()<g2.getScore()) {
			System.out.println(g2.name+"승리");
		}else {
			System.out.println(g1.name+"과"+g2.name+" 비김.");
		}
	}

}
