package com.javalab.inheritance.exam01;

// super(); : 부모 클래스의 생성자 호출
// super(); 는 항상 첫줄에 있어야한다

public class Child extends Parent {

	public String address;
	public String phone;

	// 기본생성자
	public Child() {
		super(); // 첫줄에서 부모 객체 기본 생성자 호출
		// super(); 를 쓰지않아도 컴파일러가 자동으로 넣어준다
	}

	public Child(String address) {
		super("김길동", 29); // 부모 필드 초기화
		this.address = address; // 자식 필드 초기화
		System.out.println("자식 객체의 생성자1");
	}

	public Child(String address, String phone) {
		this.address = address;
		this.phone = phone;
		System.out.println("자식 객체의 생성자2");
	}

}
