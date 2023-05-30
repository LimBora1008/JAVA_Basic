package sec04;

import java.util.Scanner;

public class Q1_Scanner { // class S
	public static void main(String[] args) { // main S

		Scanner scanner = new Scanner(System.in);

		System.out.print("a입력값: ");
		int a = scanner.nextInt();

		System.out.print("b입력값: ");
		int b = scanner.nextInt();

		if (a > b) {
			System.out.println("a는 b보다 크다");
		} else {
			System.out.println("a는 b보다 작다");
		}

		System.out.print("이름: ");
		String c = scanner.next();

		scanner.nextLine();
		System.out.print("내용: ");
		String d = scanner.nextLine();

		System.out.println(c + d);
		
		scanner.close(); // 자원닫기

	} // main E

} // class E
