package sec05;

public class SwitchCharExample { // class S
	public static void main(String[] args) { // main S

		char grand = 'B';

		switch (grand) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
			break;
		}

	} // main E

} // class E
