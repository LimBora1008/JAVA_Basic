package com.javalab.collection.pkg01;

import java.util.*;

public class ArrayList02 {
	
	public static void main(String[] args) {
		
		//ArrayList 컬렉션 객체 생성(10칸짜리)
		ArrayList<Integer> list1 = new ArrayList<>(10);
		list1.add(5); // new Integer(5) 와 동일
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// public List<E> subList
		ArrayList<Integer> list2 = new ArrayList<>(list1.subList(1, 4)); // subList : 인덱스 ~ 인덱스까지 불러오기(subString과 유사)
		print(list1,list2);
		System.out.println();
		
		// 정렬(String)
		Collections.sort(list1); // list1과 list2를 정렬한다(Collections.sort())
		Collections.sort(list2); // Collections.sort(List 1)
		print(list1,list2);
		
		
	} // end main

	private static void print(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);
		System.out.println();
	}

} // end class
