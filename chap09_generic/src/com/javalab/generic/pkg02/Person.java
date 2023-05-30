package com.javalab.generic.pkg02;

// 제네릭 클래스
// @param <T> 타입 파라미터 : 객체 생성시 전달됨
// - 전달된 타입(클래스)으로 name 필드의 타입이 정해짐

public class Person<T> {
	// 필드
	private T name;
	private int age;

	// 기본생성자
	public Person() {
	}

	// 오버로딩 생성자
	public Person(T name, int age) {
		this.name = name;
		this.age = age;
	}

	// 게터 세터 생성자
	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
