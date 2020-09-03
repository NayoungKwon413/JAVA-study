package chap8;
/*
 * 회사가 고용하는 여러 유형의 직원들이 있다.

직원은 정규직원과 비정규직원 으로 나뉜다.
모든 직원은 직원구분(type), 이름(name), 주소(address),소속부서(dept)정보를 가진다ㅏ.
정규직원은 직원번호(empNo), 직급(position), 연봉(salary)를 가진다.
비정규직원은 계약만료일(expireDate), 기본임금(primaryPay)를 가진다.

직원클래스(Employee)
정규직원 클래스(FormalEmployee)
비정규직원클래스(InformalEmployee)

정규직원은 급여로 연봉 / 12 로 비정규직원은 기본입금을 급여로 받는다.
 모든 클래스에 getPay() 메서드를 구현하기 

[결과]
정규직, 이름=김정규, 주소=서울시 용산구, 부서=총무부, 직원번호=1, 직급=과장, 연봉=5000
김정규의 급여 : 416
비정규직, 이름=이비정, 주소=서울시 구로구, 부서=영업부, 계약만료인=Sat Sep 04 15:46:45 KST 2021, 기본입금=1000
이비정의 급여 : 1000
 */
import java.util.Date;

class Employee {
	String type, name, address, dept;
	Employee(String type, String name, String address, String dept) {
		this.type=type;
		this.dept=dept;
		this.name=name;
		this.address=address;
		
	}
	int getpay() {
		return 0;
	}
	
}
class FormalEmployee extends Employee {
	int salary;
	String position, empNo;
	FormalEmployee(String name, String address, String dept, String empNo, int salary, String position) {
		super("정규직", name, address, dept);
		this.salary=salary;
		this.empNo=empNo;
		this.position=position;
	
	}
	int getPay() {
		return salary/12;
	}
	public String toString() {
		return type + ", 이름=" + name + ", 주소=" + address + ", 부서=" + dept + ", 직원번호=" + empNo 
				+ ", 직급=" + position + ", 연봉=" + salary;
	}

	
}
class InformalEmployee extends Employee {
	Date expireDate;
	int primaryPay;
	InformalEmployee(String name, String address, String dept, Date expireDate, int primaryPay) {
		super("비정규직", name, address, dept);
		this.expireDate=expireDate;
		this.primaryPay=primaryPay;
		
	}
	int getPay() {
		return primaryPay;
	}
	public String toString() {
		return type + ", 이름=" + name + ", 주소=" + address + ", 부서=" + dept + ", 계약만료일=" + expireDate + ", 기본임금=" + primaryPay;
	}
}

public class Test1 {

 public static void main(String[] args) {

    FormalEmployee fe = new FormalEmployee ("김정규", "서울시 용산구","총무부", "1", 5000, "과장");
    System.out.println(fe);
    System.out.println(fe.name + "의 급여 : " + fe.getPay());

    Date expireDate = new Date();  //오늘 날짜

    expireDate.setTime(expireDate.getTime() +(1000L * 60 * 60 * 24 * 365 * 2));
   //expireDate.getTime() : 현재시간을 밀리초로 리턴. 1970.1.1부터 현재까지의 시간을 미리초
    
    InformalEmployee ie = new InformalEmployee ("이비정", "서울시 구로구", "영업부", expireDate, 1000);
    System.out.println(ie);
    System.out.println(ie.name + "의 급여 : " +  ie.getPay());

 }

}