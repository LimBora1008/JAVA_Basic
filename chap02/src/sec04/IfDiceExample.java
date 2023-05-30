package sec04;

public class IfDiceExample { // class S
	public static void main(String[] args) { // main S

		// 0.0 ~ 1.0 사이의 난수 발생
		int num = (int) (Math.random() * 6) + 1; // 1~6 사이 랜덤한 숫자
		// +1 은 1부터 시작하는 의미

		if (num == 1) {
			System.out.println("1번이 나왔습니다");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다");
		} else {
			System.out.println("6번이 나왔습니다");
		}

	} // main E

} // class E

/*
	if (num == 1) { 
		System.out.println("1번이 나왔습니다"); 
	} if (num == 2) {
		System.out.println("2번이 나왔습니다"); 
	} if (num == 3) {
		System.out.println("3번이 나왔습니다"); 
	} if (num == 4) {
		System.out.println("4번이 나왔습니다"); 
	} if (num == 5) {
		System.out.println("5번이 나왔습니다"); 
	} else { 
		System.out.println("6번이 나왔습니다"); 
	}
 */

// if~else if : 여러가지 조건 중 하나의 값만 출력할때
// if~if : 여러가지 조건 + 여러개의 값을 출력할때