package sec07;

// 향상된 for문

public class Array12AdvancedFor {

	public static void main(String[] args) {

		// 배열 변수 선언과 배열 생성
		int[] scores = { 95, 71, 84, 93, 87 };

		// 배열 항목 전체 합 구하기
		int sum = 0;

		for (int score : scores) { // 향상된 for문
			// scores에 있는 값을 한개씩 꺼내오겠다
			sum += score;
			// scores에서 꺼내온 값(score)을 sum에 누적 더한다
		}

		System.out.println("점수 총합 = " + sum);

		// 배열 할목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);

	}

}
