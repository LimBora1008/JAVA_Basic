package com.javalab.collection.pkg06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {

		// Map 컬렉션 생성 : Map(키값 ,원소값) , 엔트리: 키+원소
		// key값은 중복되면 안된다 value(원소)는 중복 가능
		Map<String, Integer> map = new HashMap<String, Integer>(); // Map :인터페이스 , HashMap: Map의 구현클래스

		// 객체 저장 (map.put(key,value);)
		map.put("신용권", 85);
		map.put("홍길동", 90); // key값이 중복됨
		map.put("동장군", 80);
		map.put("홍길동", 95); // key값이 중복되면 제일 마지막 정보가 저장된다
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();

		// 키로 값 얻기
		String key = "홍길동";
		int value = map.get(key); // get메소드 : 객체.get(key)
		System.out.println(key + ": " + value);
		System.out.println();

		// 키 Set 컬렉션을 얻고 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet(); // 모든 키를 Set 컬렉션에 담아서 반환
		// keySet.iterator() 반복자 리턴
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String k = keyIterator.next(); // k의 타입은 String(이름)
			Integer v = map.get(k); // 점수
			System.out.println(k + ": " + v);
		}
		System.out.println();

		// 키로 엔트리 삭제
//		map.remove("홍길동");
		Integer score = map.remove("홍길동"); // 삭제된 키와 맵핑되는 값을 반환
		System.out.println("score: "+score);
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
	}
}
