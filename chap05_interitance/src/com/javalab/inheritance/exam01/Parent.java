package com.javalab.inheritance.exam01;

// 부모클래스

public class Parent {

	public String name;
	public int age;

	// 부모클래스의 기본생성자는 꼭 만들어주기
	// : 오버로딩 생성자가 1개라도 있으면 기본생성자가 자동으로 생성되지x
	// : 자식 클래스에서 오류가 날 수 있다
	public Parent() {
		System.out.println("여기는 부모 객체의 기본 생성자");
	}

	public Parent(String name, int age) {
		System.out.println("여기는 부모 객체의 오버로딩 생성자");
		this.name = name;
		this.age = age;
	}

}
