package chap7;

class Rectangle {
	int width;
	int height;
	
}

public class Exam1 {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.width = 10;
		r1.height = 5;
		System.out.println("����:" + (r1.width * r1.height));  //����:50
		
		//�迭�� �̿��Ͽ� �簢�� ��ü�� 3�� �����ϱ�
		//��� �簢���� ���� ���� ����ϱ�
		Rectangle [] rec =new Rectangle[3];
		int sum =0;
		for(int i=0; i<rec.length; i++) {
			rec[i] = new Rectangle();
			rec[i].width = 10+i;
			rec[i].height = 5+i;
			sum += (rec[i].width * rec[i].height);
		}
		System.out.println("��� �簢���� ���� ��:" + sum);

	}

}
