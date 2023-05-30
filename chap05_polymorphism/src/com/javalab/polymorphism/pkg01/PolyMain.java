package com.javalab.polymorphism.pkg01;

import java.util.Scanner;

public class PolyMain { // class

	public static void main(String[] args) { // main

		Scanner scanner = new Scanner(System.in);

		Parent parent = null;

		while (true) {
			System.out.println("==============================================");
			System.out.println("성격을 알고 싶은 자녀를 선택하세요.");
			System.out.println("1. 첫째");
			System.out.println("2. 둘째");
			System.out.println("3. 셋째");
			System.out.println("4. 종료");
			System.out.println();

			// 키보드에서 Scanner를 사용해서 점수 입력받음
			String no = scanner.nextLine();

			if (no.equals("4")) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else if (no.equals("1")) {
				parent = (Parent) new Child1(); // 필드의 다형성(자식을 부모 타입에 저장)
				// (Parent) 는 형변환 없애도 괜찮다
			} else if (no.equals("2")) {
				parent = (Parent) new Child2(); // 필드의 다형성(자식을 부모 타입에 저장)
			} else if (no.equals("3")) {
				parent = (Parent) new Child3(); // 필드의 다형성(자식을 부모 타입에 저장)
			}

			parent.showPersonality(); // 부모 타입으로 호출하지만 자식의 메소드가 호출됨(오버라이딩 메소드)
		}

	} // main

} // class
