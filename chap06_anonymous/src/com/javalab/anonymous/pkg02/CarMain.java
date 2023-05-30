package com.javalab.anonymous.pkg02;

// 실행클래스

public class CarMain {

	public static void main(String[] args) {

		Car car = new Car();
		car.run(); // snowTire + tireBig

		System.out.println(); // 줄바꿈

		// 전기차 타이어로 교체
		car.tire = new ElectricTire(); // 자동 타입변환(자식 > 부모)
		car.run(); // ElectricTire + tireBig

		System.out.println(); // 줄바꿈

		// 또다른 광폭 타이어 객체를 익명 형태로 정의해서 타이어 교체함(익명객체-재사용 불가)
		car.tireBig = new Tire() {
			@Override
			public void roll() {
				System.out.println("광폭타이어가 산길에서 힘차게 굴러갑니다.");
			}
		};
		car.run();

		System.out.println(); // 줄바꿈

		// insranceof 객체의 타입 확인
		if (car.tire instanceof Tire) {
			System.out.println("car.tire는 Tire타입 입니다");
		}
		if(car.tireBig instanceof Tire) {
			System.out.println("car.tireBig도 Tire타입 입니다");
		}

	}

}
