package class02;

/*
[Professor raw Data]  
교수ID       주민번호          	  성명    	학과  grade 	입사일자
("92001", "590327-1839240", "이태규", 920, "교수", "1997")
("92002", "690702-1350026", "고희석", 910, "부교수", "2003")
("92301", "741011-2765501", "최성희", 910, "부교수", "2005")
("92302", "750728-1102458", "김태석", 920, "교수", "1999")
("92501", "620505-1200546", "박철재", 900, "조교수", "2007")
("92502", "740101-1830264", "장민석", 910, "부교수", "2005")
*/

public class ProfessorMain { // class

	public static void main(String[] args) { // main

		Professor[] professor = new Professor[6];

		professor[0] = new Professor("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		professor[1] = new Professor("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		professor[2] = new Professor("92301", "741011-2765501", "최성희", 910, "부교수", "2005");
		professor[3] = new Professor("92302", "750728-1102458", "김태석", 920, "교수", "1999");
		professor[4] = new Professor("92501", "620505-1200546", "박철재", 900, "조교수", "2007");
		professor[5] = new Professor("92502", "740101-1830264", "장민석", 910, "부교수", "2005");

		System.out.print("교수ID\t주민번호\t\t성명\t학과\tgrade\t입사일자\n");
		System.out.println("========================================================");

		// 교수들의 목록을 출력해주는 메소드 호출
		printProfessor(professor);

		System.out.println("========================================================");

		System.out.println(); // 줄바꿈

		// 910 학과 교수중 입사년도가 2005년인 교수를 출력하는 메소드 호출
		getHireDate2005(professor);

		System.out.println(); // 줄바꿈

		// [과제] 주민번호가 590327-1839240인 이태규 교수가 퇴직했다
		// 새로 입사한 선명규 교수를 그 자리에 저장하세요
		// (빈객체 생성 후 setter 메소드로 값 저장)
		// "96031","790208-1884203","선명규",920,"부교수","2021"

		System.out.print("교수ID\t주민번호\t\t성명\t학과\tgrade\t입사일자\n");
		System.out.println("========================================================");

		// 이태규 > 선명규 교수로 정보변경 후 출력해주는 메소드 호출
		newProfessor(professor);

	} // main

	// 이태규 > 선명규 교수로 정보 변경하는 메소드
	public static void newProfessor(Professor[] professor) {
		// 전체 배열에서 이태규 교수 찾기
		for (int i = 0; i < professor.length; i++) {
			// 이태규 교수 객체이면
			if ((professor[i].getJumin().equals("590327-1839240")) && (professor[i].getName().equals("이태규"))) {

				Professor professor2 = new Professor();

				professor2.setId("96031");
				professor2.setJumin("790208-1884203");
				professor2.setName("선명규");
				professor2.setDepartment(920);
				professor2.setGrade("부교수");
				professor2.setHiredate("2021");

				professor[i] = professor2;
			}
		}
		printProfessor(professor);
	}

	// 교수들의 목록을 출력해주는 메소드
	public static void printProfessor(Professor[] professor) {

		for (Professor professor2 : professor) {
			System.out.println(professor2.getId() + "\t" + professor2.getJumin() + "\t" + professor2.getName() + "\t"
					+ professor2.getDepartment() + "\t" + professor2.getGrade() + "\t" + professor2.getHiredate());
		}

	}

	// 910 학과 교수중 입사년도가 2005년인 교수를 출력하는 메소드
	public static void getHireDate2005(Professor[] professor) {

		System.out.print("910 학과 교수 중 입사년도가 2005년인 교수는 : ");

		for (Professor professor2 : professor) {
			if (professor2.getDepartment() == 910 && professor2.getHiredate().equals("2005")) { // .contains 도 사용가능 : 해당
																								// 단어가 포함되었는가?
				System.out.print(professor2.getName() + "  ");
			}
		}

		System.out.println();
	}

	// 교수들의 목록을 출력해주는 메소드
	public static void printProfessor(Professor professor2) {

		System.out.println(professor2.getId() + "\t" + professor2.getJumin() + "\t" + professor2.getName() + "\t"
				+ professor2.getDepartment() + "\t" + professor2.getGrade() + "\t" + professor2.getHiredate());

	}

} // class
