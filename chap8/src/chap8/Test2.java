package chap8;
/*
 * Coin Ŭ������ ���� Ŭ���� �����ϱ�
  Coin Ŭ����
   ������� : int side (�ո�:0, �޸�:1), serialNo(������ȣ), sno(������ȣ ���������� Ŭ��������)
   ����޼��� : void flip()
           Math.random() �޼��带 ����Ͽ� side�� ����.

  ����Ŭ����
    Coin Ŭ������ ��ü�� 10�� �����ϱ�.
    ��ü������, ������ȣ�� �Է��ϰ�, flip() �޼��带 �̿��Ͽ� ������ ������ �ո����� �޸����� ���θ� ����ϱ�
  [���]
1������ : �ո�
2������ : �޸�
  ....
��ü �ո� ������ ���� :
��ü �޸� ������ ���� : 
 */

class Coin {
	int side=0|1, serialNo;
	static int sno;
	Coin() {
		serialNo  = ++sno;
	}
	void flip() {
		side = (int)(Math.random()*2);
//		if(side == 0) {	
//			System.out.println("�ո�");
//		}else System.out.println("�޸�");
	}
}

public class Test2 {

	public static void main(String[] args) {
		int front=0, back=0;
		Coin arr[] = new Coin[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Coin();
			arr[i].flip();
			System.out.println(arr[i].serialNo + "������ : " + ((arr[i].side == 0)?"�ո�":"�޸�"));
			
			if(arr[i].side ==0) {
				front++;
			} else back++;
		}
		System.out.println("��ü �ո� ������ ���� : " + front);
		System.out.println("��ü �޸� ������ ���� : " + back);

	}

}
