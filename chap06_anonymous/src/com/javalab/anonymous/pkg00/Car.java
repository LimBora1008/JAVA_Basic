package com.javalab.anonymous.pkg00;

// Tire 객체를 멤버로 갖는 클래스
public class Car {
	// 필드 선언(타이어 클래스 타입을 필드로 갖게 됨)
	private Tire trie1 = new Tire();
	private Tire trie2 = new Tire() { // 상속관계 구현
		@Override // 익명 자식 객체 생성(Tire를 상속함)
		public void roll() {
			System.out.println("익명 자식 타이어 객체1이 굴러갑니다.");
		}
	}; // 반드시 ; 이 들어가야함

	// 메소드 선언
	public void run() {
		trie1.roll();
		trie2.roll(); // 자식객체의 오버라이딩 된 메소드 호출
	}

	// 메소드 내에서 익명 객체 생성(구현 객체)
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 객체2가 굴러갑니다");
			}
		};
		tire.roll();
	}

	// 다형성 구현(매개변수의 다형성)
	public void run3(Tire tire) {
		tire.roll();
	}

}
