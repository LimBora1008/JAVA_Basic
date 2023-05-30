package sec07;

import java.util.Scanner;

public class Array20LottoRandom { // class S

	public static void main(String[] args) { // main S

		// 배열 선언
		int[] numArr = new int[6]; // 6개의 공간 담는 배열 선언 (공간확보 초기화 안됨)

		// 세트 입력(Scanner-2byte)
		Scanner scan = new Scanner(System.in); // System.in 1byte
		System.out.println("몇 세트의 난수를 발생시키겠습니까?");
		int set = scan.nextInt(); // 정수 읽기

		// while
		while (set > 0) {
			// 난수 발생 for
			for (int i = 0; i < numArr.length; i++) {
				// 난수 1 ~ 45
				numArr[i] = (int) (Math.random() * 45) + 1;

				for (int j = 0; j < i; j++) {

					if (numArr[j] == numArr[i]) { // 중복방지
						i = i - 1; // 발생한 난수가 동일할경우 i값을 1 줄여서 중복을 방지
						break;
					}
				}
			}
			
			// 한 세트 출력 (향상된 for문)
			for(int i : numArr) {
				System.out.print(i+"\t");
			}
			System.out.println();
			set = set-1; // -1씩 차감(set--)
			
		}

	} // main E

} // class E
