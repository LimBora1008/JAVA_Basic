package com.javalab.database;

import java.sql.*;

// book테이블의 "굿스포크" 출판사의 모든 책 조회
public class Jdbc10_select {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver"; // 드라이버 로딩
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl"; // DB 연결
		String dbId = "square"; // DB 계정명
		String dbPwd = "1234"; // DB 비밀번호

		Connection con = null; // DB 연결 객체
		PreparedStatement pstmt = null; // 쿼리문에 인자를 전달해서 SQL 구문을 실행해주는 객체
		ResultSet rs = null; // 실행된 결과를 받아오는 객체

		try {
			Class.forName(driver); // 드라이버 로드
			con = DriverManager.getConnection(url, dbId, dbPwd); // 커넥션으로 DB연결
			
			// 쿼리문 생성
			String sql = "select * ";
			sql += "from book  ";
			sql += "where PUBLISHER = ?";
			
			// 쿼리문 ? 에 들어갈 값 생성
			String PUBLISHER = "굿스포크";
			
			pstmt = con.prepareStatement(sql); // 쿼리문을 준비시킨다(prepareStatement : 준비문)
			pstmt.setString(1, PUBLISHER); // 1번째 물음표에 값을 전달한다
			rs = pstmt.executeQuery(); // 쿼리문을 실행시켜 나온 값을 rs에 저장한다

			while (rs.next()) {
				System.out
						.println(rs.getInt("book_id") + "\t" + rs.getNString("book_name") + "\t" + rs.getInt("price") + "\t" + rs.getString("PUBLISHER"));
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
