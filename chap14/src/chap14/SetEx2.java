package chap14;

import java.util.HashSet;
import java.util.Set;

/*
 * 객체의 중복성 판단하는 기준
 *   1. equals   : 결과가 true 이고
 *   2. hashCode : 결과값이 같은 경우
 *                => 두 객체가 중복되었다 라고 인식
 *                
 * => equals 메서드를 오버라이딩 하는 경우 hashCode() 메서드도 오버라이딩 하도록 권장함
 */
class Person {
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "(" + name + "," +age +")";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return name.equals(p.name) && age == p.age;
		}else return false;
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("홍길동",10));
		set.add(new Person("홍길동",10));
		System.out.println(set);
	}

}
