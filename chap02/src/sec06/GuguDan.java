package sec06;

public class GuguDan {
	public static void main(String[] args) {

		// 구구단 세로
		for (int i = 2; i <= 9; i++) {
			// 2단~9단
			System.out.println("[" + i + "]단");
			for (int j = 1; j <= 9; j++) {
				// 1~9 매단 마다 ( i가 1번 반복할때 j는 9번 반복한다)
				// j <= 9를 만족할때까지 for2를 반복하고 for1으로 돌아간다
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
	}
}

/*
 	이중 for문 : for1이 1번 반복할때 for2는 조건만큼 반복 후 for1로 돌아간다
 	for1(변수선언; 조건; 증감식;){
 		[ 실행문1 ]
 		
 		for2(변수선언; 조건; 증감식;){
 			[ 실행문2 ]
 		}
 	}

*/