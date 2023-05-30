package sec06;

public class ForContinue { // class S

	public static void main(String[] args) { // main S

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
	} // main E

} // class E
