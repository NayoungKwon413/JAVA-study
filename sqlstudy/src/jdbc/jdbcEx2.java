package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * select ���� : ResultSet executeQuery(sql)
 * �׿� sql ���� : int executeUpdate(sql)
 */
public class jdbcEx2 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott","1234");
		Statement stmt = conn.createStatement();
		String sql="create table temp1(no int, text varchar(30))";
//		//result : ���ڵ� ���� ������ ������
		int result = stmt.executeUpdate(sql);
		System.out.println("temp1 ���̺� ����:" + result);
		sql= "insert into temp1 values(1,'ȫ�浿')";
		result = stmt.executeUpdate(sql);
		System.out.println("temp1 ���ڵ�1 �߰�:"+result);
		sql = "insert into temp1 values(2, '���')";
		result = stmt.executeUpdate(sql);
		System.out.println("temp1 ���ڵ�2 �߰� :"+result);
		sql="update temp1 set text='�ӽ�����' where no=2";
		result=stmt.executeUpdate(sql);
		System.out.println("temp1 ���ڵ�2 ����:"+result);
		sql="delete from temp1";
		result=stmt.executeUpdate(sql);
		System.out.println("temp1 ���ڵ�2 ����:"+result);
//		sql="drop table temp1";
//		result=stmt.executeUpdate(sql);
//		System.out.println("temp1 ���̺� ����:"+ result);
	}
}
