package chap12;
/*
 * hashcode : 원래의 hashcode는 JVM이 객체를 구별하기 위한 참조값. 
 *            하지만 내용이 같은 경우 같은 hashcode 값을 가지도록 오버라이딩이 필요함.
 *            
 * 자바에서 내용비교를 위하여 equals 메서드를 오버라이딩 하는 경우 hashcode 메서드도 함께 오버라이딩하는 것을 권장함.
 */
class Card {
	String kind;
	int num;
	Card(String kind, int num) {
		  this.kind=kind;
		  this.num=num;
		}
}

public class HashCodeEx1 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		if(s1 == s2) System.out.println("s1과 s2는 같은 객체");
		else System.out.println("s1과 s2는 다른 객체임");
		
		System.out.println(s1.hashCode());  //String - hashcode메서드를 오버라이딩함.
		System.out.println(s2.hashCode());  //내용이 같은 경우, 같은 hashcode 값을 리턴
		System.out.println("s1 객체의 진짜 해쉬값:" + System.identityHashCode(s1)); //그러나 결론적으로 s1 과 s2는 다른 객체=> system.identitiyHashCode
		System.out.println("s2 객체의 진짜 해쉬값:" + System.identityHashCode(s2)); //진짜 자신의 hashcode 값 볼 수 있음
		
		Card c1=new Card("Spade", 1);
		Card c2=new Card("Spade", 1);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println("c1 객체의 진짜 해쉬값:" + System.identityHashCode(c1));
		System.out.println("c2 객체의 진짜 해쉬값:" + System.identityHashCode(c2));
	}

}
