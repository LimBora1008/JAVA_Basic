package com.javalab.polymorphism.pkg10;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다"); // 인터페이스의 메소드 내용 구축
	}

}
