package chap7;
/*
 * �迭�� �����ϱ�
 */
public class PhoneEx2 {

	public static void main(String[] args) {
		Phone[] parr = new Phone[3];  //Phone ��ü�� ������ �������� 3�� �迭�� ����
		for(int i=0; i<parr.length; i++) {
			parr[i] = new Phone();  //Phone ��ü�� ��üȭ
			parr[i].no = i+"1234";
		}
		for(Phone p : parr) {
			System.out.printf("%s\n",p.no);  //%s : ���ڿ� ����ǹ�
		}
		for(int i=0; i<parr.length; i++) {
			parr[i].send((i==0)?parr[parr.length-1].no:parr[i-1].no);
		}

	}

}
