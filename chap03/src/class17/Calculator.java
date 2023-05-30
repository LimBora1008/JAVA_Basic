package class17;

// 라이브러리 클래스

public class Calculator {

	// 원주율(멤버 변수,인스턴스 변수)
	double pi = 3.14159;

	// 넓이를 구하는 인스턴스 메소드(원주율*반지름*반지름)
	double area(int redius) {
		return this.pi * redius * redius;
	}

}
