package com.javalab.database3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * [static 전역변수]
 * JDBC 프로그래밍을 위한 요소들을 모두 멤버변수 즉, 필드 위치로 뽑아올림.
 *  - 본 클래스 어디서라도 사용가능한 전역변수가 됨.
 *  
 * [모듈화]
 *	- 데이터베이스 커넥션 + PreparedStatement + 쿼리실행 작업 모듈
 *	- 실제로 쿼리를 실행하고 결과를 받아오는 부분 모듈
 *
 * [미션]
 * 	- 전체 상품의 정보를 조회하세요(카테고리명이 나오도록)
 */

public class Database05_Main {
	// [멤버 변수]
	// 1. oracle 드라이버 이름 문자열 상수
	public static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	// 2. oracle 데이터베이스 접속 경로(url) 문자열 상수
	public static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";

	// 3. 데이터베이스 접속 객체
	public static Connection con = null;
	// 4. query 실행 객체
	public static PreparedStatement pstmt = null;
	// 5. selcet 결과 저장 객체
	public static ResultSet rs = null;

	// 6. oracle 계정(id/pwd)
	public static String oracleId = "tempdb";
	// 7. oracle Password
	public static String oraclePwd = "1234";

	/* main 메소드가 간결해짐 */
	public static void main(String[] args) {

		// 1. 디비 접속 메소드 호출
		connectDB();

		// 2. 전 상품의 카테고리명,상품명,가격,입고일자를 출력하는 메소드
		selectAllProduct();

		// 3. 카테고리가 전자제품인 상품명,가격,입고일자를 출력하는 메소드
		String categoryName = "전자제품";
		selectProductByCategory(categoryName);

		// 4. 가격이 25000원 이상인 상품들의 이름과 가격을 조회하는 메소드
		selectProductGetherThan();

		// 5. 카테고리별로 카테고리명과 가격의 합계금액을 조회하되 금액이 큰 순서로
		selectProductGroupByCategory();

		// 6. 상품추가 :: 카테고리 : 식료품 / 상품id:기존 번호+1 / 상품명 : 양배추 / 가격 : 2000 / 입고일 :
		// 2022/07/10
		insertProduct();

		// 7. 상품 가격 변동(수정) 탱크로리 상품의 가격을 600000 으로 수정
		updateProduct();

		// 8. 자원반납
		closeResource();
	} // end main

	// 드라이버 로딩 커넥션 객체 생성 메소드
	private static void connectDB() {
		try {
			// 1. 드라이버 로딩
			Class.forName(DRIVER_NAME);
			System.out.println("1. 드라이버 로드 성공!");

			// 2. 데이터베이스 커넥션(연결)
			con = DriverManager.getConnection(DB_URL, oracleId, oraclePwd);
			System.out.println("2. 커넥션 객체 생성 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 ERR! : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		}
	} // end connectDB

	// 2. 전 상품의 카테고리명,상품명,가격,입고일자를 출력하는 메소드
	private static void selectAllProduct() {
		try {
			// 3. 쿼리문
			String sql = "select c.category_id, c.category_name, p.product_id, p.product_name,";
			sql += " p.price, to_char(receipt_date, 'yyyy-mm-dd') as receipt_date";
			sql += " from category c left outer join product p on c.category_id = p.category_id";
			sql += " order by c.category_id, p.product_id desc";

			// 4. prepareStatement 객체 얻음
			// 커넥션 객체를 통해서 데이터베이스에 쿼리(SQL)를 실행해주는
			pstmt = con.prepareStatement(sql);
			System.out.println("3. stmt 객체 생성 성공 : ");

			// 5. 쿼리 실행
			// - 조회된 결과가 ResultSet 객체에 담겨옴
			rs = pstmt.executeQuery();
			System.out.println();

			// 6. rs.next()의 의미 설명
			while (rs.next()) {
				System.out.println(rs.getString("category_id") + "\t" + rs.getString("category_name") + "\t"
						+ rs.getString("product_id") + "\t" + rs.getString("product_name") + "\t"
						+ rs.getString("price") + "\t" + rs.getString("receipt_date"));

			}

			System.out.println();
		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());

		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}

	} // end selectProduct

	// 3. 카테고리가 전자제품인 상품명,가격,입고일자를 출력하는 메소드
	private static void selectProductByCategory(String categoryName) {
		try {
			// 3. 쿼리문
			String sql = "select p.product_id , p.product_name , p.price ,to_char(p.receipt_date,'yyyy-mm-dd'), c.category_id , c.category_name ";
			sql += " from category c LEFT OUTER join product p on c.category_id = p.category_id";
			sql += " WHERE c.category_name = ?";
			sql += " order by p.price desc";

			// 4. prepareStatement 객체 얻음
			// 커넥션 객체를 통해서 데이터베이스에 쿼리(SQL)를 실행해주는
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, categoryName);
			System.out.println("3. stmt 객체 생성 성공 : ");

			// 5. 쿼리 실행
			// - 조회된 결과가 ResultSet 객체에 담겨옴
			rs = pstmt.executeQuery();
			System.out.println();

			// 6. rs.next()의 의미 설명
			while (rs.next()) {
				System.out.println(rs.getInt("product_id") + "\t" + rs.getString("product_name") + "\t"
						+ rs.getInt("price") + "\t" + rs.getDate("to_char(p.receipt_date,'yyyy-mm-dd')") + "\t"
						+ rs.getInt("category_id") + "\t" + rs.getString("category_name"));
			}
			System.out.println();

		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		}finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}

	} // end selectProductByCategory

	// 4. 가격이 25000원 이상인 상품들의 이름과 가격을 조회하는 메소드
	private static void selectProductGetherThan() {
		try {
			// 3. 쿼리문
			String sql = "select p.product_name , p.price";
			sql += " from product p";
			sql += " where p.price >= ?";
			sql += " order by p.price desc";
			int whereprice = 25000;

			// 4. prepareStatement 객체 얻음
			// 커넥션 객체를 통해서 데이터베이스에 쿼리(SQL)를 실행해주는
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, whereprice);
			System.out.println("3. stmt 객체 생성 성공 : ");

			// 5. 쿼리 실행
			// - 조회된 결과가 ResultSet 객체에 담겨옴
			rs = pstmt.executeQuery();
			System.out.println();

			// 6. rs.next()의 의미 설명
			System.out.println("가격이 25,000원 이상인 상품들의 이름과 가격 조회");
			while (rs.next()) {
				System.out.print(rs.getString("product_name") + "\t");
				System.out.print(rs.getInt("price") + "\n");
			}
			System.out.println();

		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		}finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}

	} // end selectProductGetherThan

	// 5. 카테고리별로 카테고리명과 가격의 합계금액을 조회하되 금액이 큰 순서로
	private static void selectProductGroupByCategory() {
		try {
			// 3. 쿼리문
			String sql = "select c.category_id,c.category_name , sum(p.price)";
			sql += " from category c , product p";
			sql += " where c.category_id = p.category_id";
			sql += " group by c.category_id,c.category_name";
			sql += " order by sum(p.price) desc";

			// 4. prepareStatement 객체 얻음
			// 커넥션 객체를 통해서 데이터베이스에 쿼리(SQL)를 실행해주는
			pstmt = con.prepareStatement(sql);
			System.out.println("3. stmt 객체 생성 성공 : ");

			// 5. 쿼리 실행
			// - 조회된 결과가 ResultSet 객체에 담겨옴
			rs = pstmt.executeQuery();
			System.out.println();

			// 6. rs.next()의 의미 설명
			while (rs.next()) {
				System.out.print(rs.getInt("category_id") + "\t");
				System.out.print(rs.getString("category_name") + "\t");
				System.out.print(rs.getInt("sum(p.price)") + "\n");
			}
			System.out.println();

		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		}finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}

	}// end selectProductGroupByCategory

	// 6. 상품추가 :: 카테고리 : 식료품 / 상품id:기존 번호+1 / 상품명 : 양배추 / 가격 : 2000 / 입고일 :
	// 2022/07/10
	private static void insertProduct() {
		try {
			// 쿼리문
			String sql = "insert into product(product_id,product_name,price,category_id,receipt_date) VALUES(?,?,?,?,?)";
			int id = 22;
			String name = "양배추";
			int price = 2000;
			int category_id = 5;
			String date = "2022/07/10";

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

		} catch (SQLException e) {
			System.out.println("SQL ERR! :" + e.getMessage());
		}finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end insertProduct

	// 7. 상품 가격 변동(수정) 탱크로리 상품의 가격을 600000 으로 수정
	private static void updateProduct() {
		try {
			// 3. PreparedStatement 객체를 통해서 쿼리하기 위한 SQL 쿼리 문장 만들기(삽입,수정,삭제,조회)
			String sql = "update product set price = ? where product_name = ?";

			int price = 600000;
			String name = "탱크로리";

			// 4. 커넥션 객체를 통해서 데이터베이스에 쿼리(SQL)를 실행해주는 PreparedStatement 객체 얻음
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, price);
			pstmt.setString(2, name);
			System.out.println("3. stmt 객체 생성 성공 ");

			// 5. PreparedStatement 객체의 executeQuery() 메소드를 통해서 쿼리 실행 , 데이터 베이스에서 조회된 결과가
			// ResultSet 객체에 담겨옴
			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("저장 성공 ");
			} else {
				System.out.println("저장 실패");
			}
		} catch (SQLException e) {
			System.out.println("SQL ERR! :" + e.getMessage());
		}finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}

	}

	// 자원반납 메소드
	private static void closeResource() {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			System.out.println("자원해제 ERR! : " + e.getMessage());
		}
	}
	
	// 자원반납 메소드
	private static void closeResource(PreparedStatement pstmt , ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			System.out.println("자원해제 ERR! : " + e.getMessage());
		}
	}
}