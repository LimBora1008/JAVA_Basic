package class26.exam01;

// 자동차 객체를 생성하고 생성된 객체를 이리저리 사용하는 프로그램 로직을 구현하는 실행클래스

public class CarMain {

	public static void main(String[] args) {

		// 1. 빈 객체 만들고 필드에 직접 접근해서 값을 넣기
		Car myCar1 = new Car();

		myCar1.maker = "현대차";
		myCar1.model = "그랜저";
		myCar1.cc = 2000;
		myCar1.color = "white";
		myCar1.price = 37160000;
		myCar1.maxSpeed = 250;
		myCar1.speed = -120;

		System.out.println(myCar1.maker);
		System.out.println(myCar1.model);
		System.out.println(myCar1.cc);
		System.out.println(myCar1.color);
		System.out.println(myCar1.price);
		System.out.println(myCar1.maxSpeed);
		System.out.println(myCar1.speed);

		System.out.println();

		// 2. 생성자를 사용해서 출력하기
		Car myCar2 = new Car("기아차", "K9", 3000, "black", 57720000, 300, 150);

		System.out.println(myCar2.maker);
		System.out.println(myCar2.model);
		System.out.println(myCar2.cc);
		System.out.println(myCar2.color);
		System.out.println(myCar2.price);
		System.out.println(myCar2.maxSpeed);
		System.out.println(myCar2.speed);
		
		System.out.println();
		
		// 자동차 객체의 값 출력하는 또다른 방법(showCarinfo 메소드)
		// 첫번째 자동차 객체의 값 출력
		myCar1.showCarinfo();
		
		System.out.println();
		
		// 두번째 자동차 객체의 값 출력
		myCar2.showCarinfo();
	}

}
