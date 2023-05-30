package class06;

// id        subject  score

public class TakesMain { // class

	public static void main(String[] args) { // main
		
		TakesData td = new TakesData();
		Takes[] takes = td.Data;

		// 성적 객체를 담을 Takes 타입 배열 선언(12칸)
		// Takes[] takes = new Takes[12];

		initData(takes);

		// 1. 전학생 성적 출력(toString 메소드 사용)
		printTakes(takes);

		// 2. 성적이 A+인 학생의 id를 반환받아서 출력하기
		String[] aplus = getAplus(takes);

		for (int i = 0; i < aplus.length; i++) {
			System.out.println(aplus[i]);
		}

	} // main

	// 객체생성 메소드
	public static void initData(Takes[] takes) {
		takes[0] = new Takes("1292001", "C101-01", "B+");
		takes[1] = new Takes("1292001", "C103-01", "A+");
		takes[2] = new Takes("1292001", "C301-01", "A");
		takes[3] = new Takes("1292002", "C102-01", "A");
		takes[4] = new Takes("1292002", "C103-01", "B+");
		takes[5] = new Takes("1292002", "C502-01", "C+");
		takes[6] = new Takes("1292003", "C103-02", "B");
		takes[7] = new Takes("1292003", "C501-02", "A+");
		takes[8] = new Takes("1292301", "C102-01", "C+");
		takes[9] = new Takes("1292303", "C102-01", "C");
		takes[10] = new Takes("1292303", "C103-02", "B+");
		takes[11] = new Takes("1292303", "C501-01", "A+");
	}

	// 성적출력 메소드
	public static void printTakes(Takes[] takes) {
		System.out.println("id\tsubject\tscore");

		for (Takes takes2 : takes) {
			System.out.print(takes2.getId().toString() + "\t");
			System.out.print(takes2.getSubject().toString() + "\t");
			System.out.print(takes2.getScore().toString() + "\n");
		}
		/*
		 * for (Takes takes2 : takes) { System.out.println(takes2.getId() + "\t" +
		 * takes2.getSubject() + "\t" + takes2.getScore()); }
		 */
		System.out.println(); // 줄바꿈
	}

	// A+ 성적 조회 메소드
	private static String[] getAplus(Takes[] takes) {
		String id = "";
		for (Takes takes2 : takes) {
			if (takes2.getScore().equals("A+")) {
				id += takes2.getId() + ",";
			}
		}
		return id.split(",");
	}
} // class
