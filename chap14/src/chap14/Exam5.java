package chap14;
/*
 * ���ٰ����ϱ�
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//SutdaCard Ŭ���� �����ϱ�
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
 * SutdaDeck Ŭ����
 *   ������� : List<SutdaCard> cards;
 *           Map<String, Integer> jokbo;
 *    ������ : �Ű���������
 *           SutdaCard 2���� cards�� ���� 
 *           1~10 ���ڸ� ���� ī�尡 �� 2�徿 -> 1,3,8�� ��� �� ���� isKwang=true
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
 * Gambler Ŭ����
 *   ������� :�̸�(name), SutdaCard c1, c2
 *   ������ : ����Ŭ������ �°�
 *   �޼��� : getScore() : c1�� c2 ī�� ������ ���� �� ����
 *          c1, c2ī�尡 jokbo�� �ִ� ���� �������� ����
 *          jokbo�� ���� ���� (c1��ȣ+c2��ȣ)%10 ����
 *          toString() : �̸��� ī�� 2�� ���ڿ��� ����
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
			score= deck.jokbo.get(""+c1.num+c2.num);  //c1.num�� c2.num�� �ٿ� ���ڿ��� ����
			if(score == null) {
				score=(c1.num+c2.num)%10;
			}
		}
		return score;
	}
	public String toString() {
		return "�̸�:"+name+ "ī��: (" + c1 +"," +c2+") ����:"+getScore();
	}
	
}
public class Exam5 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		Gambler g1 = new Gambler("Ÿ¥", deck.pick(), deck.pick(),deck);
		Gambler g2 = new Gambler("���", deck.pick(), deck.pick(),deck);
		System.out.println(g1);
		System.out.println(g2);
		System.out.println("deck�� ���� ī���� ����:"+deck.cards.size());
		if(g1.getScore()>g2.getScore()) {
			System.out.println(g1.name+"�¸�");
		}else if(g1.getScore()<g2.getScore()) {
			System.out.println(g2.name+"�¸�");
		}else {
			System.out.println(g1.name+"��"+g2.name+" ���.");
		}
	}

}
