package com.javalab.polymorphism.pkg17;

// 실행클래스

public class InterfaceExtendsMain {

	public static void main(String[] args) {

		// 구현 객체 생성 (자식 객체 생성)
		InterfaceCImpl impl = new InterfaceCImpl();

		InterfaceA ia = impl; // 구현객체(자식)를 InterfaceA Type 인터페이스에 저장
		ia.methodA(); // 저장한 인터페이스가 갖고 있는 메소드 이름으로 자식 메소드가 호출됨
//		ia.methodB(); InterfaceA는 메소드 methodA만 호출 가능

		System.out.println(); // 줄바꿈

		InterfaceB ib = impl;
//		ib.methodA(); InterfaceB는 메소드 methodB만 호출가능
		ib.methodB();

		System.out.println(); // 줄바꿈

		InterfaceC ic = impl; // InterfaceC 타입 인터페이스에 저장했기 때문에 모든 메소드 호출 가능
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
