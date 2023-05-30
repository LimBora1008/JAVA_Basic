package sec07;

public class Array19StudentOfMax { // class S

	public static void main(String[] args) { // main S

		// 기본 데이터를 저장하고 있는 배열
		// 1. 학생명 배열
		String[] names = { "최태원", "이경선", "배준섭", "홍원표", "김성현", "우상현", "심미안" };

		// 2. 성적배열
		int[] scores = new int[] { 87, 95, 100, 65, 70, 84, 69 };

		int sum = 0; 	  // 총점
		double avg = 0.0; // 평균

		// 총점구하기
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}

		// 평균구하기
		avg = (sum * 1.0) / scores.length;

		int max = 0;		 	// 큰수 임시 저장 변수
		String maxName = ""; 	// 최고 점수의 학생 저장 변수

		// 최고 점수와 최고 점수 학생명 구함
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {		// 임의의 수와 모든 요소를 비교해가면서 큰수 찾기
				max = scores[i];
				maxName = names[i];
			}
		}
		
		System.out.printf("평균점수는 \" %4.1f\" \n", avg); // %4.1f : 총4칸의 자리에 소수점 첫번째까지 표기
		System.out.printf("최고점은 \" %2d\" 입니다. \n", max);
		System.out.println("최고 성적은 " + maxName + "님 입니다.");

	} // main E
	
	/*public static void main(String[] args) {
		// 학생명 배열
		String[] names = {"최태원","이경선","배준섭","홍원표","김성현","우상현","심미안"};
		
		// 점수배열
		int[] scores = new int[] {87,95,100,65,70,84,69};
		
		double ave = 0.0; // 합계+평균
		int maxval = 0; // 최고점
		String maxvalName = ""; // 최고점수 이름 
		
		for(int i=0; i<names.length; i++) {
			ave += scores[i];
			if(scores[i]>maxval) {
				maxval = scores[i];
				maxvalName = names[i];
			}
		}
		
		System.out.printf("평균점수는 \"%4.1f\"점 입니다 \n",(ave/scores.length));
		System.out.printf("최고점은 \"%d\"점 입니다 \n",maxval);
		System.out.printf("최고성적은 %s님 입니다 \n",maxvalName);
	}*/

} // class E
