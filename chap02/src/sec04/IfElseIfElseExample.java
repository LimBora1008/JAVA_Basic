package sec04;

public class IfElseIfElseExample { // class S
	public static void main(String[] args) { // main S
		
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 100~90 입니다");
			System.out.println("등급은 A입니다");
		}else if (score>=80) {
			System.out.println("점수가 80~89입니다");
			System.out.println("등급은 B입니다");
		}else if (score>=70) {
			System.out.println("점수가 70~79입니다");
			System.out.println("등급은 C입니다");
		}else {
			System.out.println("점수가 70점 미만입니다");
			System.out.println("둥급은 D 입니다");
		}
		
		
	} // main E

} // class E
