package com.javalab.inheritance.exam03.pkg01;

public class Phone {

	// 필드 선언
	public String model;
	public String color;

	// 생성자
	public Phone() {
		// super(); : 최고 조상 object 상속
	}

	public Phone(String model, String color) {
		// super(); : 최고 조상 object 상속
		this.model = model;
		this.color = color;
	}

	// phoneInfo() 메소드 구현
	public void PhoneInfo() {
		System.out.println("[PhoneInfo]");
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
	}

}
