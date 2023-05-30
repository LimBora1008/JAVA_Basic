package class12;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		// Computer 객체 생성
		Calculator myCom = new Calculator();
			// myCom : 클래스변수 or 객체이름
		
		// 메소드에 다수의 인자값 전달
		int result1 = myCom.sum(1,2,3,4,5);
		System.out.println("다수의 숫자 덧셈 결과 : "+result1);
		
		// 메소드 배열 전달
		int[] values = {1,2,3,4,5};
		int result2 = myCom.sum(values);
		System.out.println("배열값 덧셈 결과 : "+result2);
	}

}
