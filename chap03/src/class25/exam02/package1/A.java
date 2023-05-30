package class25.exam02.package1;

// 라이브러리 클래스

public class A {
	
	// 필드 선언+생성자 호출
	A a1 = new A(true); // 자신의 생성자 호출(클래스이름 클래스변수 = new 생성자)
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// public 접근 제한 생성자 선언
	public A(boolean b) {
		
	}
	
	// default 접근 제한 생성자 선언
	A(int b){
		
	}
	
	// private 접근 제한 생성자 선언
	private A(String s) {
		
	}

}
