package sec03;

public class SubStringExam {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6); // 0~5번째 까지 값 출력(총6개의 값)
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); // 7번째 포함 이후 값 출력
		System.out.println(secondNum);

		// substring 은 값의 왼쪽부터 순서대로 불러오기
	}

}
