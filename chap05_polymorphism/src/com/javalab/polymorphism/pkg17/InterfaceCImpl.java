package com.javalab.polymorphism.pkg17;

/*
 * 구현클래스(자식)
 * 	- InterfaceC를 구현한 구현클래스(자식클래스)
 * 	- InterfaceC 는 InterfaceA와 InterfaceB를 상속했다
 * 	- 메소드의 시그너처는 InterfaceCImpl 클래스에 마우스를 갖다 대면 자동으로 구현해줌
 */

public class InterfaceCImpl implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("InterfaceCImpl-InterfaceA 실행");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl-InterfaceB 실행");
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl-InterfaceC 실행");
	}

}
