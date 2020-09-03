package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

/*
 * PreparedStatement 사용하기 (권장)
 * => 1. Statement 의 하위 인터페이스
 *       Statement 객체는 db 서버에 sql 문장을 전달해주는 기능을 가짐 
 *    2. 미리 sql 문장을 전달하고, 실행전에 ? 라는 파라미터 값을 전달하여 실행
 */
public class jdbcEx3 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/classdb", "scott","1234");
		String sql="insert into temp1 values(?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("번호와 이름을 입력하세요(종료:9999)");
			int no = scan.nextInt();
			String text= scan.next();
			if (no==9999) break;
			pstmt.setInt(1, no);  //1 : 첫번째 ?에 int 값이 들어감
			pstmt.setString(2, text); //2: 두번째 ? 문자열이 들어감
			int result=pstmt.executeUpdate();
			System.out.println("temp1 레코드추가:"+result);
		}
		//ResultSetMetaData 사용하기
		//  ResultSet : select 구문 실행 후 결과값 저장
		//  ResultSetMetaData : 결과값의 정보를 저장하고 있는 객체
		ResultSet rs = pstmt.executeQuery("select * from temp1");
		ResultSetMetaData rsmd = rs.getMetaData();  //결과값의 정보 리턴
		//  rsmd.getColumnCount() : 조회된 컬럼의 갯수
		//  rsmd.getColumnName(i) : 조회된 i번째 컬럼의 이름(1부터 시작)
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
