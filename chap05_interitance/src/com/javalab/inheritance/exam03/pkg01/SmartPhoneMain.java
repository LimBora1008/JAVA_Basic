package com.javalab.inheritance.exam03.pkg01;

public class SmartPhoneMain {

	public static void main(String[] args) {

		// 1. SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone();
		myPhone.model = "갤럭시노트10"; // 부모필드
		myPhone.color = "화이트"; // 부모필드
		myPhone.frequency = "6G"; // 자식 필드

		// myPhone 정보 조회
		myPhone.showSmartPhoneInfo(); // 자식객체의 정보출력 메소드 호출

		// 2. 또다른 SmartPhone 객체 생성
		SmartPhone yourPhone = new SmartPhone("iPhone", "빨간색", "4G");

		// yourPhone 정보 조회
		yourPhone.showSmartPhoneInfo();

	}

}
