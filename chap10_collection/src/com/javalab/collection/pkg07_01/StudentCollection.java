package com.javalab.collection.pkg07_01;

import java.util.*;

public class StudentCollection {

	public static void main(String[] args) {

		// ArrayList 생성
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("John", 87));
		list.add(new Student("Mary", 90));
		list.add(new Student("Bob", 85));

		System.out.println(list.toString());
		System.out.println(); // 줄바꿈

		// HashSet 생성 (출력 순서x,중복 허용x)
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("John", 87));
		set.add(new Student("Mary", 90));
		set.add(new Student("Bob", 85));

//		System.out.println(set.toString()); 이것도 가능

		// 반복자도 가능
//		Iterator<Student> iter = set.iterator();
//		while (iter.hasNext()) {
//			Student stu = iter.next();
//			System.out.println(stu.getName());
//		}
//		

		for (Student student : set) {
			System.out.println("Student [name=" + student.getName() + ", Score=" + student.getScore() + "]");
		}
		System.out.println(); // 줄바꿈

		// HashMap 생성
		Map<Integer, Student> map = new HashMap<>();
		// Student 객체 생성
		Student stu1 = new Student(1, "John", 87);
		Student stu2 = new Student(2, "Mary", 90);
		Student stu3 = new Student(3, "Bob", 85);

		map.put(stu1.getStudentId(), stu1); // map객체에 키값,내용 부여
		map.put(stu2.getStudentId(), stu2);
		map.put(stu3.getStudentId(), stu3);

		// 반복자 생성
		Set<Integer> keySet1 = map.keySet(); // map객체 중 key값만 뽑아서 Set객체로 리턴
		Iterator<Integer> keyIterable = keySet1.iterator();
		while (keyIterable.hasNext()) { // 객체.hasNext : 남은 객체가 있는가?
			Integer k = keyIterable.next(); // key값을 k에 저장한다
			Student v = map.get(k); // 키값에 맞는 정보
			System.out.println(v);

		}

	} // end main

} // end class

class Student {

	// 필드
	private String name;
	private int score;
	private Integer studentId;

	// 생성자
	public Student() {
	}

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public Student(Integer studentId, String name, int score) {
		this.name = name;
		this.score = score;
		this.studentId = studentId;
	}

	// 게터 세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	// toString 오버라이딩
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

}
