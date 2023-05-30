package com.javalab.database5;

import java.sql.*;

public class SmsMain {
	// 멤버변수 선언
	public static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver"; // 오라클 드라이버
	public static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl"; // 오라클 접속경로

	public static Connection con = null; // DB접속 객체
	public static PreparedStatement pstmt = null; // 쿼리실행 객체
	public static ResultSet rs = null; // 쿼리결과 저장 객체

	public static String oracleId = "sms"; // 오라클 계정 아이디
	public static String oraclePwd = "1234"; // 오라클 계정 비밀번호

	public static void main(String[] args) {
		
		// DB 접속 메소드 호출
		connectDB();

		// 1. 학과목록 조회
		getDeptList();

		// 2. 학생목록 조회
		getStudentList();

		// 3. 교수목록 조회
		getProfessorList();

		// 4. 강좌목록 조회
		getCourseList();

		// 5. 수강목록 조회
		getEnrollmentList();

		// 6. 김광식 학생이 수강한 강좌를 조회하세요.(강좌명, 학과명 포함)
		String name = "김광식";
		SelectCouAndStuList(name);

		// 7. 자료구조 강좌를 수강한 모든 학생을 조회하세요.(강좌명, 학생명, 학년, 성적 컬럼 포함)
		String couName = "자료구조";
		SelectCouAllList(couName);

		// 자원반납
		closeResource();

	} // end main

	private static void SelectCouAllList(String couName) {
		try {
			String sql = "SELECT c.course_name , s.stu_id , s.stu_name , s.grade||'학년' , e.score";
			sql += " FROM tbl_course C , TBL_STUDENT S , tbl_enrollment E";
			sql += " WHERE c.course_id = e.course_id";
			sql += " AND e.stu_id = s.stu_id";
			sql += " AND c.course_name = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, couName);
			System.out.println("SelectCouAllList 객체 생성 성공");

			rs = pstmt.executeQuery();

			System.out.println(couName + " 를(을) 신청한 학생");
			while (rs.next()) {
				System.out.println(
						rs.getString("course_name") + "\t" 
						+ rs.getInt("stu_id") + "\t" 
						+ rs.getString("stu_name") + "\t" 
						+ rs.getString("s.grade||'학년'") + "\t" 
						+ rs.getString("score")
						);
			}

			System.out.println();
		} catch (SQLException e) {
			System.out.println("SQL 오류" + e.getMessage());
		} finally {
			// 자원반납 메소드 호출
			closeResource(pstmt, rs);
		}
	}

	// 6. 김광식 학생이 수강한 강좌를 조회하세요.(강좌명, 학과명 포함)
	private static void SelectCouAndStuList(String name) {
		try {
			String sql = "SELECT e.enrollment_id , e.course_id , c.course_name , e.stu_id , s.stu_name , d.dept_name";
			sql += " FROM tbl_enrollment E , tbl_course C , tbl_student S , tbl_dept D";
			sql += " WHERE e.course_id = c.course_id";
			sql += " AND e.stu_id = s.stu_id";
			sql += " AND s.dept_id = d.dept_id";
			sql += " AND s.stu_name = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			System.out.println("SelectCouAndStuList 객체 생성 성공");

			rs = pstmt.executeQuery();

			System.out.println(name + " 학생이 수강한 강좌");
			while (rs.next()) {
				System.out.println(
						rs.getInt("enrollment_id") + "\t" 
						+ rs.getInt("course_id") + "\t"
						+ rs.getString("course_name") + "\t" 
						+ rs.getInt("stu_id") + "\t" 
						+ rs.getString("stu_name")+ "\t" 
						+ rs.getString("dept_name")
						);
			}

			System.out.println();
		} catch (SQLException e) {
			System.out.println("SQL 오류" + e.getMessage());
		} finally {
			// 자원반납 메소드 호출
			closeResource(pstmt, rs);
		}
	}

	// 5. 수강목록 조회
	private static void getEnrollmentList() {
		try {
			String sql = "SELECT e.enrollment_id , e.stu_id , s.stu_name , e.course_id , c.course_name , e.professor_id , p.professor_name , e.score ,to_char(e.enrollment_date,'YY/MM/DD')AS enrollment_date , r.room_name";
			sql += " FROM tbl_enrollment E , TBL_STUDENT S , tbl_course C , TBL_PROFESSOR P , tbl_classroom R";
			sql += " WHERE E.STU_ID = s.stu_id";
			sql += " AND e.course_id = c.course_id";
			sql += " AND e.professor_id = p.professor_id";
			sql += " AND c.room_id = r.room_id";

			pstmt = con.prepareStatement(sql);
			System.out.println("getEnrollmentList 객체 생성 성공");

			rs = pstmt.executeQuery();

			System.out.println("5. 수강목록 조회");
			while (rs.next()) {
				System.out.println(
						rs.getInt("enrollment_id") + "\t" 
						+ rs.getInt("stu_id") + "\t"
						+ rs.getString("stu_name") + "\t" 
						+ rs.getInt("course_id") + "\t" 
						+ rs.getString("course_name")+ "\t" 
						+ rs.getInt("professor_id") + "\t" 
						+ rs.getString("professor_name") + "\t"
						+ rs.getString("score") + "\t" 
						+ rs.getString("enrollment_date") + "\t"
						+ rs.getString("room_name")
						);
			}

			System.out.println();
		} catch (SQLException e) {
			System.out.println("SQL 오류" + e.getMessage());
		} finally {
			// 자원반납 메소드 호출
			closeResource(pstmt, rs);
		}
	}

	// 4. 강좌목록 조회
	private static void getCourseList() {
		try {
			String sql = "SELECT c.course_id , c.course_name , c.professor_id , p.professor_name , TO_CHAR(c.c_date,'YYYY/MM/DD')AS C_DATE , c.room_id , r.room_name";
			sql += " FROM tbl_course C , tbl_professor P , tbl_classroom R";
			sql += " WHERE c.professor_id = p.professor_id";
			sql += " AND c.room_id = r.room_id";

			pstmt = con.prepareStatement(sql);
			System.out.println("getCourseList 객체 생성 성공");

			rs = pstmt.executeQuery();

			System.out.println("4. 강좌목록 조회");
			while (rs.next()) {
				System.out.println(
						rs.getInt("course_id") + "\t" 
						+ rs.getString("course_name") + "\t"
						+ rs.getInt("professor_id") + "\t" 
						+ rs.getString("professor_name") + "\t"
						+ rs.getString("C_DATE") + "\t" 
						+ rs.getInt("room_id") + "\t" 
						+ rs.getString("room_name")
						);
			}

			System.out.println();
		} catch (SQLException e) {
			System.out.println("SQL 오류" + e.getMessage());
		} finally {
			// 자원반납 메소드 호출
			closeResource(pstmt, rs);
		}
	}

	// 3. 교수목록 조회
	private static void getProfessorList() {
		try {
			String sql = "SELECT p.professor_id , p.professor_name , p.resident_id , p.dept_id , d.dept_name , TO_CHAR( p.hiredate,'YYYY/MM/DD')AS hiredate";
			sql += " FROM tbl_professor P , tbl_dept D";
			sql += " WHERE p.dept_id = d.dept_id";

			pstmt = con.prepareStatement(sql);
			System.out.println("getProfessorList 객체 생성 성공");

			rs = pstmt.executeQuery();

			System.out.println("3. 교수목록 조회");
			while (rs.next()) {
				System.out.println(
						rs.getInt("professor_id") + "\t" 
						+ rs.getString("professor_name") + "\t"
						+ rs.getString("resident_id") + "\t" 
						+ rs.getInt("dept_id") + "\t" 
						+ rs.getString("dept_name")+ "\t" 
						+ rs.getString("hiredate")
						);
			}

			System.out.println();
		} catch (SQLException e) {
			System.out.println("SQL 오류" + e.getMessage());
		} finally {
			// 자원반납 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end getProfessorList

	// 2. 학생목록 조회
	private static void getStudentList() {
		try {
			String sql = "SELECT s.stu_id , s.stu_name , s.resident_id , s.gender , s.address , s.grade , s.dept_id ,d.dept_name";
			sql += " FROM tbl_student s , tbl_dept d";
			sql += " where s.dept_id = d.dept_id";

			pstmt = con.prepareStatement(sql);
			System.out.println("getStudentList 객체 생성 성공");

			rs = pstmt.executeQuery();

			System.out.println("2. 학생목록 조회");
			while (rs.next()) {
				System.out.println(
						rs.getInt("stu_id") + "\t" 
						+ rs.getString("stu_name") + "\t"
						+ rs.getString("resident_id") + "\t" 
						+ rs.getString("gender") + "\t" 
						+ rs.getString("address")
						+ "\t" + rs.getInt("grade") + "\t" 
						+ rs.getInt("dept_id") + "\t" 
						+ rs.getString("dept_name")
						);
			}

			System.out.println();
		} catch (SQLException e) {
			System.out.println("SQL 오류" + e.getMessage());
		} finally {
			// 자원반납 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end getStudentList

	// 1. 학과목록 조회
	private static void getDeptList() {
		try {
			String sql = "SELECT d.dept_id,d.dept_name FROM tbl_dept d";

			pstmt = con.prepareStatement(sql);
			System.out.println("getDeptList 객체 생성 성공");

			rs = pstmt.executeQuery();

			System.out.println("1. 학과목록 조회");
			while (rs.next()) {
				System.out.println(
						rs.getInt("dept_id") + "\t" 
						+ rs.getString("dept_name")
						);
			}

			System.out.println();
		} catch (SQLException e) {
			System.out.println("SQL 오류" + e.getMessage());
		} finally {
			// 자원반납 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end getDeptList

	// DB 접속 메소드 호출
	private static void connectDB() {
		try {
			Class.forName(DRIVER_NAME); // 드라이버 로딩
			con = DriverManager.getConnection(DB_URL, oracleId, oraclePwd); // 커넥션 연결

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류 : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		}
	} // end connectDB

	// 자원반납 메소드
	private static void closeResource(PreparedStatement pstmt, ResultSet rs) {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			System.out.println("자원해제 ERR! : " + e.getMessage());
		}
	} // end closeResource

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
} // end class
