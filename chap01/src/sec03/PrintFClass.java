package sec03;

/*
 * printf문
 */

public class PrintFClass { //class S

	public static void main(String[] args) { // main S
		
		// printf 문에 사용하는 타입
		// String type : %s // %s = s는 문자를 의미
		System.out.printf("이름 %s","홍길동"); // printf = 포멧 , 형식을 만들어서 쓴다
		// decimal : %d // %d = d는 숫자를 의미
		System.out.printf("나이 %d",28);
		
		// 순서정하기
		System.out.println(""); // 한줄 띄움
		System.out.printf("이름: %1$s, 나이: %2$d 세, 결혼유무: %3$s","홍길동",28,"미혼"); // 1$,2$ 는 순서를의미
		
		// 정수 숫자 자릿수
		System.out.println(""); // 한줄 띄움
		System.out.printf("%d",123456);
		
		System.out.println(""); // 한줄 띄움
		System.out.printf("6d : %6d",12); // 6d = 전체 자릿수 의미
		
		// 실수 자릿수
		System.out.println(""); // 한줄 띄움
		System.out.printf("%d",1234567890);
		System.out.println(""); // 한줄 띄움
		System.out.printf("10.2f:%10.2f",1234.5678); // 총 10자리, 소숫점 2자리 , 마침표1개
		// 소숫점은 f로 표기 // 전체 10자리 , 소숫점뒤로 2자리까지 표시하겠다 // . 도 한자리 포함
		
		System.out.println(""); // 한줄 띄움
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 :%10.2f",10,area);


	} // main E

} // class E
