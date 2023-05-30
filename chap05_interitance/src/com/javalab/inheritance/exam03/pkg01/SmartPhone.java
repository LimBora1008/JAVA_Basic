package com.javalab.inheritance.exam03.pkg01;

public class SmartPhone extends Phone {

	public String frequency;

	// 생성자 구현
	public SmartPhone() {
		super(); // 부모 기본생성자 호출
	}

	public SmartPhone(String model, String color) {
		super(model, color);
	}

	public SmartPhone(String model, String color, String frequency) {
		super(model, color);
		this.frequency = frequency;
	}

	// showSmartPhoneInfo()
	public void showSmartPhoneInfo() {
		this.PhoneInfo(); // 부모 메소드 호출
		System.out.println("[showSmartPhoneInfo]");
		System.out.println("성능 : " + frequency);
		System.out.println();// 줄바꿈
	}

}
