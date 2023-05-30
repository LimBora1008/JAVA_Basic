package com.javalab.inheritance.exam05.package02;

import com.javalab.inheritance.exam05.package01.A;

// 상속 관계가 있는 다른 패키지의 클래스
public class D extends A {

	// 생성자 선언
	public D() {
		// A() 생성자 호출
		super();
	}

	// 메소드 선언
	public void method1() {
		// A 필드값 변경
		this.field = "value";

		// A 메소드 호출
		this.method();
	}

	// 메소드 선언
	public void method2() {
//		A a = new A();			x : 자식이 부모객체를 직접 생성하는건 불가 // super로 생성자를 호출해서 객체생성을 해야한다
//		a.field = "value";		x
//		a.method();				x
	}

}
