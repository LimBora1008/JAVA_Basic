package sec04;

import java.io.IOException;

public class Read02Char {
	public static void main(String[] args) throws IOException {
		int i = System.in.read(); // 정수 int형으로 1바이트를 읽어온다 (한글깨짐)
		char c = (char)i;
		// 숫자가 아니라 'a'이렇게 문자로 바로 비교가 됨.
		
		if(c >= 'a' && c <= 'z') {
			System.out.println(i);
			System.out.println("입력된 문자는 영어 소문자 입니다.");
		}
		if(c >= 'A' && c <= 'Z') {
			System.out.println(i);
			System.out.println("입력된 문자는 영어 대문자 입니다.");
		}
		if (c >= '0' && c <= '9') {
			System.out.println(i);
			System.out.println("입력된 문자는 숫자입니다.");
		}
			
		
	}

}