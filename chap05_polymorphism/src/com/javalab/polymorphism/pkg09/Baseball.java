package com.javalab.polymorphism.pkg09;

public class Baseball extends Sports {

	@Override
	public void play(Sports sports) { // 매개 변수 다형성 구현 용도
		System.out.println(sports.toString() + "경기를 합니다");
	}

	
	// 스스로 만든 메소드 
	public String toString() { // toString() : "야구" 라는 문자열을 만들어서 반환해준다
		return "야구";
	}

}
