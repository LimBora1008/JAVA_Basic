package sec07;

// Array00NullPointerException
// - 메모리에 공간이 안만들어진 상태에서 특정 요소의 값에 접근할 경우 발생
// - 참조하는 메모리 공간이 없는 상태
// - 스택영역에는 변수이름+메모리주소 가 들어간다
// - 힙영역에는 변수안의 값이 들어간다

public class Array00NullPointerException {
	public static void main(String[] args) {
		
		int[] intArray = null; // intArray변수 선언만 
		intArray = new int[3]; // intArray변수에 힙 영역 3칸 제공
		intArray[0] = 10; // NullPointerException // intArray변수 힙영역 첫번째에 10을 부여 // 0번째 1번째 2번째 (총3칸)
		System.out.println(intArray[0]); // 값은 10이다
		
		String str = null; 
		str = "안녕하세요."; // str의 타입이 String[객체]이므로 new로 값을 지정하지 않아도 힙 영역에 생성
		// String타입(참조타입)도 new로 값을 지정 할 수 있지만 굳이 안해도 ㄱㅊ
		// new로 만들면 같은값이여도 주소가 달라진다 > 내용물을 비교하려면 .equals를 사용한다
		// NullPointerException
		System.out.println("총 문자 수: "+str.length());
		
	}

}
