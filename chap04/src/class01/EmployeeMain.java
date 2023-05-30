package class01;

// 실행 클래스

public class EmployeeMain { // class

	public static void main(String[] args) { // main

		// Employee타입 Array(배열) 선언(10칸짜리)
		Employee[] emps = new Employee[10];

		// Raw Data로 각 배열에 객체를 생성해서 저장
	      emps[0] = new Employee("A", 28, 400, "KR", 10, "정규");
	      emps[1] = new Employee("B", 27, 600, "KR", 15, "정규");
	      emps[2] = new Employee("C", 26, 280, "JP", 1, "비정규");
	      emps[3] = new Employee("D", 25, 360, "JP", 2, "비정규");
	      emps[4] = new Employee("E", 23, 270, "RU", 1, "정규");
	      emps[5] = new Employee("F", 27, 390, "AM", 4, "정규");
	      emps[6] = new Employee("G", 31, 330, "SI", 3, "정규");
	      emps[7] = new Employee("H", 35, 280, "CA", 2, "비정규");
	      emps[8] = new Employee("I", 38, 450, "FR", 10, "정규");
	      emps[9] = new Employee("J", 45, 600, "JP", 15, "정규");

		System.out.println("1. 전 사원들의 목록");
		System.out.println("==================================================");
		System.out.printf("이름\t나이\t급여\t    지역\t근무연수\t   사원구분\n");
		System.out.println("--------------------------------------------------");

		// 1.배열을 받아서 전사원 목록을 출력해주는 메소드 호출
		ptintEmployee(emps);

		System.out.println("==================================================");
		
		System.out.println(); // 줄바꿈
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 2. 정규직 평균 급여를 구해주는 메소드 생성(결과 반환)
		// 평균 급여는 : 434.29
		double getSalAvg = getSalAvg(emps);
		
		System.out.printf("2. 정규직 직원들의  평균 급여는 : %.2f \n",getSalAvg);
		// System.out.println("2. 정규직 직원들의  평균 급여는 : " + Math.round(getSalAvg*100)/100.0); 이렇게도 사용
		System.out.println(); // 줄바꿈
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 3. 한국(KR) 사원들의 평균 급여
		// 평균 급여는 : 500.0
		double krSalAvg = getKrSalAvg(emps);
		
		System.out.println("3. 한국 직원들의  평균 급여는 : " + Math.round(krSalAvg*10)/10.0);
		
	} // main

	// 1. 배열을 받아서 출력해주는 메소드
	public static void ptintEmployee(Employee[] emps) {

		for (Employee employee : emps) {
			System.out.println("\"" + employee.getName() + "\" \t" 
									+ employee.getAge() + ", \t" 
									+ employee.getSalary()+ ", \t \"" 
									+ employee.getLocal() + "\" \t  " 
									+ employee.getTerms() + ", \t \"" 
									+ employee.getGubun()+ "\"");
		}
	}
	
	// 2. 정규직 평균 급여를 구해주는 메소드
	public static double getSalAvg(Employee[] emps) {
		double salsum = 0.0;
		int count = 0;
		for (Employee employee : emps) {
			if(employee.getGubun().equals("정규")) {
				salsum += employee.getSalary();
				count++;
			}
		}
		return salsum/count;
	}
	
	// 3. 한국사원들의 평균 급여
	public static double getKrSalAvg(Employee[] emps) {
		double salsum = 0.0;
		int count = 0;
		
		for (Employee employee : emps) {
			if(employee.getLocal().equals("KR")) {
				salsum += employee.getSalary();
				count++;
			}
		}
		return salsum/count;
	}
} // class
