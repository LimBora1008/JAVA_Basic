package com.javalab.collection.pkg03;

import java.util.*;

/*
 * HashSet 예제 클래스
 * - Set < Collection < Iterable 구현
 * - 순서가 없고 중복을 허용하지 않음
 */

public class HashSetExample01 {

	public static void main(String[] args) {

		// HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();

		// 객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // << 중복 객체이므로 저장하지않음
		set.add("iBATIS");

		// 저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체 수: " + size);

	}

}
