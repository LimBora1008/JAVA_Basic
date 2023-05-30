package sec03;

// replace 메소드 예제

public class StringReplace { // CS
	
	public static void main(String[] args) { // MS
		
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은  String입니다.";
		String newSrt = oldStr.replace("자바", "JAVA");
		// replace는 기존값을 변환해서 출력(원래값 , 바꿀값)
		
		System.out.println(oldStr);
		System.out.println(newSrt);
		
	} // ME

} // CE
