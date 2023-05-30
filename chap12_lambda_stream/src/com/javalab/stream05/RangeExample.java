package com.javalab.stream05;

import java.util.stream.IntStream;

// IntStream의 range(int a , int b) 메소드
//	- a부터 b까지의 int타입 숫자 생성해줌
public class RangeExample {
	
	public static void main(String[] args) {
		
		// 1~10까지 정수 생성
		IntStream.range(1, 11)
					.forEach(System.out::println); // .forEach(i -> System.out.println(i));
		
	}

}
