package chap7;
/*
 *  동물클래스(Animal)
    멤버변수 : 이름(name), 나이(age)
    멤버메서드: eat() ;
    기능 : "맛있게 얌얌" 출력

[결과]
     이름(name):원숭이
     나이(age):20
     맛있게 얌얌  
 */

class Animal {
	String name;
	int age;
	String eat() {
		return "맛있게 얌얌";
	}
	public String toString() {
		return "이름(name):" + name + "\n나이(age):" + age + "\n"+ eat();
	}
}

public class hw4 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.name = "원숭이";
		a1.age = 20;
		System.out.println(a1);

	}

}
