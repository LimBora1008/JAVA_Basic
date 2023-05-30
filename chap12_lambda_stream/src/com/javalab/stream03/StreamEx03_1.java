package com.javalab.stream03;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림 반복문
public class StreamEx03_1 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 90));
		list.add(new Student("신용권", 92));

		// IntStream 얻기(IntStream : int값만 들어있는 별도의 스트림)
		Stream<Student> studentStream = list.stream();

		// 중간 연산 메소드인 mapToInt
		// - student 객체의 int 타입변수의 값만 모아서 IntStream 반환
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore()); // mapToInt : 필드 중 int값만 가져온다

		double avg = scoreStream.average().getAsDouble(); // average : 평균을 구해주는 메소드 , getAsDouble : doubole타입으로 변환
		System.out.println("평균 점수는: " + avg);
	}

}
