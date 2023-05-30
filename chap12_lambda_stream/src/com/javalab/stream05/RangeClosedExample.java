package com.javalab.stream05;

import java.util.stream.IntStream;

/*
 * [IntSteam]
 * - int 기본형 요소를 처리하는 스트림
 * rangeCLosed(int a , int b) : a~b 까지의 int타입 자료 생성
 */
public class RangeClosedExample {

	public static int sum; // int값 누적할 변수 (전역변수)

	public static void main(String[] args) {

		// 1~100까지의 정수를 갖는 스트림 생성
		IntStream intStream = IntStream.rangeClosed(1, 100); // range : 뒤에오는 마지막 숫자 포함x  , rangeClosed : 뒤에오는 마지막 숫자 포함o
		intStream.forEach(a -> {
			sum += a;
		}); // 스트림 반복

		System.out.println("총합: " + sum);

	}

}
