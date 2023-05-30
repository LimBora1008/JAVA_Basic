package class07;

// 실행클래스

public class KoreanMain {

	public static void main(String[] args) {

		// Korean 객체 생성
		Korean Kor1 = new Korean("대한민국", "홍길동", "123456-7892837");

		// Korean 객체의 값 읽기
		System.out.println("국적 : " + Kor1.nation);
		System.out.println("성명 : " + Kor1.name);
		System.out.println("주민번호 : " + Kor1.ssn);

		System.out.println();

		// 두번째 Korean 객체 생성
		Korean Kor2 = new Korean("대한민국", "김철수", "951206-4687248");
		
		// 두번째 Korean 객체의 값 읽기
		System.out.println("국적 : " + Kor2.nation);
		System.out.println("성명 : " + Kor2.name);
		System.out.println("주민번호 : " + Kor2.ssn);

		System.out.println();

		// 세번째 Korean 객체 생성
		Korean Kor3 = new Korean("김길동", "951206-4687248");
		
		// 세번째 Korean 객체의 값 읽기
		System.out.println("국적 : " + Kor3.nation);
		System.out.println("성명 : " + Kor3.name);
		System.out.println("주민번호 : " + Kor3.ssn);

	}

}

// 변수이름 한번에 변경하기
// 변수이름에 커서 > alt + shift + r > 이름수정하기 > esc 
