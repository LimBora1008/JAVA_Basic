package sec04;

public class IfNestedExample { // class S
	public static void main(String[] args) { // main S

		int score = (int) (Math.random() * 20) + 81;
		System.out.println("점수: " + score);

		String grand;

		if (score >= 90) {
			if (score >= 95) {
				grand = "A+";
			} else {
				grand = "A";
			}
		} else {
			if (score >= 85) {
				grand = "B+";
			} else {
				grand = "B";
			}
		}
		
		System.out.println("학점: " + grand);

	} // main E

} // class E
