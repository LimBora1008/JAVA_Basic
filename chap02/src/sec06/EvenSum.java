package sec06;

public class EvenSum { // class S

	public static void main(String[] args) { // main S

		// 1~10 짝수의 합

		int sum2 = 0;
		int sum3 = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				sum2 += i;
			}
			if (i % 3 == 0) {
				sum3 += i;
			}
		}

		System.out.println("\n1~10 짝수의 합" + sum2);
		System.out.println("1~10 3배수의 합" + sum3);

	} // main E

} // class E
