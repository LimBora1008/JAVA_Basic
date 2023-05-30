package com.javalab.polymorphism.pkg10;

public class RemoteControlMain {

	public static void main(String[] args) {

		// 1. 인터페이스를 사용하지 않은 평범한 경우
		Television tv = new Television();
		tv.turnOn();

		System.out.println(); // 줄바꿈

		// 2. 인터페이스를 사용하는 경우
		RemoteControl rc = null; // 인터페이스 타입 변수 rc 선언(객체 생성이 xx)

		// rc변수에 Television 객체를 대입(일종의 자동 타입 변환)
		rc = new Television();
		rc.turnOn(); // 부모 타입의 turnOn 메소드는 감춰지고 구현객체(자식)의 메소드가 호출됨

		System.out.println(); // 줄바꿈

		// rc변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn(); // 부모 타입의 turnOn 메소드는 감춰지고 구현객체(자식)의 메소드가 호출됨

		System.out.println(); // 줄바꿈

		// for문으로 만들기
		RemoteControl[] arrRc = new RemoteControl[2];
		arrRc[0] = new Television();
		arrRc[1] = new Audio();

		for (RemoteControl remoteControl : arrRc) {
			remoteControl.turnOn();
		}

	}

}
