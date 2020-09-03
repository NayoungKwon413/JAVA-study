package chap12;
/*
 * hashcode : ������ hashcode�� JVM�� ��ü�� �����ϱ� ���� ������. 
 *            ������ ������ ���� ��� ���� hashcode ���� �������� �������̵��� �ʿ���.
 *            
 * �ڹٿ��� ����񱳸� ���Ͽ� equals �޼��带 �������̵� �ϴ� ��� hashcode �޼��嵵 �Բ� �������̵��ϴ� ���� ������.
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
		
		if(s1 == s2) System.out.println("s1�� s2�� ���� ��ü");
		else System.out.println("s1�� s2�� �ٸ� ��ü��");
		
		System.out.println(s1.hashCode());  //String - hashcode�޼��带 �������̵���.
		System.out.println(s2.hashCode());  //������ ���� ���, ���� hashcode ���� ����
		System.out.println("s1 ��ü�� ��¥ �ؽ���:" + System.identityHashCode(s1)); //�׷��� ��������� s1 �� s2�� �ٸ� ��ü=> system.identitiyHashCode
		System.out.println("s2 ��ü�� ��¥ �ؽ���:" + System.identityHashCode(s2)); //��¥ �ڽ��� hashcode �� �� �� ����
		
		Card c1=new Card("Spade", 1);
		Card c2=new Card("Spade", 1);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println("c1 ��ü�� ��¥ �ؽ���:" + System.identityHashCode(c1));
		System.out.println("c2 ��ü�� ��¥ �ؽ���:" + System.identityHashCode(c2));
	}

}
