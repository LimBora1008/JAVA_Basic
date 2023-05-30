package class10.vo;

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
public class Professor {

	// 필드
	private String id; // 교수ID
	private String jumin; // 주민번호
	private String name; // 성명
	private int department; // 학과
	private String grade; // grade
	private String hiredate; // 입사일자

	// 생성자
	public Professor() {
	}

	public Professor(String id, String jumin, String name, int department, String grade, String hiredate) {
		this.id = id;
		this.jumin = jumin;
		this.name = name;
		this.department = department;
		this.grade = grade;
		this.hiredate = hiredate;
	}

	// 게터 세터 메소드
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

}
