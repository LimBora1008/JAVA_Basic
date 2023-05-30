package com.javalab.polymorphism.pkg19;

// 중첩 인터페이스를 테스트할 실행클래스

public class ButtonMain {

	public static void main(String[] args) {

		// ok버튼 객체 생성
		Button2 btnOk = new Button2();

		// [중첩 클래스] ok버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(OkListener)(로컬 클래스)
		class OkListener implements Button2.ClickListener {
			// Button2클래스 에 정적 인터페이스 ClickListener 접근하여 상속(객체생성x)

			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다");
			}

		}

		// ok버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClickListener(new OkListener()); // 자식객체를 생성하여 전달

		// ok버튼 클릭하기
		btnOk.click();

		// Cancel 버튼 객체 생성
		Button2 btnCancel = new Button2();

		// Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 메소드 (로컬 클래스)
		class CancelListener implements Button2.ClickListener {

			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을  클릭했습니다");
			}

		}

		// Cancel 버튼 객체에 ClickListener 구현 객체 주입
		btnCancel.setClickListener(new CancelListener());

		// Cancel 버튼 클릭하기
		btnCancel.click();
	}

}
