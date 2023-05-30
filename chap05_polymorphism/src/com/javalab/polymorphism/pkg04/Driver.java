package com.javalab.polymorphism.pkg04;

// 운전을 해주는 클래스
// 매개변수의 다형성

public class Driver {
	
	// 운전 메소드 선언(파라미터를 부모 타입으로 받고있음 / 자동형변환)
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}

}
