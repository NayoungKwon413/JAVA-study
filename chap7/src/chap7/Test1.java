package chap7;
/*
 * 1. 구동 클래스 실행시 다음의 결과가 나오도록 Student 클래스 구현

Student 클래스
       멤버변수 : 학번,이름,국어점수,영어점수, 수학점수
        멤버메서드 : 
        1. int getTotal() : 국어,영어,수학 점수의 합을 리턴
        2. float getAverage() : 국어,영어,수학 점수의 평균을 리턴
        3. void info() : 이름,학번, 국어,영어,수학, 총점,평균을 출력하기
        생성자 : 
        1. 매개변수 (이름, 학번) : 이름,학번을 초기화 하고, 점수는 0으로 초기화
        2. 매개변수 (이름, 학번, 국어, 영어, 수학) :  이름,학번, 점수들  초기화 

[결과]
학번:1
이름:홍길동
국어:0
영어:0
수학:0
총점:0
평균:0.0
=====================
학번:2
이름:김삿갓
국어:80
영어:90
수학:70
총점:240
평균:80.0
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
		System.out.println("학번:" + no + "\n이름:" + name + "\n국어:" + kScore + "\n영어:" + eScore + "\n수학:" + mScore + "\n총점:" 
	+ getTotal() + "\n평균:" + getAverage() + "\n=====================");
	}
}

public class Test1 {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 1);
		s.info();
		Student s2 = new Student("김삿갓", 2, 80, 90, 70);
		s2.info();
	}

}
