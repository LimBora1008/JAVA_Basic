package sec08;

public class Employee { // class

	public static void main(String[] args) { // main

		// 기초 데이터 만들기(배열 변수)
		String[] name = { "PJH", "JDW", "AJH", "HST", "HTW", "LWS", "LSD", "YJH", "JSW", "LKO" };
		int[] age = { 27, 34, 28, 26, 41, 28, 42, 29, 29, 32 };
		String[] phone = { "010-8532-0537", "010-9672-5257", "010-9932-4536", "010-4117-0975", "011-8975-7892",
				"010-6251-6976", "010-9482-6059", "010-4845-0105", "010-6283-4849", "010-4510-1609" };
		char[] gender = { 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'M' };
		int[] pay = { 460, 200, 250, 300, 300, 200, 350, 200, 400, 440 };
		String[] country = { "일본", "프랑스", "일본", "미국", "캐나다", "덴마크", "한국", "영국", "미국", "한국" };

		// 1. 사원 정보 출력
		System.out.println("                       << 사원 정보 >>                       ");
		System.out.println("========================================================");
		System.out.println(" name   age         phone     gender    pay   country");
		System.out.println("--------------------------------------------------------");

		for (int i = 0; i < name.length; i++) {
			System.out.println(
					name[i] + "\t" + age[i] + "\t" + phone[i] + "\t" + gender[i] + "\t" + pay[i] + "\t" + country[i]);
		}
		System.out.println("========================================================");

		// 2. 남자 사원의 평균 연령 구하기
		int sumAge = 0; // 나이합 변수
		int count = 0; // 사원수 변수
		double avgAvg = 0.0; // 남자사원 평균나이
		char c = 'M'; // 성별 남자

		// 나이와 인원수 합계 계산
		for (int i = 0; i < gender.length; i++) {
			if (gender[i] == c) { // 성별이 남자
				sumAge += age[i]; // 나이 누적
				count++; // 인원수 누적
			}
		}
		avgAvg = (double) sumAge / count;
		System.out.printf("2. 남자사원의 숫자는 : %d명 이며 평균 연령은 %.1f세 입니다", count, avgAvg);
		System.out.println("\n========================================================");

		// 3. 여성 사원의 평균 급여 구하기
		int sumPay = 0; // 급여합 변수
		int count2 = 0; // 여성사원수 변수
		double payPay = 0.0; // 여성사원 평균급여
		char d = 'F';

		for (int i = 0; i < gender.length; i++) {
			if (gender[i] == d) {
				sumPay += pay[i];
				count2++;
			}
		}
		payPay = (double) sumPay / count2;
		System.out.printf("3. 여성사원의 숫자는 : %d명 이며 평균 급여는 %.1f만원 입니다", count2, payPay);
		System.out.println("\n========================================================");

		// 4. 일본에 근무하는 사원들의 이름과 연락처 구하기
		String nameString = ""; // 이름들 변수
		String phoneString = ""; // 연락처들 변수
		
		String[] arrName = null; // 일본 사원 이름 배열
		String[] arrPhone = null; // 일본 사원 연락처 배열

		for (int i = 0; i < name.length; i++) {
			if (country[i].equals("일본")) {
				nameString += name[i] + ","; // 이름 연결
				phoneString += phone[i] + ","; // 연락처 연결
			}
		}
		
		// 이름,연락처 분리
		arrName = nameString.split(","); // 이름을 분리해서 이름 배열에 할당
		arrPhone = phoneString.split(","); // 이름을 분리해서 이름 배열에 할당

		System.out.println("4. 일본 사원들의 이름과 연락처");
		for (int j = 0; j < arrName.length; j++) {
			System.out.println(arrName[j] + " " + arrPhone[j]);
		}


	} // main

} // class
