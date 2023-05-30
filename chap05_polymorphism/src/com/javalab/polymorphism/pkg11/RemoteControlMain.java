package com.javalab.polymorphism.pkg11;

public class RemoteControlMain {

	public static void main(String[] args) {

		// 인터페이스 변수 선언
		RemoteControl rc;

		// Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn(); // tv 켜기
		rc.setVolume(11);
		rc.turnOff(); // tv 끄기

		System.out.println(); // 줄바꿈

		// Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn(); // 오디오 켜기
		rc.setVolume(-1);
		rc.turnOff(); // 오디오 끄기

		System.out.println(); // 줄바꿈

		// for문으로 출력하기
		RemoteControl[] arrRc = new RemoteControl[2];
		arrRc[0] = new Television();
		arrRc[1] = new Audio();

		for (RemoteControl remoteControl : arrRc) {
			remoteControl.turnOn();
			remoteControl.turnOff();
		}
	}

}
