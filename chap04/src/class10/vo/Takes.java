package class10.vo;

/*
"1292001", "C101-01", "B+"
"1292001", "C103-01", "A+"
"1292001", "C301-01", "A"
"1292002", "C102-01", "A"
"1292002", "C103-01", "B+"
"1292002", "C502-01", "C+"
"1292003", "C103-02", "B"
"1292003", "C501-02", "A+"
"1292301", "C102-01", "C+"
"1292303", "C102-01", "C"
"1292303", "C103-02", "B+"
"1292303", "C501-01", "A+"
 */

public class Takes {

	// 필드
	private String id; // 학번
	private String subject; // 과목
	private String score; // 성적

	// 생성자
	public Takes() {
	}

	// 게터 세터 메소드
	public Takes(String id, String subject, String score) {
		this.id = id;
		this.subject = subject;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

}
