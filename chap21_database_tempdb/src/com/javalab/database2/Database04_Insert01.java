package com.javalab.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database04_Insert01 {

	public static void main(String[] args) {
		// 오라클 드라이버 로딩 문자열
		String driver = "oracle.jdbc.driver.OracleDriver";
		// 데이터베이스 연결 문자열
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		// 데이터베이스명(계정명)
		String dbId = "tempdb";
		// 데이터베이스 비밀번호
		String dbPwd = "1234";

		// 데이터베이스 연결 객체
		Connection con = null;
		// 커넥션 객체를 통해 데이터베이스에 쿼리(SQL)를 실행해주는 객체
		PreparedStatement pstmt = null;
		// 실행된 쿼리문의 결과를 반환 받는 객체
		ResultSet rs = null;

		try {
			// 1. 드라이버 로딩
			Class.forName(driver);
			System.out.println("1. 드라이버 로딩 성공");

			// 2. 데이터베이스 커넥션(연결)
			con = DriverManager.getConnection(url, dbId, dbPwd);
			System.out.println("2. 데이터베이스 연결 성공");

			// 3. PreparedStatement 객체를 통해서 쿼리하기 위한 SQL 쿼리 문장 만들기(삽입,수정,삭제,조회)
			String sql = "insert into product(product_id,product_name,price,category_id,receipt_date) VALUES(?,?,?,?,?)";

			int id = 21;
			String name = "시금치";
			int price = 3500;
			int category_id = 5;
			String date = "2023/02/10";

			// 4. 커넥션 객체를 통해서 데이터베이스에 쿼리(SQL)를 실행해주는 PreparedStatement 객체 얻음
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, price);
			pstmt.setInt(4, category_id);
			pstmt.setString(5, date);
			System.out.println("3. stmt 객체 생성 성공 ");

			// 5. PreparedStatement 객체의 executeQuery() 메소드를 통해서 쿼리 실행 , 데이터 베이스에서 조회된 결과가
			// ResultSet 객체에 담겨옴
			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("저장 성공 ");
			} else {
				System.out.println("저장 실패");
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
				if (pstmt != null) {
					pstmt.close();
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
