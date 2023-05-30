package com.javalab.database4;

import java.sql.*;

public class BoardMain {
	// 멤버변수 선언
	public static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";		// 오라클 드라이버
	public static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";	// 오라클 접속경로
	
	public static Connection con = null;			// DB접속 객체
	public static PreparedStatement pstmt = null;	// 쿼리실행 객체
	public static ResultSet rs = null;				// 쿼리결과 저장 객체
	
	public static String oracleId = "board";		// 오라클 계정 아이디
	public static String oraclePwd = "1234";		// 오라클 계정 비밀번호
	
	// main
	public static void main(String[] args) {
		// 1. DB 접속 메소드 호출
		connectDB();
		
		// 2. 게시물 목록 조회
		getBoardList();
		
		// 3. 새글 등록 
		// 새글 등록이 완료되었으면 주석처리 한후에 답글등록으로 이동
//		insertNewBoard();
		
		// 4. 답글등록
		// 어떤 게시물에 답글을 달지 부모 게시글의 정보를 전달해야 함.
		int replyGroup = 15;	// 부모글의 그룹번호
		int replyOrder = 1;		// 부모글의 그룹내순서
		int replyIndent = 1;	// 부모글의 들여쓰기
//		insertReply(replyGroup,replyOrder,replyIndent);
		
		// 5. 게시물 목록 조회(반드시 1번~5번까지)
		int startNo = 1;
		int length = 5;
		getBoardListTopN(startNo,length);
		
		// 6. 중간에 특정 부분 조회(5번~9번 까지)
		startNo = 5;
		length = 9;
		getBoardListPart(startNo,length);
		
		// 7. 게시물 조회수 증가
		int bno = 2;	// 조회수를 증가시킬 게시물 번호
		updateCount(bno);
		
		// 8. 수정
		// 5번 게시물의 제목을 "다섯번째 글"로 수정하세요.
		bno = 5;
		String newTitle = "다섯번째 글";
		updateTitle(bno,newTitle);
		
		// 9. user01님이 작성한 게시물을 모두 삭제하세요
		bno = 6;	// 삭제할 게시물 번호
		deleteBoard(bno);
		
		// 자원반납
		closeResource();
		
	} // end main
	
	// 9. user01님이 작성한 게시물을 모두 삭제하세요
	private static void deleteBoard(int bno) {
		try {
			String sql = "delete from tbl_board";
			sql += " where bno = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			System.out.println("deleteBoard 객체 생성 성공");
			
			int resultRow = pstmt.executeUpdate();
			
			if(resultRow > 0) {
				System.out.println("게시물 삭제 성공");
			}else {
				System.out.println("게시물 삭제 실패");
			}
			
			System.out.println();
		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end deleteBoard

	// 8. 수정
	private static void updateTitle(int bno, String newTitle) {
		try {
			String sql = "update tbl_board";
			sql += " set title = ?";
			sql += " where bno = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, newTitle);
			pstmt.setInt(2, bno);
			System.out.println("updateTitle 객체 생성 성공");
			
			int resultRow = pstmt.executeUpdate();
			if(resultRow > 0) {
				System.out.println("타이틀 수정 성공");
			}else {
				System.out.println("타이틀 수정 실패");
			}
			
			System.out.println();
		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end updateTitle

	// 7. 게시물 조회수 증가
	private static void updateCount(int bno) {
		try {
			String sql = "UPDATE tbl_board";
			sql += " set COUNT = COUNT+1";
			sql += " where bno = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			System.out.println("updateCount 객체 생성 성공");
			
			int reaultRows = pstmt.executeUpdate();
			
			if(reaultRows > 0) {
				System.out.println("조회수 증가 성공");
			}else {
				System.out.println("조회수 증가 실패");
			}
			
			System.out.println();
		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end updateCount

	// 6. 중간에 특정 부분 조회(5번~9번 까지)
	private static void getBoardListPart(int startNo, int length) {
		try {
			String sql = "select b.*";
			sql += " from(";
			sql += " SELECT rownum rnum , a.*";
			sql += " from(";
			sql += " select bno,title,content,member_id,count,to_char(created_date,'yy/mm/dd')as created_date,reply_group,reply_order,reply_indent";
			sql += " from tbl_board";
			sql += " )a";
			sql += " )b";
			sql += " where rnum between ? and ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, startNo);
			pstmt.setInt(2, length);
			System.out.println("getBoardListPart 객체 생성 성공");
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				String strind = "";
				int indent = rs.getInt("reply_indent");
				if (indent > 0) {
					for (int i = 0; i < indent; i++) {
						strind += "  ";
					}
				}
				
				System.out.println(
						rs.getInt("bno") + "\t"
						+ strind
						+ rs.getString("title")+ "\t"
						+ rs.getString("content")+ "\t"
						+ rs.getString("member_id")+ "\t"
						+ rs.getInt("count")+ "\t"
						+ rs.getString("created_date")+ "\t"
						+ rs.getInt("reply_group")+ "\t"
						+ rs.getInt("reply_order")+ "\t"
						+ rs.getInt("reply_indent")
						);
			}
			
			System.out.println();
			
		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end getBoardListPart

	// 5. 게시물 목록 조회(반드시 1번~5번까지)
	private static void getBoardListTopN(int startNo, int length) {
		try {
			String sql = "select bno,title,content,member_id,count,to_char(created_date,'yy/mm/dd')as created_date,reply_group,reply_order,reply_indent";
			sql += " from tbl_board";
			sql += " where rownum between ? and ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, startNo);
			pstmt.setInt(2, length);
			System.out.println("getBoardListTopN 객체 생성 성공");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String strind = "";
				int indent = rs.getInt("reply_indent");
				if (indent > 0) {
					for (int i = 0; i < indent; i++) {
						strind += "  ";
					}
				}
				
				System.out.println(
						rs.getInt("bno") + "\t"
						+ strind 
						+ rs.getString("title")+ "\t"
						+ rs.getString("content")+ "\t"
						+ rs.getString("member_id")+ "\t"
						+ rs.getInt("count")+ "\t"
						+ rs.getString("created_date")+ "\t"
						+ rs.getInt("reply_group")+ "\t"
						+ rs.getInt("reply_order")+ "\t"
						+ rs.getInt("reply_indent")
					);
			}
			
			System.out.println();
			
		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end getBoardListTopN

	// 4. 답글등록
	private static void insertReply(int replyGroup, int replyOrder, int replyIndent) {
		String sql = "";
		try {
			// 현재 부모글에 달린 답글들의 그룹내 순서 증가(+1)
			sql = "update tbl_board";
			sql += " set reply_order = reply_order +1";
			sql += " where reply_group = ? and reply_order > ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, replyGroup);
			pstmt.setInt(2, replyOrder);
			
			int resultRow = pstmt.executeUpdate();
			if(resultRow > 0) {
				System.out.println("기존 답글의 order 컬럼 +1 변경 성공");
			}else {
				System.out.println("기존 답글의 order 컬럼 +1 변경 실패");
			}
			
			System.out.println("답글을 저장하기 전에 기존 답글들의 그룹내 순서 +1 작업완료  SQL"+sql+" \n reply_Group / reply+Order : "+replyGroup+"/"+replyOrder);
			
			// 답글 저장 시작
			sql = ""; // 변수 초기화
			
			String title = "[답글]새로운 글의 답글";
			String content = "[답글]새로운 내용의 답글";
			String memberId = "user02";
			sql = "insert into TBL_BOARD (BNO,TITLE,CONTENT,MEMBER_ID,COUNT,CREATED_DATE,REPLY_GROUP,REPLY_ORDER,REPLY_INDENT)";
			sql += "values (seq_bno.nextval,?,?,?,0,sysdate,?,?,?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setString(3, memberId);
			pstmt.setInt(4, replyGroup);
			pstmt.setInt(5, replyOrder +1);
			pstmt.setInt(6, replyIndent +1);
			System.out.println("insertReply 객체 생성 성공");

			resultRow = pstmt.executeUpdate();
			
			if(resultRow > 0) {
				System.out.println("답글 저장 성공");
			}else {
				System.out.println("답글 저장 실패");
			}
			
			System.out.println();
		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end insertReply

	// 3. 새글 등록 
	private static void insertNewBoard() {
		try {
			String title = "새로운 글";
			String content = "새로운 내용";
			String memberId = "user03";
			
			int replyOrder = 0; // replyOrder는 부모 order +1(부모 다음으로 위치하도록) 
			int replyIndent = 0; // replyIndent는 부모 indent +1 (부모 보다 한칸 들여쓰기)
			
			String sql ="Insert into TBL_BOARD (BNO,TITLE,CONTENT,MEMBER_ID,COUNT,CREATED_DATE,REPLY_GROUP,REPLY_ORDER,REPLY_INDENT)";
			sql += "values (seq_bno.nextval,?,?,?,0,sysdate,seq_bno.currval,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setString(3, memberId);
			pstmt.setInt(4, replyOrder);
			pstmt.setInt(5, replyIndent);
			System.out.println("insertNewBoard 객체 생성 성공");
			
			int reaultRows = pstmt.executeUpdate();
		
			if(reaultRows > 0) {
				System.out.println("새글 등록 성공");
			}else {
				System.out.println("새글 등록 실패");
			}
			
			System.out.println();
			
		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end insertNewBoard

	// 2. 게시물 목록 조회
	private static void getBoardList() {
		try {
			String sql = "select bno,title,content,member_id,count,to_char(created_date,'yy/mm/dd')as created_date,reply_group,reply_order,reply_indent";
					sql += " from tbl_board";
			
			pstmt = con.prepareStatement(sql);
			System.out.println("getBoardList 객체 생성 성공");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(
						rs.getInt("bno") + "\t"
						+ rs.getString("title")+ "\t"
						+ rs.getString("content")+ "\t"
						+ rs.getString("member_id")+ "\t"
						+ rs.getInt("count")+ "\t"
						+ rs.getString("created_date")+ "\t"
						+ rs.getInt("reply_group")+ "\t"
						+ rs.getInt("reply_order")+ "\t"
						+ rs.getInt("reply_indent")
						);
			}
			
			System.out.println();
		} catch (SQLException e) {
			System.out.println("SQL ERR! : " + e.getMessage());
		} finally {
			// 자원 해제 메소드 호출
			closeResource(pstmt, rs);
		}
	} // end getBoardList

	// 1. DB 접속 메소드 호출
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

	// 자원반납
	private static void closeResource() {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			System.out.println("자원해제 ERR! : " + e.getMessage());
		}
	}
	
	// 자원반납
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
	}
	
} // end class
