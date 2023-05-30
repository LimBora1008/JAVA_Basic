package com.javalab.inheritance.exam06;

public class ChildMain {

	public static void main(String[] args) {
		// 자식 객체 생성
		Child child = new Child();

		// 부모 타입으로 자동 타입 변환
		Parent parent = child;
//		Child child2 = parent; 자식이 부모를 담을 수 없다

		// 메소드 호출
		parent.method1(); // parent 에는 child 주소가 복사되었으므로 사용가능
		parent.method2(); // 부모,자식 동시에 존재 -> 자식꺼 호출
//		parent.method3(); // 호출 불가능(부모는 자식의 메소드를 호출할 수 없다)
	}

}
