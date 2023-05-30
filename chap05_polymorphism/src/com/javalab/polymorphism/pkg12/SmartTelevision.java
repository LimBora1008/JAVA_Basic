package com.javalab.polymorphism.pkg12;

/**
 * 다중 구현 클래스
 *  - 여러개의 인터페이스를 상속한 클래스
 *  - 상속한 인터페이스가 갖고 있는 모든 추상 메소드를 구현해야 한다.
 *  리모컨 기능 인터페이스 + 검색 기능 인터페이스 동시에 구현[다중 인터페이스 구현]
 *  리모컨 작동도 되고 동시에 검색 기능도 갖춘 TV
 */


public class SmartTelevision implements RemoteControl, Searchable {

	// 필드
	private int volume;

	// turnOn 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	// turnOff 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	// setVoleume 메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLEUME) {
			this.volume = RemoteControl.MAX_VOLEUME;
		} else if (volume < RemoteControl.MIN_VOLEUME) {
			this.volume = RemoteControl.MIN_VOLEUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

	// 검색 기능 추가 search 메소드 오버라이딩
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다");
	}
}
