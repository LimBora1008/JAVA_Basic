package com.javalab.polymorphism.pkg12;

public class RemoteControlMain {

	public static void main(String[] args) {
		RemoteControl remocon; // 리모컨 기능만 있는 인터페이스 타입 변수 서언

		// 1. 리모컨 기능만 있는 Televison 사용
		// 텔레비전 객체를 생성해서 인터페이스 타입에 저장
		remocon = new Television(); // 구현 객체 대입(자동타입변환)
		remocon.turnOn(); // 구현 객체의 메소드가 호출
		remocon.turnOff(); // 구현 객체의 메소드가 호출

		System.out.println(); // 줄바꿈

//		Searchable sh = new Television(); : Television은 Searchable이 상속되지않았음
//		sh.search("www.naver.com");

		// 2. SmartTV를 작동하는 경우
		SmartTelevision sTv = new SmartTelevision(); // 다중 구현한 클래스
		// 리모콘 기능이 있는 인터페이스를 구현한 메소드 호출
		RemoteControl remocon2 = sTv; // 리모컨 기능이 있는 인터페이스로 자동형변환
		Searchable sh = sTv; 	// Searchable 인터페이스 타입으로 자동변환
		remocon2.turnOn(); 		// 구현 객체의 메소드가 호출
		remocon2.setVolume(6); 	// 구현 객체의 메소드가 호출

		sh.search("www.naver.com");
		remocon2.turnOff(); // 구현 객체의 메소드가 호출

	}

}
