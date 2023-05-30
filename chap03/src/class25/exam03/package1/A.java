package class25.exam03.package1;

// 필드의 접근 제한
public class A {
	
	// 인스턴스 필드
	// #1 public 접근 제한을 갖는 필드 선언
	public int field1;
	
	// #2 default 접근 제한을 갖는 필드 선언
	int field2;
	
	// #3 private 접근 제한을 갖는 필드 선언
	private int field3;
	
	// 생성자 선언
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	// public 접근 제한을 갖는 메소드 선언
	public void method1() {
		
	}

	// default 접근 제한을 갖는 메소드 선언
	void method2() {
		
	}
	
	// private 접근 제한을 갖는 메소드 선언
	private void method3() {
		
	}
		

}
