package chap7;
/*
 * �߻�ȭ : Ŭ������ �����ϴ� ����
 * Ŭ���� : ����� ���� �ڷ���(->�� ��ü�� ��ü�� �ƴ�)
 *        �Ӽ� : ����
 *        ��� : �޼���
 */
class Phone {
	String color;
	boolean power;
	String no;
	void power() {
		power = !power;
	}
	void send(String no) {
		System.out.println(no + "�� ��ȭ �۽� �� ~~~");
	}
	void receive(String no) {
		System.out.println(no + "�� ��ȭ ���� �� ~~~");
		
	}
}
//����Ŭ���� : main �޼��带 ������ �ִ� Ŭ����
public class PhoneEx1 {

	public static void main(String[] args) {
		Phone p1 = new Phone();  //��üȭ, �ν��Ͻ�ȭ (=> Phone�� p1 ��ü)
		p1.color = "����"; //(p1��ü�� "����"�̶�� ���� ����)
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		p1.send("01098765432");
		p1.receive("01098765432");
		
		Phone p2 = new Phone();
		p2.color = "����";
		p2.power = false;
		p2.no = "01098765432";
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
		
		p2 = p1; //p1 ���� p2��-> ���� ��ü�� �����ϰ� �ִ�.
		
		p1.power();  //���� ��������� �ʾ����� Phone Ŭ���� �ȿ� ���� ���� 
		p1.power();
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		System.out.println(p2.color + "," + p2.power + "," + p2.no);

	}

}
