package class14;

import java.util.Calendar;

public class EnumWeekMain {
	
	public static void main(String[] args) {
		
		// Week타입(열거타입) 변수 선언
		Week today = null;
		
		// Calendar 얻기
		Calendar cal = Calendar.getInstance(); 
		// Calendar.getInstance(); : 정적 메소드(static)
		
		// 오늘의 요일 얻기(1~7)
		// 일-1 , 월-2 , 화-3 , 수-4 , 목-5 , 금-6 , 토-7
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(week); // week는 오늘날짜에 맞춰서 지정된다
		
		// 숫자를 열거 상수로 변환해서 변수에 대입
		switch (week) { 
			case 1: today = Week.SUNDAY;break;  // today는 Week타입 이기 때문에 Week에 있는 열거상수만 지정할수있다
			case 2: today = Week.MONDAY;break;
			case 3: today = Week.TUESDAY;break;
			case 4: today = Week.WEDNEDAY;break;
			case 5: today = Week.THURSDAY;break;
			case 6: today = Week.FRIDAY;break;
			case 7: today = Week.SATURDAY;break;
		}
		
		// 열거 타입 변수를 사용
		if(today == Week.SATURDAY || today == Week.SATURDAY) {
			System.out.println("일요일에는 축구를 합니다");
		}else {
			System.out.println("열심히 자바를 공부합니다");
		}
	}

}
