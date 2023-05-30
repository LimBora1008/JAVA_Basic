package com.javalab.polymorphism.pkg08;

// 운전을 해주는 클래스

public class Driver {

	// 운전 메소드 선언 (파라미터를 부모 타입으로 받고있음. 자동 형변환)
	public void drive(Vehicle vehicle) {
		// 파라미터로 전달받은 자식 객체의 오버라이딩 메소드 호출
		vehicle.run();
		vehicle.stop();
	}
}
