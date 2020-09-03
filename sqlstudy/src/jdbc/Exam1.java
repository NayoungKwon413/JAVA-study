package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 교수 테이블을 읽어서 교수번호, 교수 이름, 학과코드, 급여, 보너스 출력하기
 */
public class Exam1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		System.out.println("Connection 객체 생성 완료");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select no, name, deptno, salary, bonus from professor");
		while(rs.next()) {
			System.out.print("교수번호:"+ rs.getString(1));
			System.out.print(", 교수이름:"+ rs.getString(2));
			System.out.print(", 학과코드:"+ rs.getString(3));
			System.out.print(", 급여:"+ rs.getString(4));
			System.out.println(", 보너스:"+ rs.getString(5));
		}
	}

}
