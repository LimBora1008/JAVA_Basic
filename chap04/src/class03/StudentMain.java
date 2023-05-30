package class03;

// 실행클래스

/*
[학생명단]
  학번			주민번호			이름	 학년	  주소		학과
"1292001", "900424-1825409", "김광식", 3, "서울", 92
"1292002", "900305-1730021", "김정현", 3, "서울", 20
"1292003", "891021-2308302", "김현정", 4, "대전", 55
"1292301", "890902-2704012", "김현정", 2, "대구", 78
"1292303", "910715-1524390", "박광수", 3, "광주", 54
"1292305", "921011-1809003", "김우주", 4, "부산", 88
"1292501", "900825-1506390", "박철수", 3, "대전", 73
"1292502", "911011-1809003", "백태성", 3, "서울", 95
 */

public class StudentMain { // class

	public static void main(String[] args) { // main

		Student[] student = new Student[8];

		// 학생 데이터를 생성해주는 메소드를 만드세요
		initData(student);

		// 학생 목록을 출력하는 메소드를 만드세요
		System.out.println("1. 학생목록 출력하기");
		printStudent(student);

		// 여학생들의 명단을 출력하시오
		System.out.println("2. 여학생목록 출력하기");
		printWomanStudent(student);

		// 서울에 사는 3학년 학생들의 이름을 구해주는 메소드를 만들고
		// 반환받은 이름을 main메소드에서 출력하세요
		System.out.println("3. 서울사는 3학년 출력하기");
		String[] seoulStudent = getSeoulStudent(student); // 반환받은 값을 String타입 배열로 저장

		for (String seoulStudent2 : seoulStudent) {
			System.out.print(seoulStudent2 + "\t");
		}

		System.out.println(); // 줄바꿈

	} // main

	// 학생 데이터를 생성해주는 메소드 생성
	public static void initData(Student[] student) {

		student[0] = new Student("1292001", "900424-1825409", "김광식", 3, "서울", 92);
		student[1] = new Student("1292002", "900305-1730021", "김정현", 3, "서울", 20);
		student[2] = new Student("1292003", "891021-2308302", "김현정", 4, "대전", 55);
		student[3] = new Student("1292301", "890902-2704012", "김현정", 2, "대구", 78);
		student[4] = new Student("1292303", "910715-1524390", "박광수", 3, "광주", 54);
		student[5] = new Student("1292305", "921011-1809003", "김우주", 4, "부산", 88);
		student[6] = new Student("1292501", "900825-1506390", "박철수", 3, "대전", 73);
		student[7] = new Student("1292502", "911011-1809003", "백태성", 3, "서울", 95);

	}

	// 학생 목록 출력하는 메소드
	public static void printStudent(Student[] student) {
		System.out.print("학번 \t 주민번호 \t\t 이름 \t학년 \t주소 \t학과 \n");
		for (Student printStudent : student) {
			System.out.println(printStudent.getId() + "\t" + printStudent.getJumin() + "\t" + printStudent.getName()
					+ "\t" + printStudent.getYear() + "\t" + printStudent.getAddress() + "\t"
					+ printStudent.getDepartment());
		}

		System.out.println(); // 줄바꿈
	}

	// 여학생 목록 출력하는 메소드
	public static void printWomanStudent(Student[] student) {

		System.out.print("학번 \t 주민번호 \t\t 이름 \t학년 \t주소 \t학과 \n");
		for (Student student2 : student) {

			if ((student2.getJumin().substring(7, 8)).equals("2")) {
				System.out.println(student2.getId() + "\t" + student2.getJumin() + "\t" + student2.getName() + "\t"
						+ student2.getYear() + "\t" + student2.getAddress() + "\t" + student2.getDepartment());
			}
		}
		System.out.println(); // 줄바꿈
	}

	// 서울에 사는 3학년 학생들의 이름을 구하는 메소드
	public static String[] getSeoulStudent(Student[] student) {
		String arrName = ""; // 학생들 목록 임시저장 변수

		for (Student student2 : student) {
			if (student2.getAddress().equals("서울") && student2.getYear() == 3) {
				arrName += student2.getName() + ",";
			}
		}

		return arrName.split(","); // arrName에 담겨있는 목록을 "," 로 구분하여 배열로 전달한다
	}

} // class

// indexof : 문자열의 찾는 문자의 인덱스를 찾는다(indexof("a") : 문자열에서 a는 몇번째 인덱스에 있는가? 
// split : 문자열을 구분자로 나눈다 -> 배열로 저장된다
// substring : 문자열에서 인덱스만큼 불러온다
// ㄴ substring(7, 8) : 문자열 인덱스 7 ~ 8 까지 불러온다(마지막 8번째는 생략)
