package com.javalab.database;

import java.sql.*;

// 주문 테이블과 도서 테이블을 조인해서 주문정보 + 도서정보 조회
public class Jdbc12_select_join01 {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver"; // 드라이버 로딩
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl"; // DB 연결
		String dbId = "square"; // DB 계정명
		String dbPwd = "1234"; // DB 비밀번호

		Connection con = null; // DB 연결 객체
		PreparedStatement pstmt = null; // 쿼리문에 인자를 전달해서 SQL 구문을 실행해주는 객체
		ResultSet rs = null; // 실행된 결과를 받아오는 객체

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, dbId, dbPwd);

			// 쿼리문 생성
			String sql = "select o.order_id , o.cust_id , o.book_id , b.book_name , o.order_date , b.publisher , b.price ";
			sql += "from book b , orders o ";
			sql += "where b.book_id = o.book_id";

			// ?에 들어갈 값 생성

			// 쿼리문 대기
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);

			while (rs.next()) {
				System.out.print(rs.getInt("order_id")+"\t");
				System.out.print(rs.getInt("cust_id")+"\t");
				System.out.print(rs.getInt("book_id")+"\t");
				System.out.print(rs.getString("book_name")+"\t");
				System.out.print(rs.getDate("order_date")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.print(rs.getInt("price")+"\n");
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
