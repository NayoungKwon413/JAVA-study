package chap4;
/*
 * ���� ������ : =, +=, -=, ...
 */
public class OpEx9 {

	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);  //100
		num += 10;  //-> num = num + 10;
		System.out.println(num);  //110
		num /= 10;  //-> num = num / 10;
		System.out.println(num);  //11
		num *= 2+3;  //-> num = num * (2+3); 
		System.out.println(num);  //55
		
		
		byte b = 1;
		b *= 2;
		//b = b * 2; �Ϲݿ����� ��� int�� ����ȯ�� �ʿ��ϳ�, ���Կ��꿡���� �ش���� ����
		System.out.println(b);
		b *= 200;
		System.out.println(b);

	}

}
