package sec06;

// 1부터 100까지 합구하기

public class For1To100Sum {
	public static void main(String[] args) {

		int sum = 0;
		int i;

		// for(int i=1;, << 위에 int 선언 없으면
		for (i = 1; i <= 100; i++) {
			// sum += i;
			sum = sum+i;
		}
		
		System.out.println("1~" + (i-1)+ "합 :" + sum); // (i-1)는 for문을 나오면 101이 되므로 1을 빼준다
	}

}
