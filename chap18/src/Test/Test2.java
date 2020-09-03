package Test;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/*
 * 3. 다음 결과가 나오도록 프로그램을 완성하시오
[결과]
이름 목록 :홍길동,김삿갓,이몽룡,김자바,박자바,
나이 목록 :10,30,15,25,20,
총나이의 합산 :100
나이의 평균 :20.0
 */
public class Test2 {
	static Person[] arr = {
			new Person("홍길동",10),
			new Person("김삿갓",30),
	        new Person("이몽룡",15),
	        new Person("김자바",25),
	        new Person("박자바",20)};
	public static void main(String[] args) {
		System.out.print("이름 목록 :");
		  printString(t->t.getName());
		  System.out.print("나이 목록 :");
		  printString(t->t.getAge()+"");
		  System.out.print("총나이의 합산 :");
		  printTot(t->t.getAge());
		  System.out.print("나이의 평균 :");
		  printAvg(t->t.getAge());
		 }

		 static void printString(Function<Person,String> f) {  //Person객체를 받아서 String으로 리턴 
			 for(Person p:arr) {
				 System.out.print(f.apply(p)+",");  //이름, 나이 목록 출력
			 }
			 System.out.println();
		 }
		 static void printTot(ToIntFunction<Person> f) {
			 int sum=0;
			 for(Person p:arr) {
				 sum += p.getAge();
			 }
			 System.out.println(sum);

		 }
		 static void printAvg(ToDoubleFunction<Person> f) {
			 double sum=0;
			 for(Person p:arr) {
				 sum += p.getAge();
			 }
			 System.out.println(sum/arr.length);

		 } 

		}
	


