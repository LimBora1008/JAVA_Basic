package class01;

/*
 * 메소드간 파라미터 전달(배열, 객체와 같은 여러개의 값을 담는 객체의 주소값 전달)
 * 	- 콜바이 레퍼런스(Call by reference) : 참조 주소값 복사
 *  - reference : 주소
 */

public class CallByReference {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		
		// int 자료형 변수 5개 1,2,3,4,5 저장
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		printArray(num1,num2,num3,num4,num5); // int 자료형 출력 변수
		
		printArray(numbers); // int[] numbers 배열 출력 메소드 호출
	}
	
	// int자료형 출력 변수	 			//(파라미터 , 매게변수 )
	public static void printArray(int num1, int num2, int num3, int num4, int num5) {
		System.out.println(num1+num2+num3+num4+num5);
	}
	
	// 배열을 전달 받아서 출력해주는 메소드
	public static void printArray(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println(); // 줄바꿈

		for (int i : numbers) {
			System.out.print(i + " ");
		}
	}

}
