package sec07;

// 서울의 월별 평균기온이다.
// 연평균 기온을 구하세요

public class Array17SeoulTemp {

	public static void main(String[] args) {

		float[] monTemp = new float[] { -2.5f, -0.2f, 5.2f, 12.1f, 17.4f, 21.9f, 24.9f, 29.4f, 27.8f, 14.4f, 6.9f,
				0.2f };

		float sum = 0.0f; // 월별 기온 총합
		double avg = 0.0; // 연평균 기온

		for (int i = 0; i < monTemp.length; i++) {
			sum += monTemp[i];
		}

		avg = sum / monTemp.length;
		System.out.printf("서울의 연평균 기온 : %.2ff \n", avg);

		// 가장 더운 달 찾기
		float max = 0.0f;
		int count = 0;

		for (int f = 0; f < monTemp.length; f++) {

			if (monTemp[f] > max) {
				max = monTemp[f];
				count = f+1;
			}
		}
		System.out.printf("가장더운기온: %.1ff \n", (float) max);
		System.out.printf("가장더운달: %d월", (int) count);

	}

}
