package com.javalab.lambda04;

// 함수형 인터페이스
@FunctionalInterface
interface MyFunctionalInterface {
	// 반환형이 있고 매개 변수가 2개인 추상 메소드
	public int run(int x, int y); // 유일한 메소드
}

public class Lambda004 {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		int sum = 0;

		// 람다식 사용하지 않고 익명 구현 객체 생성
		fi = new MyFunctionalInterface() {
			@Override
			public int run(int x, int y) {
				return x + y;
			}
		};
		
		sum=fi.run(2, 3);
		System.out.println(sum);
		System.out.println();

		// 1. 실행문이 여러줄인 경우 람다식 - 실행문이 여러줄이면 중괄호{} 있어야함
		fi = (x, y) -> {
			System.out.println("람다식 run 메소드 호출 1");
			return x + y;
		};
		sum = fi.run(2, 3);
		System.out.println(sum);
		System.out.println(fi);
		System.out.println();

		// 2. 실행문이 return구문 한줄인 람다식 - a와b를 받아서 작은 수를 반환해주는 람다식 구현
		fi = (a, b) -> (a > b) ? a : b; // fi = (a, b) -> { return a > b ? a : b; };

		sum = fi.run(6, 7);
		System.out.println(sum);
		System.out.println(fi);
		System.out.println();

	}

}
