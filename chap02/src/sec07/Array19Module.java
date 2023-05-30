package sec07;

public class Array19Module { // class S

	public static void main(String[] args) { // main S

		// array
		String[] names = { "최태원", "이경선", "배준섭", "홍원표", "김성현", "우상현", "심미안" };
		int[] scores = new int[] { 87, 95, 100, 65, 70, 84, 69 };

		// 총점
		int sum = 0;
		// 평균
		double avg = 0.0;

		// 총점 구하는 메소드 호출 ( sum메소드(scores) )
		sum = sum(scores);

		// 평균구하기
		avg = (sum * 1.0) / scores.length;

		System.out.printf("평균점수는 \" %4.1f\" \n", avg); // %4.1f : 총4칸의 자리에 소수점 첫번째까지 표기
		
		// 최고점수와 최고점수의 학생출력
		maxScore(names, scores);

		
	} // main E

	// 최고점수와 최고점수 학생명을 구하는 메소드
	private static void maxScore(String[] names, int[] scores) { // maxScore S

		int max = 0; 		 // 큰수 임시 저장 변수
		String maxName = ""; // 최고 점수의 학생 저장 변수

		// 최고 점수와 최고 점수 학생명 구함
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) { // 임의의 수와 모든 요소를 비교해가면서 큰수 찾기
				max = scores[i];
				maxName = names[i];
			}
		}

		System.out.println();
		System.out.printf("최고점은 \" %2d\" 입니다. \n", max);
		System.out.println("최고 성적은 " + maxName + "님 입니다.");
				
	} // maxScore E

	// 합계 계산 메소드
	private static int sum(int[] scores) { // 반환타입이 int형

		int sum = 0;
		// 총점구하기
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}

		return sum;
		
	} // sum E

} // class E
