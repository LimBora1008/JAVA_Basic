package com.javalab.collection.pkg01;

import java.util.*;

import javax.sound.midi.Soundbank;

/*
 * 
 */
public class ArrayList04 {

	public static void main(String[] args) {

//		ArrayList 컬렉션 생성
		List<Board> list = new ArrayList<>();

		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));

		// 저장된 총 객체 수 얻기
//		int size = list.size();
//		System.out.println("저장된 객체 수 : "+size);
		System.out.println("저장된 객체 수 : " + list.size());

		System.out.println();

		// 2번째 인덱스의 객체 가져와서 출력하기
		Board board = list.get(1);
		System.out.println(board.toString()); // toString 오버라이딩(디버깅)
//		System.out.println(board.getSubject()+board.getContent()+board.getWriter());
//		System.out.println("2번째 인덱스의 값 : " + list.get(1).getSubject() + " " + list.get(1).getContent() + " " + list.get(1).getWriter());

		System.out.println();

		// 향상된 for
		for (Board board1 : list) {
			System.out.println(board1.getSubject() + " " + board1.getContent() + " " + board1.getWriter());
		}

		System.out.println();

		// 일반 for
		for (int i = 0; i < list.size(); i++) {
			System.out
					.println(list.get(i).getSubject() + " " + list.get(i).getContent() + " " + list.get(i).getWriter());
		}

		System.out.println();

		// 객체 삭제
		list.remove(2);
		list.remove(2);

		for (Board board1 : list) {
			System.out.println(board1.getSubject() + " " + board1.getContent() + " " + board1.getWriter());
		}

		System.out.println();
		
		// "제목11","내용11","글쓴이11" 을 인덱스 1번에 넣기
		list.set(1,new Board("제목11", "내용11", "글쓴이11"));

		for (Board b : list) {
			System.out.println(b.toString());
		}

	} // end main

} // end class

/*
 * [Raw Data] "제목1", "내용1", "글쓴이1" "제목2", "내용2", "글쓴이2" "제목3", "내용3", "글쓴이3"
 * "제목4", "내용4", "글쓴이4" "제목5", "내용5", "글쓴이5"
 */

class Board {
	// 필드
	private String subject;
	private String content;
	private String writer;

	// 기본생성자
	public Board() {
	}

	// 오버로딩 생성자
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	// 게터 세터
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}

}