package com.javalab.stream01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		
		// 1. 컬렉션 생성
		Set<String> set = new HashSet<String>();
		set.add("홍길동"); // 컬랙션 객체 생성
		set.add("김자바");
		set.add("정명훈");
		set.add("김채훈");
		
		Stream<String> stream = set.stream(); // set객체를 스트림 타입으로 변환
		stream.forEach(name -> System.out.println(name)); // forEach : 반복
		// name : 변수 (set 객체를 하나씩 뽑아와서 저장 할 임시변수)
	}
}
