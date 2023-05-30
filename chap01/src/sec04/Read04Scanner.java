package sec04;

import java.util.Scanner;

/*
 * Scanner 클래스를 이용하여 2byte씩 읽어오기
 * import : java.lang 패키지에 들어 있지 않은 라이브러리(API)를 사용할때
 * 해당 라이브러리를 사용하겠다고 선언해주는것
 * java.util.Scanner : java.util 패키지에 있는 Scanner 를 사용겠다고 선언
 */

public class Read04Scanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \""+inputData+"\"");
			if(inputData.equals("q")) {
				break;
			}
		}
		System.out.println("종료");

	}

}
