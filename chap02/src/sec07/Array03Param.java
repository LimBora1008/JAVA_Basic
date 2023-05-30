package sec07;

// [모듈화] 평균 구하는 로직(계산식)을 메소드로 분리하기

public class Array03Param { // class S

	public static void main(String[] args) { // main S
		// void는 return이 없는 자료형(공간)

		// 배열변수 선언과 동시에 초기화
		int[] intArr = { 80, 75, 90 };

		// 평균을 구해주는 메소드 호출
		double avg = getSum(intArr); // 인자(argument)로 배열을 전달
		// getSum은 메소드 이름 (변경될수있다)
		// 여기까진 avg의 값은 없다
		// getSum메소드 에서 계산된 값이 return되어 돌아오면 값이 부여된다

		System.out.printf("avg : %.2f", avg);
		// avg값은 getSum에서 계산되어 return된 값이 표시된다

	} // main E

	// 평균을 구해주는 메소드(double : 반환타입)
	public static double getSum(int[] arr) { // 매개변수가 배열 타입
		// public static double << 반환해줄 값의 타입과 맞춰야한다(avg가 double타입이다)
		// getSum은 메소드 이름
		// getSum(int[] arr) << int[] intArr = { 80, 75, 90 }; 에서 intArr의 이름만 arr로 변경되고 주소는 공유한다
		// int[] arr 의 값은 {80,75,90} 이 된다 ( 배열 초기화는 없지만 값이 부여된 상태 )
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) { // i는 arr.length의 길이(3칸)보다 작을때 반복 , 1씩 증가한다
			sum = sum+arr[i];
			System.out.println(arr[i]);
		}
		
		double avg = (double)sum/arr.length; // avg는 정수로 누적된 sum을 double로 형변환 후 arr.length(3칸)으로 나눈다 >> 실수로 계산됨
		
		return avg; // main공간에 avg값을 돌려준다
		
	}

} // class E
