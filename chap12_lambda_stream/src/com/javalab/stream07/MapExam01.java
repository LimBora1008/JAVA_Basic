package com.javalab.stream07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * map()메소드
 * 중간연산을 메소드 체이닝으로 여러개 연결
 * 	- filter() , map() , map()
 * 최종연산
 * 	- collect()메소드
 */

public class MapExam01 {
	
	public static void main(String[] args) {
		
		List<Menu> menu = new ArrayList<Menu>();
		menu.add(new Menu("호박전",200));
		menu.add(new Menu("땅콩 강정",100));
		menu.add(new Menu("버터통닭",320));
		menu.add(new Menu("간장게장",250));
		menu.add(new Menu("햄소세지볶음",350));
		
		List<String> highCaloricDish = 
				menu.stream() // Stream<Menu> 스트림 객체 생성
				.filter(d -> d.getCalories() > 300) // [중간연산] 고칼로리 요리 필터링
				.map(m -> m.getName()) // [중간연산]map: 요리명만 추출하여 별도의 stream으로 만든다
				// .map(Menu :: getName)
				.limit(3) // [중간연산]선착순 3개만 선택
				.collect(Collectors.toList()); // [최종연산] collect(Collectors.toList()):stream > ArrayList로 변경
		
		// List를 스트림으로 만들어서 반복
		highCaloricDish.stream()
				.forEach(m->System.out.println(m));
				// .forEach(System.out::println);
		
	}

}
