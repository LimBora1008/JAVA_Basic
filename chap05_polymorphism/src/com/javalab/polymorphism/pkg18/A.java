package com.javalab.polymorphism.pkg18;

// 중첩 클래스

public class A { // 바깥 클래스

	// 1. 인스턴스 멤버(필드) 클래스(필드 위치에 중첩 클래스 정의)
	public class B { // 내부 클래스
		// B의 생성자
		public B() {
			System.out.println("B 중첩 내부 클래스의 생성자");
		}

		int field1; // 중첩 클래스의 필드

		void method1() { // 중첩 클래스의 메소드
			System.out.println("여기는 중첩 클래스 method1 입니다.");

		}

	} // end B중첩 클래스

	// 2. 인스턴스 멤버(필드) B 객체 대입
	B field = new B(); // A클래스의 필드
	// A의 생성자가 초기화할때 필드가 초기화되는데 
	// 필드가 객체를 생성하기 때문에 B의 생성자가 먼저 생성된 후 A의 생성자가 생성된다

	// 생성자
	public A() {
		System.out.println("A 클래스의 생성자");
		// B b = new B();
	}

	// 인스턴스 메소드
	void method() {
		System.out.println("여기는 바깥 클래스의 method()메소드");
		B b = new B(); // 내부클래스 객체 생성
		b.field1 = 3;
		b.method1();
	}

}
