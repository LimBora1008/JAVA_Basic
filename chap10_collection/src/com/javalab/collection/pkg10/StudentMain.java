package com.javalab.collection.pkg10;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {

		// [문제.1] 1,2,3,4,5,6,7,8,9,10 을 갖는 ArrayList를 생성하고 값을 출력하세요.
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) { //arrayList.add(1); ~
			arrayList.add(i);
		}


		for (Integer list : arrayList) {
			System.out.print(list + " ");
		}

		System.out.println("\n");
		
		/*
		 * [문제.2] 다음 값을 갖는 ArrayList를 생성하고 값을 출력하세요. Volvo Benz BMW Hyundai
		 */

		ArrayList<String> car = new ArrayList<String>();
		car.add("Volvo");
		car.add("Benz");
		car.add("BMW");
		car.add("Hyundai");

//		System.out.println(car.toString());
		for (String myCar : car) {
			System.out.print(myCar + " ");
		}
		
		System.out.println("\n");

		/*
		 * [문제.3] 다음 raw data를 담을 수 있는 Student 클래스를 설계하고
		 * 객체를 생성하여 ArrayList에 담고 출력하세요.
		 * studentId, jumin,          name, year, juso, department
		 * "1234", "123456-1234567", "홍길동", 3, "천안", 210
		 * "5678", "987456-2334567", "김길동", 4, "대전", 220
		 * "8970", "357556-2334789", "이길동", 1, "서울", 230
		 */
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("1234", "123456-1234567", "홍길동", 3, "천안", 210));
		students.add(new Student("5678", "987456-2334567", "김길동", 4, "대전", 220));
		students.add(new Student("8970", "357556-2334789", "이길동", 1, "서울", 230));
		
		for (Student student : students) {
		System.out.println(student.toString());
		}


	}

}

class Student{
	private String studentId;
	private String jumin;
	private String name;
	private Integer year;
	private String juso;
	private Integer department;
	
	public Student() {
		super();
	}

	public Student(String studentId, String jumin, String name, Integer year, String juso, Integer department) {
		this.studentId = studentId;
		this.jumin = jumin;
		this.name = name;
		this.year = year;
		this.juso = juso;
		this.department = department;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getJuso() {
		return juso;
	}

	public void setJuso(String juso) {
		this.juso = juso;
	}

	public Integer getDepartment() {
		return department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", jumin=" + jumin + ", name=" + name + ", year=" + year + ", juso="
				+ juso + ", department=" + department + "]";
	}
	
}