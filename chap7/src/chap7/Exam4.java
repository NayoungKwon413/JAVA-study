package chap7;
/*
 * 
 */

class Animal2 {
	String name;
	int age;
	String info() {
		return "이름:" + name + ", 나이:" + age + "살";
	}
	Animal2(String n, int a) {
		name = n;
		age = a;
	}
	Animal2(int a) {
		this("사람", a);
	}
	Animal2(String n) {
		this(n, 1);
	}
	Animal2() {
		this("사람", 1);
	}
		
	}

public class Exam4 {

	public static void main(String[] args) {
		Animal2 a1= new Animal2("원숭이",26);
		Animal2 a2= new Animal2(10);
		Animal2 a3= new Animal2("사자");
		Animal2 a4= new Animal2();
		System.out.println(a1.info());  //이름:원숭이, 나이:26살
		System.out.println(a2.info());  //이름:사람, 나이:10살
		System.out.println(a3.info());  //이름:사자, 나이:1살
		System.out.println(a4.info());  //이름:사람, 나이:1살

	}

}
