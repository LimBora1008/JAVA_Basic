package com.javalab.polymorphism.pkg07;

// 추상클래스(부모클래스) : 추상메소드가 1개라도 존재한다면 추상클래스 abstract 를 붙인다
public abstract class Animal {
	//동물의 종류
	private String kind;
	
	//메소드 선언
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메소드 선언(내용없는 껍데기 메소드로 자손에게 구현을 강제함)
	public abstract void sound();

}
