package com.javalab.generic.pkg01;

public class GenericExample {
	public static void main(String[] args) {
		// Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>(); // <> : 다이아몬드 연산자 (우변은 생략 가능)
		box1.contant = "안녕하세요";
		String str = box1.contant;
		System.out.println(str);

		// Box<Integer> box2 = new Box<Integer>();
		Box<Integer> box2 = new Box<>();
		box2.contant = 100;
		int value = box2.contant;
		System.out.println(value);
	}

}
