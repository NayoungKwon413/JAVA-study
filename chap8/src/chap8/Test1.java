package chap8;
/*
 * ȸ�簡 ����ϴ� ���� ������ �������� �ִ�.

������ ���������� ���������� ���� ������.
��� ������ ��������(type), �̸�(name), �ּ�(address),�ҼӺμ�(dept)������ �����٤�.
���������� ������ȣ(empNo), ����(position), ����(salary)�� ������.
������������ ��ุ����(expireDate), �⺻�ӱ�(primaryPay)�� ������.

����Ŭ����(Employee)
�������� Ŭ����(FormalEmployee)
����������Ŭ����(InformalEmployee)

���������� �޿��� ���� / 12 �� ������������ �⺻�Ա��� �޿��� �޴´�.
 ��� Ŭ������ getPay() �޼��带 �����ϱ� 

[���]
������, �̸�=������, �ּ�=����� ��걸, �μ�=�ѹ���, ������ȣ=1, ����=����, ����=5000
�������� �޿� : 416
��������, �̸�=�̺���, �ּ�=����� ���α�, �μ�=������, ��ุ����=Sat Sep 04 15:46:45 KST 2021, �⺻�Ա�=1000
�̺����� �޿� : 1000
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
		super("������", name, address, dept);
		this.salary=salary;
		this.empNo=empNo;
		this.position=position;
	
	}
	int getPay() {
		return salary/12;
	}
	public String toString() {
		return type + ", �̸�=" + name + ", �ּ�=" + address + ", �μ�=" + dept + ", ������ȣ=" + empNo 
				+ ", ����=" + position + ", ����=" + salary;
	}

	
}
class InformalEmployee extends Employee {
	Date expireDate;
	int primaryPay;
	InformalEmployee(String name, String address, String dept, Date expireDate, int primaryPay) {
		super("��������", name, address, dept);
		this.expireDate=expireDate;
		this.primaryPay=primaryPay;
		
	}
	int getPay() {
		return primaryPay;
	}
	public String toString() {
		return type + ", �̸�=" + name + ", �ּ�=" + address + ", �μ�=" + dept + ", ��ุ����=" + expireDate + ", �⺻�ӱ�=" + primaryPay;
	}
}

public class Test1 {

 public static void main(String[] args) {

    FormalEmployee fe = new FormalEmployee ("������", "����� ��걸","�ѹ���", "1", 5000, "����");
    System.out.println(fe);
    System.out.println(fe.name + "�� �޿� : " + fe.getPay());

    Date expireDate = new Date();  //���� ��¥

    expireDate.setTime(expireDate.getTime() +(1000L * 60 * 60 * 24 * 365 * 2));
   //expireDate.getTime() : ����ð��� �и��ʷ� ����. 1970.1.1���� ��������� �ð��� �̸���
    
    InformalEmployee ie = new InformalEmployee ("�̺���", "����� ���α�", "������", expireDate, 1000);
    System.out.println(ie);
    System.out.println(ie.name + "�� �޿� : " +  ie.getPay());

 }

}