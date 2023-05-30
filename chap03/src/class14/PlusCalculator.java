package class14;

// 메소드 오버로딩 연습 라이브러리 클래스

public class PlusCalculator {

	// 정수 덧셈 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result; // 리턴값 지정(호출한 곳으로 값을 돌려준다)
	}

	// 실수 메소드
	double plus(double x, double y) {
		double result = x + y;
		return result; // 리턴값 지정
	}

}
