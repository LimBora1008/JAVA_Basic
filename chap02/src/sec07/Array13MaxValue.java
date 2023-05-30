package sec07;

// 최대값 찾기
// 출력 결과 : 제일 큰 수는 50

public class Array13MaxValue {

	public static void main(String[] args) {

		// 1. 배열 사용 전
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;

		int max = 0; // 제일 큰 수를 임시보관 할 변수

		if (a > max);		max = a;
		if (b > max);		max = b;
		if (c > max);		max = c;
		if (d > max);		max = d;
		if (e > max);		max = e;
		System.out.println("(배열x)제일 큰 수는: " + max);

		// 2. 향상된 for문
		max = 0; // max 초기화

		int[] f = { a, b, c, d, e };

		for (int g : f) {
			
			if (g > max) {
				max = g;
			}
		}
		System.out.println("(향상for문 사용)제일 큰 수는: " + max);
		
		// 3. 기존for문
		max = 0;

		for (int i = 0; i < f.length; i++) {
			if(f[i] > max) {
				max = f[i];
			}
		}
		System.out.println("(기존for문 사용)제일 큰 수는: " + max);
	}

}
