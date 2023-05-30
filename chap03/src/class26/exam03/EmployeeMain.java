package class26.exam03;

/*
 * 실행클래스
 * 객체 생성 방식
 * 1. 빈객체 생성 후 값 저장
 * 2. 객체 생성하면서 초기값 전달(값 저장)
 */

public class EmployeeMain {

	public static void main(String[] args) {

		// 1. 빈 객체 생성
		Employee em = new Employee();

		// 1.1 빈 객체의 필드에 값 저장
		em.empNo = 2005031002;
		em.eName = "배준섭";
		em.position = "과장";
		em.salary = 500;

		// 1.2 객체의 정보 출력(조회)
		System.out.println("1. 사원번호 : " + em.empNo);
		System.out.println("2. 사원명 : " + em.eName);
		System.out.println("3. 직급 : " + em.position);
		System.out.println("4. 연봉 : " + em.salary);

		System.out.println(); // 줄바꿈
		
//////////////////////////////////////////////////////////////////////////////////////
		
		// 2. 오버로딩 생성자를 활용한 객체 생성
		// 2021010003 , "김홍철" , "사원" , -250
		Employee em2 = new Employee(202101003, "김홍철", "사원", -250);

		// 2.2 객체의 정보 출력(조회)
		System.out.println("1. 사원번호 : " + em2.empNo);
		System.out.println("2. 사원명 : " + em2.eName);
		System.out.println("3. 직급 : " + em2.position);
		System.out.println("4. 연봉 : " + em2.salary);

		System.out.println(); // 줄바꿈
		
//////////////////////////////////////////////////////////////////////////////////////

		// 3. 객체 배열
		System.out.println("==== 객체 배열을 통한 사원 정보 조회 ====");

		// Employee 배열 5개짜리
		Employee[] emps = new Employee[3]; // Employee객체만 담을수있다
		// emps 는 배열의 참조타입 변수

		emps[0] = new Employee(2023010001, "김수희", "대리", 310);
		emps[1] = new Employee(2023010001, "박미선", "사원", 280);
		emps[2] = new Employee(2023010001, "최무림", "과장", 400);

		// 3.1 첫번째 사원 정보 출력
		System.out.println("1. 사원번호 : " + emps[0].empNo);
		System.out.println("2. 사원명 : " + emps[0].eName);
		System.out.println("3. 직급 : " + emps[0].position);
		System.out.println("4. 연봉 : " + emps[0].salary);
		System.out.println(); // 줄바꿈

		// 3.2 두번째 사원 정보 출력
		System.out.println("1. 사원번호 : " + emps[1].empNo);
		System.out.println("2. 사원명 : " + emps[1].eName);
		System.out.println("3. 직급 : " + emps[1].position);
		System.out.println("4. 연봉 : " + emps[1].salary);
		System.out.println(); // 줄바꿈

		// 3.3 세번째 사원 정보 출력
		System.out.println("1. 사원번호 : " + emps[2].empNo);
		System.out.println("2. 사원명 : " + emps[2].eName);
		System.out.println("3. 직급 : " + emps[2].position);
		System.out.println("4. 연봉 : " + emps[2].salary);
		System.out.println(); // 줄바꿈
		
//////////////////////////////////////////////////////////////////////////////////////

		// 4. for문으로 출력하기
		System.out.println("==== for문을 이용한 출력 ====");
		for (int i = 0; i < emps.length; i++) {
			System.out.println("1. 사원번호 : " + emps[i].empNo);
			System.out.println("2. 사원명 : " + emps[i].eName);
			System.out.println("3. 직급 : " + emps[i].position);
			System.out.println("4. 연봉 : " + emps[i].salary);
			System.out.println(); // 줄바꿈
		}
		
		System.out.println("==== 향상된 for문을 이용한 출력 ====");
		
		for(Employee emps2 : emps) { // Employee는 타입 
			System.out.println("1. 사원번호 : " + emps2.empNo);
			System.out.println("2. 사원명 : " + emps2.eName);
			System.out.println("3. 직급 : " + emps2.position);
			System.out.println("4. 연봉 : " + emps2.salary);
			System.out.println(); // 줄바꿈
		}
		
//////////////////////////////////////////////////////////////////////////////////////

		// 5. 전 사원들의 급여 총액(향상된 for문)
		int sumSal = 0;
		
		for (Employee emp3 : emps) {
			sumSal += emp3.salary;
		}
		System.out.println("전사원의 급여 총액은 "+sumSal+"입니다.");
		
		// 일반 for문
		sumSal = 0;
		for (int i = 0; i < emps.length; i++) {
			sumSal += emps[i].salary;
		}
		System.out.println("전사원의 급여 총액은 "+sumSal+"입니다.");
		

	}

}
