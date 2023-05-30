package com.javalab.polymorphism.pkg08;

public class Bus extends Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다"); // 메소드 구현부
	}

	@Override
	public void stop() {
		System.out.println("버스가 정차합니다"); // 메소드 구현부
	}

}
