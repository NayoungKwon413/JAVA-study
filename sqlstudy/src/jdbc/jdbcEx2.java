package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * select 구문 : ResultSet executeQuery(sql)
 * 그외 sql 구문 : int executeUpdate(sql)
 */
public class jdbcEx2 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott","1234");
		Statement stmt = conn.createStatement();
		String sql="create table temp1(no int, text varchar(30))";
//		//result : 레코드 변경 갯수를 리턴함
		int result = stmt.executeUpdate(sql);
		System.out.println("temp1 테이블 생성:" + result);
		sql= "insert into temp1 values(1,'홍길동')";
		result = stmt.executeUpdate(sql);
		System.out.println("temp1 레코드1 추가:"+result);
		sql = "insert into temp1 values(2, '김삿갓')";
		result = stmt.executeUpdate(sql);
		System.out.println("temp1 레코드2 추가 :"+result);
		sql="update temp1 set text='임시파일' where no=2";
		result=stmt.executeUpdate(sql);
		System.out.println("temp1 레코드2 변경:"+result);
		sql="delete from temp1";
		result=stmt.executeUpdate(sql);
		System.out.println("temp1 레코드2 삭제:"+result);
//		sql="drop table temp1";
//		result=stmt.executeUpdate(sql);
//		System.out.println("temp1 테이블 제거:"+ result);
	}
}
