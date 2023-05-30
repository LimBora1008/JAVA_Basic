package com.javalab.polymorphism.pkg07;

/*
 * 자식클래스로서 추상클래스인 Animal을 상송함
 * 부모 클래스의 추상 메소드를 오버라이드 해야함
 * 이클립스의 자동 완성으로 오버라이딩 메소드를 생성할것.
 */

public class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
