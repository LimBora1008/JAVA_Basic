package class01;

/* 
 * 메소드간 파라미터 전달 (배열 , 객체와 같은 여러개 값을 담는 객체의 주소값 전달)
 * 	- 콜바이 레퍼런스 : 참조 주소값 복사
 */

public class CallByReferenceRetrun { // class

	public static void main(String[] args) {// main

		int[] numbers = { 1, 2, 3, 4, 5 };
		int[] newNumbers = addTen(numbers); // addTen(numbers); >> 전달받은 배열의 요소를전달하는 메소드(addTen)를 호출하고 반환된 값을 받음
											// 반환된 값을 int타입 배열(int[] newNumbers)에 저장한다
		// addTen(numbers); : 기존 numbers의 값을 변경해버린다

		// 기존값 출력
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println(); // 줄변경

		// 변경값 출력
		for (int i = 0; i < newNumbers.length; i++) {
			System.out.print(newNumbers[i] + " ");
		}

	} // main

	// 전달받은 배열의 요소에 10일 더해주는 메소드
	public static int[] addTen(int[] numbers) {
		int[] nums = null; // 메모리공간 확보x
		nums = new int[numbers.length]; // 5칸짜리 새로운 배열이 만들어짐

		/*
		 * nums[0] = numbers[0]+10; nums[1] = numbers[1]+10; nums[2] = numbers[2]+10;
		 * nums[3] = numbers[3]+10; nums[4] = numbers[4]+10;
		 */

		for (int i = 0; i < numbers.length; i++) {
			nums[i] = numbers[i] + 10;
		}
		return nums; // 값 반환
	}

} // class
