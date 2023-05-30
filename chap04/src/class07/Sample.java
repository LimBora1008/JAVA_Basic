package class07;

public class Sample {
	
	// 필드
	private int id;
	private String name;
	
	// 생성자
	public Sample() {
	}

	public Sample(int id,String name) {
		this.id = id;
		this.name = name;
	}

	// 게터 세터 메소드
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
