package class06;

/*
 * 라이브러리 클래스 , 도메인 클래스
 * 기본 생성자
 * 생성자 오버로딩 : 필드의 초기화 범위를 다양하게 만들기 위해 사용 
 *  - 다양한 형태로 객체를 초기화 하는 역할
 */

public class Car {

	// 필드(멤버 변수)
	String model; // 모델명
	String color; // 색상
	int speed; // 속도
	boolean start;// 출발 여부

	// 기본 생성자 : 필드값 초기화
	public Car() {

	}

	/* 생성자 오버로딩 (타.개.순)
	 *  - 타입(자료형)
	 *  - 갯수
	 *  - 순서
	 */
	
	// 오버로딩 생성자 #1
	public Car(String mo) {
		model = mo;
	}

	// 오버로딩 생성자 #2
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
		// this. 은 좌변에 있는 model(필드)를 지칭한다
	}

	// 오버로딩 생성자 #3
	public Car(String mo, String co, int sp) {
		model = mo;
		color = co;
		speed = sp;
	}

	// 오버로딩 생성자 #4
	public Car(String mo, String co, int sp, boolean st) {
		model = mo;
		color = co;
		speed = sp;
		start = st;
	}

}
