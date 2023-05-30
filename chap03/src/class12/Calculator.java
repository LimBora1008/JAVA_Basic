package class12;

// 가변길이 parameter메소드 연습 라이브러리 클래스/도메인 클래스/vo클래스
// 필드(속성)이 없는 상태 
// 메소드(동작)만 있는 상태

public class Calculator {

	// 가변길이 매개변수를 갖는 메소드 선언
	int sum(int ...values) { // ...은 가변길이 parameter
		// sum 변수 선언
		int sum = 0;
		
		// values는 배열타입의 변수처럼 사용
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		
		// 합산 결과를 리턴
		return sum;
	}
}
