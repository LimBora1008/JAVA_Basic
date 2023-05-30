package class22;

/*
 * final : 변하지 않는 값을 저장
 */

public class Person {
	
	// 인스턴스 필드
	final String nation = "Korea";
	final String ssn;
	String name;
	
	// 생성자
	public Person(String ssn,String name) {
	this.ssn = ssn;
	this.name = name;
	}

}
