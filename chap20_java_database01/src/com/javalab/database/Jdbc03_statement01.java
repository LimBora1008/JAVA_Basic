package com.javalab.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc03_statement01 {

	public static void main(String[] args) {
		// 오라클 드라이버 로딩 문자열
		String driver = "oracle.jdbc.driver.OracleDriver";
		// 데이터베이스 연결 문자열
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		// 데이터베이스 계정명
		String dbId = "square";
		// 데이터베이스 비밀번호
		String dbPwd = "1234";

		// 데이터베이스 연결 객체
		Connection con = null;
		// 커넥션 객체를 통해 쿼리를 실행해주는 객체
		Statement stmt = null;
		// 쿼리문의 결과를 반환받는 객체
		ResultSet rs = null;

		try {
			// 1. 드라이버 로딩
			Class.forName(driver);

			// 2. 커넥션 연결
			con = DriverManager.getConnection(url, dbId, dbPwd);

			// 3. Statement 객체 생성
			stmt = con.createStatement();

			// 4. Statement 객체를 통해 SQL쿼리문장 만들기
			String sql = "select * from orders";

			// 5. SQL쿼리문장을 이용하여 쿼리 실행
			rs = stmt.executeQuery(sql);

			// 반복문을 이용한 쿼리 실행
			while (rs.next()) {
				System.out.println(rs.getInt("ORDER_ID") + "\t" + rs.getInt("CUST_ID") + "\t"+ rs.getInt("BOOK_ID") + "\t" + rs.getInt("SALEPRICE") + "\t" + rs.getDate("ORDER_DATE"));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 ERR! :" + e.getMessage());

		} catch (SQLException e) {
			System.out.println("SQL ERR! :" + e.getMessage());

		} finally {
			try {
				// 자원 해제
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e2) {
				System.out.println("자원 해제 ERR! :" + e2.getMessage());
			}
		}
	}

}
