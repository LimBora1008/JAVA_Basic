package sec01;

/*
 * 변수의 사용 범위(scope)
 */

public class VeriableScopeExample { // class S
	
	public int v8; // 전역변수

	public static void main(String[] args) { // main S
		
		int v1 = 15; // 지역변수
		int v2 = 0; // 사용하려면 주석 풀어야함
		if(v1 > 10) {
			// int v2 = v1 - 10; // 사용불가
			v2 = v1 - 10;
		}
		int v3 = v1+v2+5; // v2변수를 사용할 수 없기 때문에 컴파일 에러 발생
		
	} // main1 E
	
	public void main2() { // main2 S
		System.out.println(v8); // 권역변수이기 때문에 사용가능
		
	} // main2 E

} // class E
