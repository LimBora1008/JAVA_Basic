package class14;

// 실행클래스
// 교재 239페이지

public class PlusCalculatorMain {

	public static void main(String[] args) {

		PlusCalculator pc = new PlusCalculator();

		// 정수 덧셈 plus 메소드 호출
		int a = 10;
		int b = 20;
		int intSum = pc.plus(a, b);
		System.out.println("정수 a와 b의 덧셈은 : " + intSum);

		// 실수 덧셈 plus 메소드 호출
		double x = 10.0;
		double y = 20.0;
		double dblSum = pc.plus(x, y);
		System.out.println("실수 a와 b의 덧셈은 : " + dblSum);
	}

}
