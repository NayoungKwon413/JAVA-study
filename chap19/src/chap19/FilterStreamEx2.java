package chap19;

import java.util.Arrays;
import java.util.List;

class Person{
	private String name;
	private String gender;
	private int age;
	public Person(String name, String gender, int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public String getName() {return name;}
	public String getGender() {return gender;}
	public int getAge() {return age;}
}
public class FilterStreamEx2 {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(//list가 Person 의 객체들로 이루어져있기 때문
				new Person("홍길동","남",30), new Person("김삿갓","남",40),
				new Person("성춘향","여",20), new Person("향단이","여",22));
		System.out.print("남자들의 이름(나이) :");
		//p 는 Person. 
//		list.stream().filter(p->p.getGender().equals("남")).forEach(p->System.out.print(p.getName()+"("+p.getAge()+")"+", "));
		list.stream().filter(p->p.getGender().equals("남")).forEach(p->System.out.printf("%s(%d),",p.getName(),p.getAge()));
		System.out.println();
		System.out.print("여자들의 이름(나이) :");
		list.stream().filter(p->p.getGender().equals("여")).forEach(p->System.out.print(p.getName()+"("+p.getAge()+")"+", "));
		System.out.println();
		
		//mapXXX()
		//mapToInt : Stream을 다시 IntStream 형태로 변환
		//mapToInt(Person::getAge) 거치면 int형인 나이로만 이루어진 Stream으로 바뀜 
		//-> average().getAsDouble() 이 스트림의 값을 평균내어 double 형으로
		double ageAvg = list.stream().filter(p->p.getGender().equals("남")).mapToInt(Person::getAge).average().getAsDouble();
		System.out.println("남자들의 평균 나이:"+ageAvg);
		ageAvg = list.stream().filter(p->p.getGender().equals("여")).mapToInt(p->p.getAge()).average().getAsDouble();
		System.out.println("여자들의 평균 나이:"+ageAvg);
		System.out.println("모든 이름을 출력:");
		list.stream().map(Person::getName).forEach(System.out::print);
	}

}
