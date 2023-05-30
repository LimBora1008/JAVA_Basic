package com.javalab.polymorphism.pkg19;

// 중첩 인터페이스

public class Button2 {

	// 정적 멤버 인터페이스[중첩 인터페이스 : 클래스 안에 들어있다]
	public static interface ClickListener {

		// 추상메소드
		void onClick();

	} // end interface

	// 필드
	private ClickListener clickListener; // 인터페이스 타입 clickListener 변수

	// 메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	// 메소드
	public void click() {
		this.clickListener.onClick(); // 버튼 클릭시 실행하는 메소드
	}

}
