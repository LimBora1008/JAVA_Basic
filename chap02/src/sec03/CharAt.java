package sec03;

public class CharAt { //CS
	public static void main(String[] args) { //MS
		
		String ssn = "9506241230123";
		char sex = ssn.charAt(6); // 9506241230123 에서 6번째인 '1'을 읽어라 (0,1,2,3 순서로)
		switch (sex) {
			case '1':
			case '3':
				System.out.println("남자입니다"); 
				break;
			case '2':
			case '4':
				System.out.println("여자입니다");
				break;
		}
		
	} //ME

} //CE
