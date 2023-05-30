package class04;

/*
 * 실행 클래스
 * 기본 생성자를 통한 객체 생성
 * 생성자는 필드를 초기화한다
 * 기본 생성자는 타입의 기본값으로 초기화한다
 */

public class CarMain {
	
	public static void main(String[] args) {
		
		// 1. Car 객체 생성
		Car myCar = new Car(); // 기본생성자 호출
		Car myCar2 = new Car(); // 기본생성자 호출
		
		System.out.println("객체의 주소 : \n" + myCar + "\n" + myCar2);
	}

}
