package com.javalab.polymorphism.pkg11;

public class Audio implements RemoteControl {

	// 필드
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLEUME) {
			this.volume = RemoteControl.MAX_VOLEUME;
		} else if (volume < RemoteControl.MIN_VOLEUME) {
			this.volume = RemoteControl.MIN_VOLEUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

}
