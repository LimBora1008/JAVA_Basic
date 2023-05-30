package sec03;

public class StringClassTest { // class S
	
	public static void main(String[] args) { // main S
		
		String str1 = "홍길동"; // str1과 str2는 완전히 같은 객체
		String str2 = "홍길동"; // 즉 두 객체 변수는 같은 객체를 바라보고 있다
		String str3 = new String("홍길동"); // str3은 전혀 다른 객체
		
		// 이들의 메모리 번지를 찍어보자
		System.out.println("str1 hashcode:"+System.identityHashCode(str1));
		System.out.println("str2 hashcode:"+System.identityHashCode(str2));
		System.out.println("str3 hashcode:"+System.identityHashCode(str3));
		
		// String타입의 객체비교시 == 를 사용하면 객체의 번짓수를 비교한다
		if(str1 == str2) {
			System.out.println("str1과 str2의 번짓수는 같다");
		}
		if(str1 == str3) {
			System.out.println("str1 == str3 true");
		}else {
			System.out.println("str1 == str3 false");
		}
		
		// String타입의 객체의 번짓수가 아닌 내용을 비교할때 equals 사용
		if(str1.equals(str3)) {
			System.out.println("str1과 str3가 갖고 있는 값은 같다"); // 결과는 같다
		}else {
			System.out.println("str1과 str3가 갖고 있는 값은 다르다");
		}

	} // main E

} // class E
