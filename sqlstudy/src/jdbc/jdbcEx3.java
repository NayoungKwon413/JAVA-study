package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

/*
 * PreparedStatement ����ϱ� (����)
 * => 1. Statement �� ���� �������̽�
 *       Statement ��ü�� db ������ sql ������ �������ִ� ����� ���� 
 *    2. �̸� sql ������ �����ϰ�, �������� ? ��� �Ķ���� ���� �����Ͽ� ����
 */
public class jdbcEx3 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott","1234");
		String sql="insert into temp1 values(?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("��ȣ�� �̸��� �Է��ϼ���(����:9999)");
			int no = scan.nextInt();
			String text= scan.next();
			if (no==9999) break;
			pstmt.setInt(1, no);  //1 : ù��° ?�� int ���� ��
			pstmt.setString(2, text); //2: �ι�° ? ���ڿ��� ��
			int result=pstmt.executeUpdate();
			System.out.println("temp1 ���ڵ��߰�:"+result);
		}
		//ResultSetMetaData ����ϱ�
		//  ResultSet : select ���� ���� �� ����� ����
		//  ResultSetMetaData : ������� ������ �����ϰ� �ִ� ��ü
		ResultSet rs = pstmt.executeQuery("select * from temp1");
		ResultSetMetaData rsmd = rs.getMetaData();  //������� ���� ����
		//  rsmd.getColumnCount() : ��ȸ�� �÷��� ����
		//  rsmd.getColumnName(i) : ��ȸ�� i��° �÷��� �̸�(1���� ����)
		for(int i=1; i<=rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
		System.out.println("\n===========================");
		while(rs.next()) {
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				//rs.getString(rsmd.getColumnName(1)) = rs.getString("no")
				//rs.getString(rsmd.getColumnName(2)) = rs.getString("text")
				System.out.print(rs.getString(rsmd.getColumnName(i))+"\t");
//				System.out.println(rs.getString(i)+"\t");
			}
			System.out.println();
		}
	}

}
