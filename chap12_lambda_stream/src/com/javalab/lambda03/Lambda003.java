package com.javalab.lambda03;

/**
 * 함수형 인터페이스(메소드가 하나인 인터페이스)
 * - 람다식을 만들어서 저장할 인터페이스
 */

@FunctionalInterface
interface MyfunctionalInterface{
	public /*abstract(생략)*/ void run(); // 유일한 추상 메소드
}

/*
 * 람다식 테스트 클래스
 * - 매개변수가 없고 return문이 없는 람다 함수
 */
public class Lambda003 {
	public static void main(String[] args) {
		MyfunctionalInterface fi; // 함수형 인터페이스 타입 참조변수
		
		/*
		 * 1. 매개변수가 없으면 빈 괄호() 사용가능
		 * - 구현 내용이 여러 문장이면 중괄호{}로 감싸야함.
		 */
		fi = () -> { // 익명 구현 객체 탄생(오버라이딩)
			String str = "method Call 1";
			System.out.println(str);
		};
		fi.run(); // 익명 구현 객체의 run메소드 호출
		
		/*
		 * 2. 구현(실행) 내용이 한 줄이면 중괄호{}를 써도 되고, 생략도 가능함
		 */
		fi = () -> {System.out.println("method Call 2");}; // fi = () -> System.out.println("method Call 2");
		fi.run();
		
		/*
		 * 3. 구현(실행) 내용이 한 줄이면 중괄호{} 생략 가능
		 */
		fi = () -> System.out.println("method Call 3");
		fi.run();
		
//		System.out.println("람다식 사용없이 익명 구현 객체의 run메소드 호출");
		fi = new MyfunctionalInterface() {
			@Override
			public void run() {
				System.out.println("람다식 사용없이 익명 구현 객체의 run메소드 호출");
			}
		};
		fi.run();
	}
}
