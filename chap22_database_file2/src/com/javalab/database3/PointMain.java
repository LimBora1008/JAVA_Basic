package com.javalab.database3;

import java.sql.*;

public class PointMain {
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

	public static void main(String[] args) {
		// 1. 디비 접속 메소드 호출
		connectDB();

		// 2. point테이블 생성
		createPoint();

		// 3. 시퀀스 생성
		createSequence();

		// 4. 시퀀스를 이용한 insert
		String user_id = "somi";
		insertPoint(user_id);
		user_id = "sang12";
		insertPoint(user_id);
		user_id = "light";
		insertPoint(user_id);

		// 5. member테이블의 회원들에게 모두 10포인트 부여
		updatePointMember();
		
		// 6. 회원들과 보유 포인트를 조회하세요.
		selectMember();
		
		// 7. 이소미 회원에게 추가  포인트 15점
		int points = 15;
		String user_name = "이소미";
		updatePointMember(points,user_name);
		
		// 8. 관리자에게 추가  포인트 30점
		points = 30;
		int adminNum = 1;
		updatePointMember(points,adminNum);
		
		// 9.모든 회원들의 평균 포인트보다 작은 회원을 조회
		selectMinAvgMember();

		// 자원반납
		closeResource();
	} // end main
	
	// 9.모든 회원들의 평균 포인트보다 작은 회원을 조회
	private static void selectMinAvgMember() {
		try {
			String sql = "select m.user_id,m.name,m.pwd,m.email,m.phone,p.points,";
			sql += " (case m.admin";
			sql += " when 0 then '일반사용자'";
			sql += " else '관리자'";
			sql += " end) as admin";
			sql += " from member m , point p";
			sql += " where m.user_id = p.user_id";
			sql += " and p.points < (select avg(p.points) from point p)";
			
			pstmt = con.prepareStatement(sql);
			System.out.println("selectMinAvgMember 객체 생성 성공");
			
			rs = pstmt.executeQuery();
			System.out.println();
			
			while (rs.next()) {
				System.out.print(rs.getString("user_id")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getInt("pwd")+"\t");
				System.out.print(rs.getString("email")+"\t");
				System.out.print(rs.getString("phone")+"\t");
				System.out.print(rs.getInt("points")+"\t");
				System.out.print(rs.getString("admin")+"\n");
			}
			System.out.println();
			
		}  catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end selectMinAvgMember

	// 회원들과 보유 포인트를 조회하세요.
	private static void selectMember() {
		try {
			String sql = "select m.user_id , m.name , m.pwd , m.email , m.phone , p.point_id , p.points , to_char(p.reg_date,'yy-mm-dd') as reg_date,";
			sql += " (case m.admin";
			sql += " when 0 then '일반사용자'";
			sql += " else '관리자'";
			sql += " end) as admin";
			sql += " from member m , point p";
			sql += " where m.user_id = p.user_id";
			
			pstmt = con.prepareStatement(sql);
			System.out.println("selectMember 객체 생성 성공");
			
			rs = pstmt.executeQuery();
			System.out.println();
			
			while (rs.next()) {
				System.out.print(rs.getString("user_id")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getInt("pwd")+"\t");
				System.out.print(rs.getString("email")+"\t");
				System.out.print(rs.getString("phone")+"\t");
				System.out.print(rs.getInt("point_id")+"\t");
				System.out.print(rs.getInt("points")+"\t");
				System.out.print(rs.getString("reg_date")+"\t");
				System.out.print(rs.getString("admin")+"\n");
			}
			System.out.println();
			
		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end selectMember
	
	// 어드민에게 추가 포인트
	private static void updatePointMember(int points,int adminNum) {
		try {
			String sql = "update point set points = points+? where user_id in";
			sql += " (select user_id from member where admin = ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, points);
			pstmt.setInt(2, adminNum);
			System.out.println("updatePointMember 객체 생성 성공");

			rs = pstmt.executeQuery();
			System.out.println();

		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end updatePointMember
	
	// 이소미에게 추가 포인트
	private static void updatePointMember(int points,String user_name) {
		try {
			String sql = "update point SET point.points = points+? WHERE user_id = (SELECT user_id FROM member WHERE name = ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, points);
			pstmt.setString(2, user_name);
			System.out.println("updatePointMember 객체 생성 성공");

			rs = pstmt.executeQuery();
			System.out.println();

		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end updatePointMember
	
	// member테이블의 회원들에게 모두 10포인트 부여
	private static void updatePointMember() {
		try {
			String sql = "UPDATE point SET point.points = 10";

			pstmt = con.prepareStatement(sql);
			System.out.println("updatePointMember 객체 생성 성공");

			rs = pstmt.executeQuery();
			System.out.println();

		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end updatePointMember

	// 시퀀스를 이용한 insert
	private static void insertPoint(String user_id) {
		try {
			String sql = "insert into point(point_id,user_id)";
			sql += "values (SEQ_POINT.nextval,?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user_id);
			System.out.println("insertPoint 객체 생성 성공");

			rs = pstmt.executeQuery();
			System.out.println();
		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end insertPoint

	// 시퀀스 생성
	private static void createSequence() {
		try {
			String sql = "CREATE SEQUENCE seq_point";
			sql += " increment by 1";
			sql += " START WITH 1";
			sql += " maxvalue 3";
			sql += " minvalue 0";
			sql += " nocycle";
			sql += " cache 2";

			// pstmt 객체 얻기
			pstmt = con.prepareStatement(sql);
			System.out.println("createSequence 객체 생성 성공");

			// 쿼리 실행
			rs = pstmt.executeQuery();
			System.out.println();

		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end createSequence

	// point테이블 생성 메소드
	private static void createPoint() {
		try {
			// 쿼리문 생성
			String sql = "create table point (";
			sql += " point_id number(10),";
			sql += " user_id varchar2(10),";
			sql += " points number(10) default 0,";
			sql += " reg_date date default to_date(sysdate,'yy-mm-dd'),";
			sql += " constraint pk_point primary key(point_id),";
			sql += " constraint fk_user_id foreign key(user_id) references member(user_id)";
			sql += " )";

			// pstmt 객체 얻음
			pstmt = con.prepareStatement(sql);
			System.out.println("createPoint 객체 생성 성공");

			// 쿼리 살행
			rs = pstmt.executeQuery();
			System.out.println();

		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end createPoint

	// 드라이버 로딩 커넥션 객체 생성 메소드
	private static void connectDB() {
		try {
			// 1. 드라이버 로딩
			Class.forName(DRIVER_NAME);

			// 2. 데이터베이스 커넥션(연결)
			con = DriverManager.getConnection(DB_URL, oracleId, oraclePwd);
			System.out.println("커넥션 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 err : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("sql err : " + e.getMessage());
		}
	} // end connectDB

	// 자원반납 메소드
	private static void closeResource() {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			System.out.println("자원해제 ERR! : " + e.getMessage());
		}
	} // end closeResource

	// 자원반납 메소드
	private static void closeResource(PreparedStatement pstmt, ResultSet rs) {
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
	} // end closeResource

} // end class
