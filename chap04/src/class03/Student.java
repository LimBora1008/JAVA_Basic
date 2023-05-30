package class03;

// 라이브러리 클래스

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

public class Student {

	// 필드
	private String id;
	private String jumin;
	private String name;
	private int year;
	private String address;
	private int department;

	// 생성자
	public Student() {

	}

	public Student(String id, String jumin, String name, int year, String address, int department) {
		this.id = id;
		this.jumin = jumin;
		this.name = name;
		this.year = year;
		this.address = address;
		this.department = department;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

}
