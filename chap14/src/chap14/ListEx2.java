package chap14;

import java.util.Vector;

/*
 * Vector ���� : Collection �����ӿ�ũ ���� Ŭ����
 *              List �������̽��� ���� Ŭ����
 *              ���� ���� �޼���� List�� ������ �޼��尡 �Բ� ������.
 */
public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
		list.add(0.3);
		list.add(Math.PI);
		list.addElement(5.0);  // �� �޼��� : Vector Ÿ�� ���������θ� ��밡��.
		for(Double d : list) {
			System.out.println(d);
		}
		double num=5.0;
		int index = list.indexOf(num);
		if(index <0) {
			System.out.println(num+"�� list�� �����ϴ�.");
		}else {
			System.out.println(num + "�� ��ġ:" + index);
		}
		num = 0.3;
		System.out.println(list.indexOf(num));
		if(list.contains(num)) {
			list.removeElement(num);  // �� �޼��� :  Vector Ÿ�� ���������θ� ��밡��.
			System.out.println(num + "������");
		}
		list.remove(5.0);
		System.out.println(list);
	}

}
