package com.javalab;

import java.util.*;

// 콘솔 계산기
public class RunMain3 {

	public static void main(String[] args) {

		// 키보드에서 입력을 받아들이는 객체
		Scanner in = new Scanner(System.in);
		int option;
		int number1, number2; // 키보드에서 받아들일 두 숫자 저장요 변수

		while (true) {
			System.out.println("번호를 입력하세요 1.덧셈 2.뺄셈 3.나눗셈 4.곱셈");
			option = Integer.parseInt(in.next()); // 입력받은 문자를 int형으로 변환

			if (option == 1) {
				System.out.print("[덧셈]");
				askForNumbers(); // 문장 출력 메소드
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double sum = number1 + number2;
				System.out.println("덧셈 결과 : " + sum);

			} else if (option == 2) {
				System.out.print("[뺄셈]");
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double sum = number1 - number2;
				System.out.println("뺄셈 결과 : " + sum);

			} else if (option == 3) {
				System.out.print("[나눗셈]");
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double sum = number1 / number2;
				System.out.println("나눗셈 결과 : " + sum);

			} else if (option == 4) {
				System.out.print("[곱셈]");
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double sum = number1 * number2;
				System.out.println("곱셈 결과 : " + sum);

			} else { // 1,2,3,4 이외의 숫자가 올 경우
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0); // 0-정상적으로 종료
				break;
			}
		}
		// 자원 반납
		in.close();

	} // end main

	private static void askForNumbers() {
		System.out.println("두 개의 숫자를 입력하세요");
		System.out.println();
	}
}
