package com.javalab.database;

import java.sql.*;

// book테이블에서 "역도" 관련 책들 중에 10,000원이 넘는 책을 조회
public class Jdbc11_select_cond {

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
			String sql = "select * from book where book_name like ? and price >= ? "; // like연산자 : 문자열 포함
//			sql = "SELECT b.book_id,b.book_name,b.price,b.publisher ";
//			sql += "from book b ";
//			sql += "where b.book_name like concat('%' || ? , '%')";
//			sql += "and b.price >= ?";

			// ?에 들어갈 값 생성
			String title = "%역도%"; // String title = "역도";
			int price = 10000;

			// 쿼리문 대기
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setInt(2, price);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("book_id") + "\t" + rs.getNString("book_name") + "\t" + rs.getInt("price")
						+ "\t" + rs.getString("PUBLISHER"));
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
