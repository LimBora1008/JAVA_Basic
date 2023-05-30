package com.javalab.stream04;

import java.util.Arrays;
import java.util.List;

public class FilteringExample02 {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("홍길동","신용권","김자바","신용권","신민철");
		
		names.stream()
			.distinct() /* 중복을 제거하는 새로운 스트림 생성 */
			.filter(s -> s.equals("홍길동")) // 원하는 값만 거른다 // 중간연선 - 반복적으로 적용 가능
			.forEach(name -> System.out.println(name)); // 최종연산 - 모든요소를 소비
		System.out.println();
		
		names.stream()
			.filter(name -> name.startsWith("신")) // startsWith : "신" 으로 시작하는 값만
			.forEach(name -> System.out.println(name));
		System.out.println();
		
		names.stream()
			.distinct()
			.filter(name -> name.startsWith("신"))
			.forEach(name -> System.out.println(name));
		
	}

}
