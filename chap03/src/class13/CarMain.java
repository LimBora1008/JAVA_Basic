package class13;

// 메소드 연습용 Car클래스를 사용하는 실행클래스

public class CarMain {
	
	public static void main(String[] args) {
		
		// Car 객체 생성
		Car myCar = new Car(); // 기본 생성자로 호출
		// myCar = 클래스변수 / 참조변수 / 타입변수
		// new > 하드에 코드로 존재하는 것을 메모리에 올려주는역할(객체생성)
		// new 뒤에있는 Car() 는 생성자를 의미
		
		// 주유 메소드 setGas() 호출
		myCar.setGas(10); // 10만큼 주유
		
		// 기름이 있을 경우 출발
		// isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if블록 실행
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다");
			
			// 운행 run() 메소드 호출
			myCar.run();
		}
		
		System.out.println("gas를 주입하세요");
	}

}
