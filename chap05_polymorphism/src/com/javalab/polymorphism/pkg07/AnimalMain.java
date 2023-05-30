package com.javalab.polymorphism.pkg07;

public class AnimalMain { // class

	public static void main(String[] args) { // main

		// 1. 객체를 생성해서 자신의 타입에 저장(다형성 아님)
		System.out.println("1. 자손 객체를 생성해서 자손 타입 변수에 저장(다형성 아님)");
		// 자손 객체를 생성해서 자손 타입에 저장
		Dog dog = new Dog();
		Cat cat = new Cat();

		// 자손이 갖고 있는 메소드 호출해서 소리내기
		dog.sound();
		cat.sound();

		// 2. 다형성 적용,변수의 자동 타입변환
		System.out.println("2. 다형성 적용, 자동 타입변환 + 오버라이딩 메소드 호출");

		// 부모타입 변수 선언(추상클래스는 객체생성x)
		Animal animal = null;

		// 객체를 생성해서 부모타입에 저장
		// 부모 타입으로 자식의 메소드 호출해서 소리내기
		animal = new Dog(); // 자동 타입변환
		animal.sound();

		animal = new Cat();
		animal.sound();

		// 3. 매개변수의 다형성
		System.out.println("3. 다형성 적용 매개 변수의 다형성 + 자동 타입 변환");
		animalsound(dog);
		animalsound(animal); // animal 에는 Cat객체의 주소가 있음

		System.out.println("4. 다형성 적용 매개변수의 다형성+배열");
		Animal[] animals = new Animal[2]; // 부모타입 배열 생성
		animals[0] = new Dog();
		animals[1] = new Cat();
		for (Animal animal2 : animals) {
			animalsound(animal2);
		}

	} // main

	// 매개 변수의 다형성을 이용한 메소드
	private static void animalsound(Animal animal) {
		animal.sound(); // 오버로딩 메소드 호출
	}

} // class
