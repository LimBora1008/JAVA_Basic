package com.javalab.collection.pkg01;

import java.util.ArrayList; // ArrayList 라이브러리 위치

public class ArrayList01 {

	public static void main(String[] args) {

		// Arraylist 생성
		ArrayList<String> fruits = new ArrayList<>(); // 10칸짜리 String 담을 공간 확보

		// 값 저장
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");

		// 크기 조회
		int size = fruits.size();
		System.out.println("ArrayList 사이즈: " + size);

		// 인덱스를 이용한 값 조회
		String fruit = fruits.get(1);
		System.out.println("인덱스 1: " + fruit);

		// 반복(iterate) for-each loop
		for (String f : fruits) {
			System.out.println(f);
		}

		// 바나나 삭제
		fruits.remove("banana"); // fruits.remove(1); 이것도 가능
		System.out.println("Elements of the ArrayList after removal:");
		for (String f : fruits) {
			System.out.println(f);
		}

	}

}
