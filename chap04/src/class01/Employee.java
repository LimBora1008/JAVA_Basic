package class01;

public class Employee {

	// 필드
	private String name; // 이름
	private int age; // 나이
	private int salary; // 급여
	private String local; // 지역
	private int terms; // 근무연수
	private String gubun; // 사원구분

	// 생성자
	public Employee() {

	}

	public Employee(String name, int age, int salary, String local, int terms, String gubun) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.local = local;
		this.terms = terms;
		this.gubun = gubun;
	}

	// 게터/세터 메소드

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getTerms() {
		return terms;
	}

	public void setTerms(int terms) {
		this.terms = terms;
	}

	public String getGubun() {
		return gubun;
	}

	public void setGubun(String gubun) {
		this.gubun = gubun;
	}

}
