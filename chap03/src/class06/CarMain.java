package class06;

/*
 * 오버로딩 생성자 호출과 다양한 범위의 필드 초기화
 */

public class CarMain {
	
	public static void main(String[] args) {
		
		// 기본생성자로 객체 생성
		Car myCar1 = new Car();
		
		/*
		 * 오버로딩 생성자 호풀
		 *  - 객체를 생성하면서 초기화 값을 전달
		 *  - 오버로딩 생성자에 전달한 인자값으로 객체가 만들어짐
		 */
		
		// 오버로딩 생성자 #1을 통한 객체 생성
		Car myCar2 = new Car("제네시스");
		
		// 오버로딩 생성자 #2을 통한 객체 생성
		Car myCar3 = new Car("제네시스","다크블루");
		
		// 오버로딩 생성자 #3을 통한 객체 생성
		Car myCar4 = new Car("제네시스","다크블루",70);
		
		// 오버로딩 생성자 #4을 통한 객체 생성
		Car myCar5 = new Car("제네시스","다크블루",70,true);
		
		// 기본 생성자로 만들어진 객체의 값 출력
		System.out.println("myCar1 모델명(String) : "+myCar1.model);
		
		// 오버로딩 생성자에 전달한 값으로 초기화 된 객체
		System.out.println("myCar2 모델명(String) : "+myCar2.model);
		System.out.println("myCar3 색상(String) : "+myCar3.color);
		System.out.println("myCar4 속도(int) : "+myCar4.speed);
		System.out.println("myCar5 출발여부(boolean) : "+myCar5.start);
	}

}

/* 
 * null
 * 객체가 값이 없을때 기본값이 null
 * 배열도 기본값이 null
 */
