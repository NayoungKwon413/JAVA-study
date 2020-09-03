package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott","1234");
		Scanner scan = new Scanner(System.in);
		String sql=null;
		while(true) {
			try {
			System.out.println("sql ������ �Է��ϼ���(����:��):");
			sql=scan.nextLine();
			if(sql.equals("��")) break;
			System.out.println();
			PreparedStatement pstmt2 = conn.prepareStatement("select count(*) from (" + sql + ") a");
			ResultSet rs2 = pstmt2.executeQuery();  //�÷��� �ϳ�, ���ڵ嵵 �ϳ� : sql�� �ش��ϴ� ���ڵ� ��
			rs2.next();  //���ڵ� ����
			int cnt= rs2.getInt(1); //rs.getInt(1) : �÷��� ���� ���������� ����
			                        //rs.getString(1) : �÷��� ���� ���ڿ������� ����
			System.out.print("��ȸ ���ڵ��:"+cnt);
		
			PreparedStatement pstmt=conn.prepareStatement(sql);
			// rs: ȭ�鿡 ����� ���ڵ� ���� 
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println(",\t ��ȸ �÷���:"+ rsmd.getColumnCount());
			
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i)+"\t");
			}
			System.out.println("\n=================================");
			while(rs.next()) {
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					System.out.print(rs.getString(i)+"\t");
				}
				System.out.println();
			}
			}catch(SQLException e) {
				System.out.println("�������� ������ �߻� �߽��ϴ�.");
				System.out.println("sql:"+ sql);
			}
		}
		System.out.println("���α׷� ����");
	}

}
