package sec06;

import java.util.*;

public class LoginCheck {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("아이디를 입력하세요");
		String id = scanner.nextLine();

		if (id.equals("java")) {
			System.out.println("패스워드를 입력하세요");
			String pw = scanner.nextLine();
			
			if (pw.equals("1234")) {
				System.out.printf("%s님 환영합니다\n", id); // %있는곳에 값이 들어간다 s는타입(String) \n은 줄바꿈
			} else {
				System.out.println("패스워드가 맞지 않습니다");
			}
			
		} else {
			System.out.println("아이디가 맞지 않습니다");
		}

	}

}
