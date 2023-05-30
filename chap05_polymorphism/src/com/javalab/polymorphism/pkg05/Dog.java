package com.javalab.polymorphism.pkg05;

// 자식클래스

public class Dog extends Animal {

	// 오버라이딩
	@Override
	public void makeSound() {
		System.out.println("멍멍");
	}

}
