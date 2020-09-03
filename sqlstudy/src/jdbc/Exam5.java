package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * �л��� �̸� �Ϻθ� �Է¹޾� �ش� �л����� �й�, �̸�, Ű, ������, �г�, �ڱ��г��� �ִ�Ű, ���Ű, �ִ������, ��ո����� ����ϱ�
 */
public class Exam5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott","1234");
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��� �Ϻθ� �Է��ϼ���");
		String name=scan.next();
		String sql="select s.studno, s.name, s.height, s.weight, s.grade, a.�ִ�Ű, a.���Ű, a.�ִ������, a.��ո����� from student s, (select grade, max(height) �ִ�Ű, avg(height) ���Ű, max(weight) �ִ������, avg(weight) ��ո����� from student group by grade) a where s.grade=a.grade and s.name like '%"
				+ name +"%'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
	    ResultSet rs=pstmt.executeQuery();
	    ResultSetMetaData rsmd=rs.getMetaData();
	    for(int i=1; i<=rsmd.getColumnCount(); i++) {
	    	System.out.print(rsmd.getColumnName(i)+"\t");
	    }
	    System.out.println("\n==========================");
	    while(rs.next()) {
	    	for(int i=1; i<=rsmd.getColumnCount(); i++) {
	    		System.out.print(rs.getString(i)+"\t");
	    	}
	    	System.out.println();
	    }
	}

}
