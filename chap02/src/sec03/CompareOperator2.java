package sec03;

import java.util.Scanner;

public class CompareOperator2 { // class S
	public static void main(String[] args) { // main S
		Scanner scanner = new Scanner(System.in);
		char ch = ' ' ; // char 타입은 반드시 ' '로 초기화 
		
		System.out.printf("영문자와 숫자 또는 한글을 입력하세요.");
		String input = scanner.nextLine(); // 한 문장을 통째로 읽어온다. (문자열)
		ch = input.charAt(0); // 읽어온 문자열에서 맨 첫 글자를 취한다.
		
		// 숫자
		if('0' <= ch && ch <= '9') {
			System.out.printf("key- %c 매핑 유니코드는 %d 입니다.",ch,(int)ch);
		}
		// 영어 소문자
		if('a' <= ch && ch <= 'z') {
			System.out.printf("key- %c 매핑 유니코드는 %d 입니다",ch,(int)ch);
		}
		// 영어 대문자
		if('A' <= ch && ch <= 'Z') {
			System.out.printf("key- %c 매핑 유니코드는 %d 입니다",ch,(int)ch);
		}
		// ㄱ~ㅎ
		if('ㄱ' <= ch && ch <= 'ㅎ') {
			System.out.printf("key- %c 매핑 유니코드는 %d 입니다",ch,(int)ch);
		}
		
	} // main E

} // class E

// 블럭지정 후 컨트롤+알트+화살표 아래 >> 복사가능