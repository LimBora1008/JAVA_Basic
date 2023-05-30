package com.javalab.polymorphism.pkg16;

public class VehicleMain {

	public static void main(String[] args) {

		System.out.println("[1] 다형성이 아닌 일반적인 객체 활용 ==========================");
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

		taxi.run();
		bus.run();

		System.out.println(); // 줄바꿈

		System.out.println("[2] 인터페이스와 매개 변수를 활용한 다형성 구현 ===================");
		Driver driver = new Driver(); // 검증객체 생성
//		Vehicle ve = null; // 부모타입 클래스 변수 선언

//		ve = new Taxi(); // 부모타입 클래스변수에 구현클래스 대입
		driver.drive(taxi);

//		ve = new Bus();
		driver.drive(bus);

		System.out.println(); // 줄바꿈

		System.out.println("[3] 반복문을 통해서 운행을 자동화 시킴 =========================");
		Vehicle[] arrVe = new Vehicle[2];
		arrVe[0] = new Taxi();
		arrVe[1] = new Bus();

		for (Vehicle vehicle : arrVe) {
			driver.drive(vehicle);
		}

	}

}
