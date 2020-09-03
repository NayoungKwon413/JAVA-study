package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * jdbc
 * 1. java.sql ��Ű���� Ŭ����(�������̽�)��
 * 2. mariadb ����̹� �����ϱ� => driver �� path �� �����ϱ�
 *    driver �ٿ�ޱ� : mariadb.org 
 *    (Build path -> configure Build Path -> Add Jars)
 * 3. ���� ��ü ���� : Connection ��ü
 * 4. Statement ��ü ����
 *    int       executeUpdate(sql) : insert, update, delete, create, drop, ... select ������ ������ ���� ���
 *    ResultSet executeQuery(sql) : select ����
 * 5. ��� ó��
 */
public class jdbcEx1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 3.���ᰴü���� : Connection ��ü
		// ����̹� Ŭ���� �޸� �ε�
		Class.forName("org.mariadb.jdbc.Driver");
		//url : jdbc:mariadb://localhost:3306/classdb
		//��Ʈ��ȣ:3306 , �����ͺ��̽� �̸�:classdb
		//DB user name:scott, DB password : 1234
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		System.out.println("Connection ��ü ���� �Ϸ�");
		//4. Statement ��ü ���� : sql ��� ���� ��ü
		Statement stmt = conn.createStatement();
		//ResultSet : select ������ ��� ���� ��ü
		ResultSet rs = stmt.executeQuery("select * from student order by studno");
		while(rs.next()) {
			System.out.print("�й�:" + rs.getString("studno"));
			System.out.print(", �̸�:" + rs.getString("name"));
			System.out.print(", �г�:" + rs.getString("grade"));
			System.out.println(", �����а�1:" + rs.getString("major1"));
		}
	}
}
