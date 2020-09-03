package chap18;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/*
 * Function 인터페이스
 *   - 매개변수도 있고 리턴값도 있음
 *   - R applyXXX(...) 메서드를 가짐
 *   
 *   Function<T,R>  R apply(T)
 *   ToIntFunction  int applyAsInt(T)
 *   ToDoubleFunction  double applyAsDoubble(T)
 *   ...
 */
class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	public Student(String name, int eng, int math, String major) {
		this.name=name;
		this.eng=eng;
		this.math=math;
		this.major=major;
	}
	public String getName() { return name;}
	public int getEng() { return eng;}
	public int getMath() { return math;}
	public String getMajor() { return major;}
}
public class LambdaEx8 {
	private static Student [] list = {
			new Student("홍길동", 90, 80, "경영"),
			new Student("김삿갓", 95, 70, "컴공"),
			new Student("이몽룡", 85, 75, "통계")
	};
	public static void main(String[] args) {
		System.out.print("학생의 이름:");
		printString(t->t.getName());
		System.out.print("학과의 이름:");
		printString(t->t.getMajor());
		System.out.print("수학 점수:");
		printString(t->t.getMath()+"");  //math 값은 int -> 문자열로 바꿔줘야함
		System.out.print("영어 점수:");
		printString(t->t.getEng()+"");  //eng 값은 int -> 문자열로 바꿔줘야함
		//문제1
		System.out.print("학생의 이름(영어점수):");
		printString(t->t.getName()+"("+(t.getEng()+"")+")"); 
		System.out.print("학생의 이름(수학점수):");
		printString(t->t.getName()+"("+(t.getMath()+"")+")"); 
		
		System.out.print("학생들의 영어 점수 합계:");
		printTot(t->t.getEng());
		System.out.print("학생들의 수학 점수 합계:");
		printTot(t->t.getMath());
		//문제2
		System.out.print("학생들의 총점 합계:");
		printTot(t->t.getMath()+t.getEng());  //t 의 자료형을 따로 정하지 않고 진행됨. t의 자료형은 Function인터페이스 제네릭을 확인해야
		//문제3
		System.out.print("학생들의 영어 평균점수:");
		printAvg(t->t.getEng());
		System.out.print("학생들의 수학 평균점수:");
		printAvg(t->t.getMath());
		System.out.print("학생들의 총점 평균점수:");
		printAvg(t->t.getEng()+t.getMath());
	}
	private static void printAvg(ToDoubleFunction<Student> f) {
		double sum=0;
		for(Student s : list) {
			sum += f.applyAsDouble(s);
		}
		System.out.println(sum/list.length);
	}
	private static void printTot(ToIntFunction<Student> f) {
		int sum=0;
		for(Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
		
	}
	private static void printString(Function<Student,String> f) {
		for(Student s:list) {
			System.out.print(f.apply(s)+",");
		}
		System.out.println();
	}

}
