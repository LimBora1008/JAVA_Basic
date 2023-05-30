package sec06;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하시려면 q를 입력하세요");

		Scanner scanner = new Scanner(System.in);
		String inputString;

		do {
			System.out.print(">");
			scanner.nextLine();
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q")); // 입력값이 "q" 이면 프로그램 종료 "!" 아니면(부정) do문 다시 실행

		System.out.println();
		System.out.println("프로그램 종료");

	}

}
