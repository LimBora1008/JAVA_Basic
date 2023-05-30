package com.javalab.polymorphism.pkg11;

// 인터페이스 : 자손들이 반드시 구현해야할 빈 껍데기 메소드를 정의해놓은 클래스
// 	- 인터페이스에 상수 필드 선언

public interface RemoteControl {

	// 상수 필드(public static이 생략됨)
	// 인터페이스의 상수는 public static이기 때문에 인터페이스 이름.상수로 접근
	public static int MAX_VOLEUME = 10;
	int MIN_VOLEUME = 0;

	// 추상 메소드
	// 인터페이스에 있는 추상메소드는 자식클래스에서 꼭!! 구현해야한다
	void turnOn();

	void turnOff();

	void setVolume(int volume);

}
