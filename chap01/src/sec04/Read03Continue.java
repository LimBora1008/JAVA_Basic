package sec04;

import java.io.IOException;

public class Read03Continue { // class S
	public static void main(String[] args) throws IOException { // main S
		/*
		int keyCode;
		
		while(true) { // 무한루트문
			keyCode = System.in.read();
			System.out.println("keyCode: "+keyCode);
			if(keyCode == 113) { // q - 113이면
				break; // keyCode가 113과 동일할 경우 실행 // break는 무한루프 종료키
			}
		}
		*/
		
		 int keyCode;
		 char c;
		 while(true) { // 계속해서 키를 입력받는다
			 System.out.println("===============================================");
			 System.out.println("영어 알파벳과 숫자를 입력하세요.");
			 
			 //System.in.read(); 반환값이 int type
			 keyCode = System.in.read(); // 실제로 입력된 key
			 c = (char)keyCode; // 강제 형 변환(문자로 변환)
			 System.in.read(); // 두번째로 입력되는 [CR]에 대응하는 13 _ 의미없는값
			 System.in.read();
			 
			 if(c >= '0' && c <= '9') {
				 System.out.printf("key- %c 매칭 문자 %d 입니다 \n",c,keyCode);
			 }else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))  {
				 System.out.printf("key- %c 매칭 문자 %d 입니다 \n",c,keyCode);				
			} 	
			 
		 }
		 
	} // main E
	
} // class E

// 간편단축키
// 컨트롤 + D >> 한줄삭제
// 알트 +화살표 >> 코드이동
// 쉬프트+엔터 >> 밑에 줄추가
