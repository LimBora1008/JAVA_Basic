package com.javalab;

import java.util.*;

/*
 * 콘솔 화면에 보여줄 메뉴와 입력된 객체들에 관한 정보를 저장할 ArrayList를
 * 필드로 갖고 있는 클래스
 */
public class MenuSelect {
	// 학생, 교수, 학과, 성적 데이터 저장용 ArrayList 생성 (필드)
	List<Student> studentList = new ArrayList<Student>(); // 학생 ArrayList
	List<Professor> professorList = new ArrayList<Professor>(); // 교수 ArrayList
	List<Department> departmentList = new ArrayList<Department>(); // 학과 ArrayList
	List<Takes> takesList = new ArrayList<Takes>(); // 성적 ArrayList

	// 키보드에서 입력받을 Scanner객체 생성
	Scanner scanner = new Scanner(System.in);
	int ch;

	// 콘솔 화면에서 보여질 메인 메뉴를 보여주는 메소드
	public void displayMenu() {
		System.out.println("==========================================");
		System.out.println("작업을 선택하세요.");
		System.out.println("------------------------------------------");
		System.out.println("1. 학생등록");
		System.out.println("2. 교수등록");
		System.out.println("3. 학과등록");
		System.out.println("4. 성적등록");
		System.out.println("5. 학생조회");
		System.out.println("6. 교수조회");
		System.out.println("7. 학과조회");
		System.out.println("8. 성적조회");
		System.out.println("9. 종료");
		System.out.println("==========================================");
	}

	// 사용자가 키보드로 입력한 값을 입력받는 메소드
	public void selectMenu() {
		while (true) {
			displayMenu();
			System.out.println("작업을 선택하세요");
			ch = scanner.nextInt();

			switch (ch) {

			case 1: // 학생등록
				while (true) {
					System.out.println("1. 학생등록 메뉴를 선택하셨습니다.");
					System.out.print("학번?");
					String id = scanner.next();
					System.out.print("학생명?");
					String name = scanner.next();
					System.out.print("학생 주민번호?");
					String jumin = scanner.next();
					System.out.print("학년?");
					int year = scanner.nextInt();
					System.out.print("주소?");
					String address = scanner.next();
					System.out.print("학과?");
					int department = scanner.nextInt();

					Student student = new Student(id, jumin, name, year, address, department);
					studentList.add(student);

					System.out.println("학생 정보가 성공적으로 저장되었습니다 \n");

					System.out.println("학생 정보를 연속하여 입력하겠습니까?");
					System.out.println("1. 연속입력 2. 전체 메뉴 돌아가기");
					ch = scanner.nextInt();
					switch (ch) { // 학생 연속입력 여부
					case 1: // 연속입력
						continue; // while문 재반복

					default: // 학생 연속입력 빠져나가기
						break;
					}
					break; // 학생입력 빠져나가기
				} // end while
				break; // 전체 메뉴 돌아가기

			case 2: // 교수등록
				while (true) {
					System.out.println("2. 교수등록 메뉴를 선택하셨습니다.");
					System.out.print("교수번호?");
					String id = scanner.next();
					System.out.print("교수명?");
					String name = scanner.next();
					System.out.print("교수 주민번호?");
					String jumin = scanner.next();
					System.out.print("직급?");
					String grade = scanner.next();
					System.out.print("입사일?");
					String hiredate = scanner.next();
					System.out.print("학과?");
					int department = scanner.nextInt();

					Professor professor = new Professor(id, jumin, name, department, grade, hiredate);
					professorList.add(professor);

					System.out.println("교수 정보가 성공적으로 저장되었습니다");
					break;
				} // end while
				break;

			case 3: // 학과등록
				while (true) {
					System.out.println("3. 학과등록 메뉴를 선택하셨습니다.");
					System.out.print("학과코드?");
					int id = scanner.nextInt();
					System.out.print("학과명?");
					String name = scanner.next();
					System.out.print("교실?");
					String office = scanner.next();

					Department department = new Department(id, name, office);
					departmentList.add(department);

					System.out.println("학과 정보가 성공적으로 저장되었습니다");
					break;
				} // end while
				break;

			case 4: // 성적등록
				while (true) {
					System.out.println("4. 성적등록 메뉴를 선택하셨습니다.");
					System.out.print("학번?");
					String id = scanner.next();
					System.out.print("과목?");
					String subject = scanner.next();
					System.out.print("점수?");
					String score = scanner.next();

					Takes takes = new Takes(id, subject, score);
					takesList.add(takes);

					System.out.println("성적 정보가 성공적으로 저장되었습니다");
					break;
				} // end while
				break;

			case 5: // 학생조회
				while (true) {
					System.out.println("5. 학생조회 메뉴를 선택하셨습니다.");
					System.out.print("학번?");
					String id = scanner.next();
					for (Student student : studentList) {
						if (student.getId().equals(id)) {
							System.out.println("학번: " + student.getId() + " / 학생명: " + student.getName() + " / 주민번호: "
									+ student.getJumin() + " / 학년: " + student.getYear() + " / 주소: "
									+ student.getAddress() + " / 학과: " + student.getDepartment());
						} else {
							System.out.println("학생 정보가 없습니다");
						}
					}
					break;
				} // end while
				break;

			case 6: // 교수조회
				while (true) {
					System.out.println("6. 교수조회 메뉴를 선택하셨습니다.");
					System.out.print("교수번호?");
					String id = scanner.next();
					for (Professor professor : professorList) {
						if (professor.getId().equals(id)) {
							System.out.println("교수번호: " + professor.getId() + " / 교수명: " + professor.getName()
									+ " / 주민번호: " + professor.getJumin() + " / 학과번호: " + professor.getDepartment()
									+ " / 직급: " + professor.getGrade() + " / 입사일자: " + professor.getHiredate());
						} else {
							System.out.println("교수 정보가 없습니다");
						}
					}
					break;
				} // end while
				break;

			case 7: // 학과조회
				while (true) {
					System.out.println("7. 학과조회 메뉴를 선택하셨습니다.");
					System.out.print("학과번호?");
					int id = scanner.nextInt();
					for (Department department : departmentList) {
						if (department.getId() == id) {
							System.out.println("학과번호: " + department.getId() + " / 학과명: " + department.getName()
									+ " / 교실: " + department.getOffice());
						} else {
							System.out.println("학과 정보가 없습니다");
						}
					}
					break;
				} // end while
				break;

			case 8: // 성적조회
				while (true) {
					System.out.println("8. 성적조회 메뉴를 선택하셨습니다.");
					System.out.print("학번?");
					String id = scanner.next();
					for (Student student : studentList) {
						for (Takes takes : takesList) {
							if (student.getId().equals(takes.getId())) {
								System.out.println("학생명: " + student.getName() + " / 과목: " + takes.getSubject()
										+ " / 점수: " + takes.getScore());
							} else {
								System.out.println("등록된 성적 정보가 없습니다");
							}
						}

					}
					break;
				} // end while
				break;

			default:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0); // 0-정상적으로 종료
				break;

			}// end switch
		}
	}
}
