package com.javalab.generic.pkg05;

// 제네릭 메소드를 사용하는 실행 클래스

public class GenericExample {

	/* 제네릭 메소드 boxing()
		- 맨 앞의 <T> : 타입 파라미터
		- Box<T> : 리턴타입
		- boxing(T t) : 메소드명(파라미터)
	*/
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setT(t);
		return box; // 제네릭 객체(Integer 객체를 갖고 있는)

	}

	// main 메소드
	public static void main(String[] args) {

		Box<Integer> box1 = boxing(100); // 제네릭 메소드
		int intValue = box1.getT();
		System.out.println(intValue);

		// 제네릭 메소드 호출
		Box<String> box2 = boxing("홍길동"); // 제네릭 메소드
		String strValue = box2.getT();
		System.out.println(strValue);
	}

}
