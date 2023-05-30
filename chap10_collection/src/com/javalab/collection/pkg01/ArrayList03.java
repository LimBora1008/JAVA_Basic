package com.javalab.collection.pkg01;

import java.util.*;

public class ArrayList03 {

	public static void main(String[] args) {

		ArrayList<Person> people = new ArrayList<>();

		Person person1 = new Person("John", 25);
		Person person2 = new Person("Sarah", 30);

		people.add(person1);
		people.add(person2);
		
		// 추가인원
		// "Mike",27
		// "Jane",18
		people.add(new Person("Mike",27)); // Person타입 people 클래스 변수에 새로운 객체 생성
		people.add(new Person("Jane",18));

		// 향상된 for
		for (Person person : people) {
			System.out.println(person.getName() + " is " + person.getAge() + " years old");
		}
		
		System.out.println();
		
		// 일반 for
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i).getName() + " is " + people.get(i).getAge()+ " years old");
		}

	} // end main

} // end class

// Person 클래스
// public class Person{ 는 불가 
class Person {
	// 필드
	private String name;
	private int age;

	// 생성자
	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 게터 세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
