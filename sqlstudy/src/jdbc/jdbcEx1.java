package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * jdbc
 * 1. java.sql 패키지의 클래스(인터페이스)들
 * 2. mariadb 드라이버 선택하기 => driver 를 path 에 설정하기
 *    driver 다운받기 : mariadb.org 
 *    (Build path -> configure Build Path -> Add Jars)
 * 3. 연결 객체 생성 : Connection 객체
 * 4. Statement 객체 생성
 *    int       executeUpdate(sql) : insert, update, delete, create, drop, ... select 구문을 제외한 구문 사용
 *    ResultSet executeQuery(sql) : select 구문
 * 5. 결과 처리
 */
public class jdbcEx1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 3.연결객체생성 : Connection 객체
		// 드라이버 클래스 메모리 로드
		Class.forName("org.mariadb.jdbc.Driver");
		//url : jdbc:mariadb://localhost:3306/classdb
		//포트번호:3306 , 데이터베이스 이름:classdb
		//DB user name:scott, DB password : 1234
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		System.out.println("Connection 객체 생성 완료");
		//4. Statement 객체 생성 : sql 명령 전달 객체
		Statement stmt = conn.createStatement();
		//ResultSet : select 구문의 결과 저장 객체
		ResultSet rs = stmt.executeQuery("select * from student order by studno");
		while(rs.next()) {
			System.out.print("학번:" + rs.getString("studno"));
			System.out.print(", 이름:" + rs.getString("name"));
			System.out.print(", 학년:" + rs.getString("grade"));
			System.out.println(", 전공학과1:" + rs.getString("major1"));
		}
	}
}
