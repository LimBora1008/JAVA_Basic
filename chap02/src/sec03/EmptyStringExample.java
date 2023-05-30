package sec03;

public class EmptyStringExample {
	public static void main(String[] args) {
		
		String hobby = "";
		if(hobby.equals("")) { // 문자열은 equals 로 비교한다
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
		}
		
	}
}
