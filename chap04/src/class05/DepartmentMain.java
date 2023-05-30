package class05;

/* 
 * 학과 클래스
 * id name office
 * 920,"컴퓨터공학과","201호"
 * 923,"산업공학과","207호"
 * 925,"전자공학과","308호"
 */

public class DepartmentMain { // class

	public static void main(String[] args) { // main
		
		DepartmentData dd = new DepartmentData(); // DepartmentData 객체의 주소가 dd에 저장된다
		Department[] departments = dd.departments; // DepartmentData 객체의 필드를 갖고온다
		
		
		// Department 타입의 배열 변수
		// Department[] departments = new Department[3];

		// 기초데이터 생성
		// initData(departments);

		// 1. 학과 목록을 출력하시오
		System.out.println("1. 학과 목록 출력");
		printDepartment(departments);

		// 2. 학과 코드(id)가 "923"인 학과의 코드(id),name,office를 출력하시오
		System.out.println("2. 923학과 목록 출력");
		getDepartment(departments);

		// 3. 컴퓨터공학과의 교실을 조회해서 main메소드에서 출력하시오
		System.out.println("3. 컴퓨터공학과의 교실 출력");
		String office = getoffice(departments);

		System.out.println("컴퓨터공학과의 교실은 : " + office);

	} // main

	// 기초데이터 메소드
	public static void initData(Department[] departments) {
		departments[0] = new Department(920, "컴퓨터공학과", "201호");
		departments[1] = new Department(923, "산업공학과    ", "207호");
		departments[2] = new Department(925, "전자공학과    ", "308호");
	}

	// 학과목록 메소드
	public static void printDepartment(Department[] departments) {
		System.out.println("===================================");
		System.out.print("id\tname\t\toffice \n");
		System.out.println("===================================");

		for (Department department : departments) {
			System.out.print(department.getId() + "\t" + department.getName() + "\t" + department.getOffice() + "\n");
		}
		System.out.println(); // 줄바꿈
	}

	// 923학과 목록 메소드
	public static void getDepartment(Department[] departments) {
		System.out.println("===================================");
		System.out.print("id\tname\t\toffice \n");
		System.out.println("===================================");

		for (Department department : departments) {
			if (department.getId() == 923) {
				System.out.print(
						department.getId() + "\t" + department.getName() + "\t" + department.getOffice() + "\n");
			}
		}
		System.out.println(); // 줄바꿈
	}

	// 컴퓨터 공학과 교실조회 메소드
	public static String getoffice(Department[] departments) {
		String office = "";
		for (Department department : departments) {
			if (department.getName().equals("컴퓨터공학과")) {
				office = department.getOffice();
			}
		}
		return office;
	}

} // class
