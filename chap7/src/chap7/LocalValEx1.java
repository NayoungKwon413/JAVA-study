package chap7;
/*
 * �������� ����
 *   �������� :
 *     1. �޼��� ���ο� ����� ����
 *     2. �Ű������� ����������.
 *     3. �ݵ�� �ʱ�ȭ �ʿ�
 *     
 *     LocalValEx1 �� �������� : args, num, b, grade, score
 *     �Ű������� ȣ��� �̹� �ʱ�ȭ��.
 */
public class LocalValEx1 {

	public static void main(String[] args) {
		int num;
		boolean b= true;
		if(b) {
			num = 100;
		} else {
			num = 200;
		}
		System.out.println(num);
		String grade;
		int score = 80;
		switch(score/10) {
		case 9 : grade="A";break;
		case 8 : grade="B";break;
		case 7 : grade="C";break;
		case 6 : grade="D";break;
		default : grade = "F";
		}
		System.out.println("���� :" + grade);

	}

}
