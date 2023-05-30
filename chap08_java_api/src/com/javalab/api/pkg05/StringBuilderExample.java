package com.javalab.api.pkg05;

public class StringBuilderExample {

	public static void main(String[] args) {

		// StringBuilder : 문장이 추가 될 때 기존 객체에서 문장을 수정한다(객체는 1개만 생성된다)
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World"); // append : 뒤로 추가한다
		sb.append(" Ha Ha");
		System.out.println(sb); // prints "Hello World HA HA"
		System.out.println();

		// String 차이점 : 문장이 붙을때 마다 객체를 새로 생성해서 마지막 객체 주소를 저장한다
		String data = "ABC"; // 100번 주소
		data += "def"; // 101번 주소 (100번 주소는 버린다)
		System.out.println(data); // ABCdef

	}

}
