package com.javalab.inheritance.exam02;

public class Student extends Human {
	
	//필드
	int stdNo; // 학번
	String major; // 전공
	
	// 생성자
	public Student(String name, int age) {
		super(name, age);
	}

	public Student(String name, int age, int stdNo, String major) {
		super(name, age);
		this.stdNo = stdNo;
		this.major = major;
	}
	

	// 학생정보 출력 메소드
	public void studentInfo() {
		this.humenInfo(); // 부모 정보 출력 메소드
		System.out.println("[Student Info]");
		System.out.println("학번 : "+stdNo);
		System.out.println("전공 : "+major);
	}


}
