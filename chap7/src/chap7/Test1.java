package chap7;
/*
 * 1. ���� Ŭ���� ����� ������ ����� �������� Student Ŭ���� ����

Student Ŭ����
       ������� : �й�,�̸�,��������,��������, ��������
        ����޼��� : 
        1. int getTotal() : ����,����,���� ������ ���� ����
        2. float getAverage() : ����,����,���� ������ ����� ����
        3. void info() : �̸�,�й�, ����,����,����, ����,����� ����ϱ�
        ������ : 
        1. �Ű����� (�̸�, �й�) : �̸�,�й��� �ʱ�ȭ �ϰ�, ������ 0���� �ʱ�ȭ
        2. �Ű����� (�̸�, �й�, ����, ����, ����) :  �̸�,�й�, ������  �ʱ�ȭ 

[���]
�й�:1
�̸�:ȫ�浿
����:0
����:0
����:0
����:0
���:0.0
=====================
�й�:2
�̸�:���
����:80
����:90
����:70
����:240
���:80.0
=====================
 */

class Student {
	int no, kScore, eScore, mScore;
	String name;
	
	Student(String name, int no) {
		this.name = name;
		this.no = no;
	}
	Student(String name, int no, int kScore, int eScore, int mScore) {
		this(name, no);
		this.kScore = kScore;
		this.eScore = eScore;
		this.mScore = mScore;
		
	}
	
	int getTotal() {
		return kScore + eScore + mScore;
	}
	float getAverage() {
		return (kScore + eScore + mScore) / 3;
	}
	void info() {
		System.out.println("�й�:" + no + "\n�̸�:" + name + "\n����:" + kScore + "\n����:" + eScore + "\n����:" + mScore + "\n����:" 
	+ getTotal() + "\n���:" + getAverage() + "\n=====================");
	}
}

public class Test1 {

	public static void main(String[] args) {
		Student s = new Student("ȫ�浿", 1);
		s.info();
		Student s2 = new Student("���", 2, 80, 90, 70);
		s2.info();
	}

}
