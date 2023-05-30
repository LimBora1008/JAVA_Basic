package sec07;

public class Array10Multidim01 {
	public static void main(String[] args) {

		// 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		int[][] mathScores = new int[2][3];
		// mathScores 의 length는 2이다

		// 배열 항목 값 변경
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		// mathScores[0] 의 length는 3이다 ----> 아래 식 int i의 값
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		// mathScores[1] 의 length는 3이다 ---- > 아래식 int k의 값

		// 전체 학생의 수학 평균 구하기
		int totalStudent = 0;
		int totalMathSum = 0;

		for (int i = 0; i < mathScores.length; i++) {
			// i는 mathScores.length(0~1,2개)보다 작다
			totalStudent += mathScores[i].length;
			// mathScores[0~1,2개].length; 누적 더한다

			for (int k = 0; k < mathScores[i].length; k++) {
				totalMathSum += mathScores[i][k];
			}

		}
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
		System.out.println();

		for (int i = 0; i < mathScores.length; i++) { // 1. for1 은 mathScores의 길이(length) 만큼 반복한다

			for (int k = 0; k < mathScores[i].length; k++) { // 2. for2 는 mathScores[0~2] 만큼 반복한다
				System.out.print(mathScores[i][k] + " "); // 3. for2 의 mathScores[0][1~3]째를 출력하고 for1으로 돌아간다
			}
			System.out.println(); // 4. mathScores[0][1]째를 출력하고 한줄을 띄워준다
									// 5. for1으로 돌아간 후 for2의 mathScores[1][1~3]째를 출력한다
		}

		System.out.println(); // 줄바꿈

		// 점수가 90점 이상 되는 학생 수 구하기
		int scores = 0; // 점수
		int count = 0; // 학생 수

		for (int a = 0; a < mathScores.length; a++) { // mathScores의[0]

			for (int b = 0; b < mathScores[a].length; b++) { // mathScores[0][n]
				scores = mathScores[a][b]; // scores는 mathScores[n][n] 의 값

				if (scores >= 90) { // 만약에 mathScores[n][n] 의 값이 90이 넘으면
					count++; // count에 1을 더한다 > for2로 넘어감
				}
			}
			// 여기서 출력하면 mathScores[0~1][0~2] 사이의 90점이 넘는 학생수 각 출력 >> for1을 돌아야하기 때문
		}

		System.out.print("점수가 90점이 넘는 학생수 : " + count + "명"); // 여기서 출력해야 mathScores[0~1][0~2]의 90점이 넘는 학생의 총합이 나옴

	}

}
