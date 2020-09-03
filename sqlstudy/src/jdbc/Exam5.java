package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 학생의 이름 일부만 입력받아 해당 학생들의 학번, 이름, 키, 몸무게, 학년, 자기학년의 최대키, 평균키, 최대몸무게, 평균몸무게 출력하기
 */
public class Exam5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott","1234");
		Scanner scan = new Scanner(System.in);
		System.out.println("이름의 일부를 입력하세요");
		String name=scan.next();
		String sql="select s.studno, s.name, s.height, s.weight, s.grade, a.최대키, a.평균키, a.최대몸무게, a.평균몸무게 from student s, (select grade, max(height) 최대키, avg(height) 평균키, max(weight) 최대몸무게, avg(weight) 평균몸무게 from student group by grade) a where s.grade=a.grade and s.name like '%"
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
