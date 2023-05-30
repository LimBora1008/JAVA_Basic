package sec03;

// 비교연산자 예제

public class CompareOperator {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean resuIt1 = (num1 == num2);
		boolean resuIt2 = (num1 != num2);
		boolean resuIt3 = (num1 <= num2);
		System.out.println("resuIt1 ="+resuIt1);
		System.out.println("resuIt2 ="+resuIt2);
		System.out.println("resuIt3 ="+resuIt3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean resuIt4 = (char1 < char2);
		System.out.println("resuIt4 ="+resuIt4);

	}

}
