package com.javalab.collection.pkg11;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {

		// 1. 기본데이터를 Board 객체로 생성한 후에 ArrayList에 추가(add)하고 출력해주는 메소드를 만드세요.
		// 게시물 객체를 저장할 ArrayList 선언
		List<Board> boardlist = new ArrayList<>();

		// ArrayList에 게시물 저장
		boardlist.add(new Board(100, "객체 배열을 통하여 학생명단 평균점수 최고점수 최고점 학생을 출력하세요", "김정희", "2023.03.03", 84));
		boardlist.add(new Board(101, "객체지향 프로그래밍 - 인스턴스 멤버와 정적멤버", "최윤희", "2021.07.21", 99));
		boardlist.add(new Board(102, "클래스와 객체지향 프로그래밍(Object Oriented Programming)", "우성민", "2020.06.10", 264));
		boardlist.add(new Board(103, "[정렬] 선택 정렬(Selection Sort)", "정민태", "2023.01.02", 77));
		boardlist.add(new Board(104, "Math.random() 메소드를 통한 난수 발생시키기", "김갑철", "2022.10.12", 94));
		boardlist.add(new Board(105, "배열을 통한 사원 정보 관리 #2", "이수영", "2021.07.25", 70));
		boardlist.add(new Board(106, "배열을 통한 학생 정보 관리 #1", "박영준", "2023.02.01", 80));
		boardlist.add(new Board(107, "문자열(장문) 처리하기", "성수정", "2019.12.30", 56));
		boardlist.add(new Board(108, "[과제] 주말과제 - 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2020.05.17", 84));
		boardlist.add(new Board(109, "[모듈화] 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2023.03.03", 64));
		boardlist.add(new Board(110, "다차원 배열 자료 저장 구조와 인덱스", "서동욱", "2022.07.010", 94));
		boardlist.add(new Board(111, "제어문 반복문", "정연남", "2022.08.03", 84));
		boardlist.add(new Board(112, "연산자(Operator)", "최정빈", "2020.01.01", 64));
		boardlist.add(new Board(113, "키보드를 통해서 데이터 읽어들이기", "오민희", "2022.09.12", 984));
		boardlist.add(new Board(114, "변수와 자료형 #1", "이의정", "2022.09.03", 164));

		printAllBoard(boardlist);

		// 2. 게시물 중에서 우성민, 홍세나가 작성한 게시물을 찾아서 반환해주는 메소드를 만드세요.
		List<Board> nameList = getBoardByName(boardlist);

		System.out.println("2. 게시물 중에서 우성민, 홍세나가 작성한 게시물을 찾아서 반환해주는 메소드를 만드세요.");
		for (Board b : nameList) {
			System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getWriter() + "\t" + b.getDate() + "\t"
					+ b.getHitcount());
		}

		System.out.println();

		// 3. 배열과 관련된 게시물을 출력해주는 메소드를 만드세요.
		printBoard(boardlist);

		// 4. 조회수가 가장 큰 게시물을 출력해주는 메소드를 만드세요.
		printHitCountBoard(boardlist);

		// 5. 게시물 객체를 Set 컬렉션에 저장하고 출력해주는 메소드를 만드세요.
		printSetBoard(boardlist);

		// 6. 게시물번호를 키(key)로 하여 HashMap에 학생 객체를 저장하고 출력해주는 메소드를 통해서 출력하세요.
		System.out.println("6. 게시물번호를 키(key)로 하여 HashMap에 학생 객체를 저장하고 출력해주는 메소드를 통해서 출력하세요.");
		Map<Integer, Board> boardMap = new HashMap<Integer, Board>();
		for (Board b : boardlist) {
			boardMap.put(b.getId(), b);
		}
		printMapBoard(boardMap);

	} // end main

	// printMapBoard 메소드
	private static void printMapBoard(Map<Integer, Board> boardMap) {

		Set<Integer> keySet = boardMap.keySet(); // key값을 set으로 저장
		// while문 방법
		Iterator<Integer> iter = keySet.iterator(); // 반복자생성
		while (iter.hasNext()) {
			Integer key = iter.next();
			Board board = boardMap.get(key);
			System.out.printf("%d \t  %s \t %s \t %d \n", board.getId(), board.getTitle(), board.getWriter(),
					board.getHitcount());
			// for문으로 출력하기
//		for (Integer i : keySet) {
//			System.out.println(boardMap.get(i).getId());
//			}
		}

	}

	// printSetBoard 메소드
	private static void printSetBoard(List<Board> boardlist) {
		Set<Board> set = new HashSet<Board>();
		System.out.println("5. 게시물 객체를 Set 컬렉션에 저장하고 출력해주는 메소드를 만드세요.");
		for (Board board : boardlist) {
			set.add(board);
		}
		for (Board b : set) {
			System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getWriter() + "\t" + b.getDate() + "\t"
					+ b.getHitcount());
		}

		System.out.println();
	}

	// printHitCountBoard 메소드
	private static void printHitCountBoard(List<Board> boardlist) {
		int count = 0;
		System.out.println("4. 조회수가 가장 큰 게시물을 출력해주는 메소드를 만드세요.");
		for (Board b : boardlist) {
			if (count < b.getHitcount()) {
				count = b.getHitcount();
			}
		}
		for (Board b : boardlist) {
			if (count == b.getHitcount()) {
				System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getWriter() + "\t" + b.getDate() + "\t"
						+ b.getHitcount());
			}
		}
		System.out.println();
	}

	// printBoard 메소드
	private static void printBoard(List<Board> boardlist) {
		System.out.println("3. 배열과 관련된 게시물을 출력해주는 메소드를 만드세요.");
		for (Board b : boardlist) {
			if (b.getTitle().contains("배열")) { // contains : 포함
				System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getWriter() + "\t" + b.getDate() + "\t"
						+ b.getHitcount());
			}
		}

		System.out.println();
	}

	// getBoardByName 메소드
	private static List<Board> getBoardByName(List<Board> boardlist) {
		List<Board> list2 = new ArrayList<Board>();

		for (Board b : boardlist) {
			if (b.getWriter().equals("우성민") || b.getWriter().equals("홍세나")) {
				list2.add(b);
			}
		}
		return list2;
	}

	// printAllBoard 메소드
	private static void printAllBoard(List<Board> boardlist) {
		System.out.println("1. 기본데이터를 Board 객체로 생성한 후에 ArrayList에 추가(add)하고 출력해주는 메소드를 만드세요");
		for (int i = 0; i < boardlist.size(); i++) {
			System.out.println(
					boardlist.get(i).getId() + "\t" + boardlist.get(i).getTitle() + "\t" + boardlist.get(i).getWriter()
							+ "\t" + boardlist.get(i).getDate() + "\t" + boardlist.get(i).getHitcount());
		}

		System.out.println();

//		for (Board b : boardlist) {
//			System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getWriter() + "\t" + b.getDate() + "\t"
//					+ b.getHitcount());
//		}
	}

}// end class
