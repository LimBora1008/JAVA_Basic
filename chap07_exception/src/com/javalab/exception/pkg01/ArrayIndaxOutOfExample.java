package com.javalab.exception.pkg01;

//실행 예외(Runtime Exception) 테스트 클래스
//ArrayIndaxOutOfBoundExcepton : 존재하지 않는 배열 인덱스 참조

public class ArrayIndaxOutOfExample {

	public static void main(String[] args) {

		String[] arrSrt = new String[2];

		arrSrt[0] = "hi java";
		arrSrt[1] = "hi javascript";

		System.out.println(arrSrt[2]);

		// 교수 객체 저장용 배열 선언
		Professor[] profs = new Professor[3];
		profs[0] = new Professor(50);
		profs[1] = new Professor(55);

		// 배열의 크기를 +1 : ArrayIndaxOutOfBoundExcepton
		for (int i = 0; i < profs.length; i++) {
			System.out.println(profs[i].age);
		}

	}

}

// 교수 클래스
class Professor {
	// 필드
	public int age = 10;

	// 기본생성자
	Professor() {
	}

	// 오버로딩
	Professor(int age) {
		this.age = age;
	}

}
