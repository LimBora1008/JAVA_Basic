package sec04;

// 키보드에서 캐릭터(char)를 읽어들이는 예제
// import 구문으로 자바 API사용

import java.io.IOException;

public class Read01KeyCode {
	public static void main(String[] args) throws IOException {
		// throws IOException 는 System.in.read();에서 오류가 생기면 처리하기 위해 사용
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: "+keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: "+keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: "+keyCode);
		
		
	}

}
