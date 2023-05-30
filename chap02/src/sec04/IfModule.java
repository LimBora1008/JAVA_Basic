package sec04;

import java.util.Scanner;

public class IfModule { // class S
	public static void main(String[] args) { // main S

		Scanner scanner = new Scanner(System.in);

		System.out.print("a입력값: ");
		int a = scanner.nextInt();

		System.out.print("b입력값: ");
		int b = scanner.nextInt();
		
		compareTwoNumber(a,b);
		
		scanner.close(); // 자원닫기

	} // main E
	
	// 두 수를 비교해주는 함수
	private static void compareTwoNumber(int a, int b) { // int a << 지역변수
		if(a > b){
			System.out.println("a입력값 크다");
		}else if(a < b) {
			System.out.println("b입력값 크다");
		}else {
			System.out.println("두 수는 같다");
		}
	}

} // class E
