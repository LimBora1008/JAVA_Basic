package class10;

import class10.vo.Department;
import class10.vo.MakeData;
import class10.vo.Professor;
import class10.vo.Student;
import class10.vo.Takes;

// 학사 행정 실행클래스
// - 특징으로는 두 개의 객체를 조인해서 결과를 뽑아낸다.(학생정보+학과정보)

public class SchoolManagementMain { // class

	public static void main(String[] args) { // main
		
		MakeData makeData = new MakeData();
		Student[] students = makeData.students;
		Department[] departments = makeData.departments;
		Takes[] takes = makeData.takes;
		Professor[] professor = makeData.professor;

		// 문제1 전체 학생 명단을 출력하시오
		System.out.println("1. 전체 학생 명단+학과");
		System.out.println("id \t name \t jumin \t\t year \t address \t department \t department name");
		for (Student stu : students) { // 학생데이터
			for (Department dep : departments) { // 학과데이터
				if (dep.getId() == stu.getDepartment()) { // 학과데이터의 id와 학생데이터의 department가 같으면 실행
					System.out.println(stu.getId() + "\t " + stu.getName() + "\t " + stu.getJumin() + "\t "
							+ stu.getYear() + "\t  " + stu.getAddress() + "\t\t " + stu.getDepartment() + "\t\t  "
							+ dep.getName());
				}
			}
		}

		System.out.println(); // 줄바꿈

		// 문제2 학생명단+과목코드+성적
		System.out.println("2. 학생 명단+과목코드+성적");
		System.out.println("id \t name \t jumin \t\t year \t address \t department \t subject \t score");
		for (Student stu : students) {
			for (Takes tak : takes) {
				if (stu.getId().equals(tak.getId())) {
					System.out.println(stu.getId() + "\t " + stu.getName() + "\t " + stu.getJumin() + "\t "
							+ stu.getYear() + "\t  " + stu.getAddress() + "\t\t " + stu.getDepartment() + "\t\t "
							+ tak.getSubject() + "\t " + tak.getScore());
				}
			}
		}

		System.out.println(); // 줄바꿈

		// 문제3 컴퓨터공학과 교수들을 모두 조회하세요
		System.out.println("3. 컴퓨터공학과 교수들을 모두 조회하시오");
		System.out.println("id \tjumin \t\tname \tdepartment \tgrade");
		int id = 0;
		String dep2 = "컴퓨터공학과";
		
		for (Department dep : departments) {
			if (dep.getName().equals(dep2)) {
				id = dep.getId();
			}
		}

		for (Professor pro : professor) {
			if (id == pro.getDepartment()) {
				System.out.println(pro.getId() + "\t" + pro.getJumin() + "\t" + pro.getName() + "\t" + pro.getDepartment() + "\t\t" + pro.getGrade());
			}
		}

		System.out.println(); // 줄바꿈

	} // main

} // class
