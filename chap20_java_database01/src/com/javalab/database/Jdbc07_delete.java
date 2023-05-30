package com.javalab.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// PreparedStatement 통한 삭제
public class Jdbc07_delete {

	public static void main(String[] args) {

		// 오라클 드라이버 로딩 문자열
		String driver = "oracle.jdbc.driver.OracleDriver";
		// 데이터베이스 연결 문자열
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		// 데이터베이스 계정명
		String dbId = "square";
		// 데이터베이스 비밀번호
		String dbPwd = "1234";

		Connection con = null;
		// PreparedStatement 객체 변수 pstmt를 선언
		PreparedStatement pstmt = null;
		// select의 결과 객체 저장
		ResultSet rs = null;

		try {
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");

			con = DriverManager.getConnection(url, dbId, dbPwd);
			System.out.println("데이터베이스 연결 성공");

			// delete
			int result = 0;
			int bookId = 14;
			String query = "delete from book where book_id = ?";

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, bookId);
			result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
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
					pstmt.close(); // PreparedStatement 객체를 메모리에서 닫는다
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
