package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
 * �̸� temp1 ���̺� �����ϱ�
 * ȭ�鿡�� ���ڿ� ���ڸ� �Է¹޾Ƽ� temp1 ���̺� �߰��ϱ�(����:no=9999)
 */
public class Exam2 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott","1234");
		Statement stmt = conn.createStatement();
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("��ȣ�� �̸��� �Է��ϼ���(����:9999)");
			int no = scan.nextInt();
			String name= scan.next();
			if (no==9999) break;
			String sql="insert into temp1 values("+no+",'"+name+"')";
			int result=stmt.executeUpdate(sql);
			System.out.println("temp1 ���ڵ��߰�:"+result);
		}
		ResultSet rs = stmt.executeQuery("select * from temp1");
		while(rs.next()) {
			System.out.print("no:"+rs.getString("no"));
			System.out.println(", text:"+rs.getString("text"));

		}
	}

}
