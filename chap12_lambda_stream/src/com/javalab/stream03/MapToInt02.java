package com.javalab.stream03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림 반복문,mapToInt 중간연산 메소드
public class MapToInt02 {
	
	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(
				new Student("홍길동",10),
				new Student("신용권",20),
				new Student("유미선",30)
				);
		
		Stream<Student> studentStream = studentList.stream(); // Stream 객체 생성
		
		// 중간 연산 메소드인 mapToInt
		// - student 객체의 int 타입 변수의 값만 모아서 IntStream 반환
		IntStream scoreStream = // int값만 모아진 IntStream 생성
					studentStream
					.mapToInt(student -> student.getScore()); // .mapToInt(Student :: getScore)
		
		double avg = scoreStream
				.average() // IntStream 에서 평균을 구해주는 메소드
				.getAsDouble(); // 구해진 평균을 double타입으로 변환
		System.out.println("평균 점수는 : "+avg);
		
		
		double avg2 = studentList.stream() // stream 객체 생성
				// [중간처리] 학생객체를 점수로 매핑해서 score를 요소로 갖는 새로운 스트림 생성 = IntStream
				// mapToInt는 함수형 인터페이스인 ToIntFunction타입을 매개변수로 갖고 IntStream을 리턴해줌
				.mapToInt(student -> student.getScore()) // IntStream 객체 생성
				// .mapToInt(Student :: getScore)
				// [최종처리] - 평균점수
				.average() // IntStream에 들어있는 숫자들의 평균을 계산해줌
				.getAsDouble(); // 평균을 Double타입으로 얻어줌
		System.out.println("평균 점수는 : "+avg2);
	}

}
