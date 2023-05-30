package class26.exam07;

// 도메인 클래스 , 라이브러리 클래스
// private : 같은 클래스 내에서만 호출 가능

public class Time {

	// 필드
	private int hour;
	private int minute;
	private int second;
	

	// 기본생성자
	public Time() {

	}

	// 오버로딩 생성자
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// 시간값 세팅 메소드(setter메소드) : 전달받은 hour의 값을 검증
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) {
			System.out.println("시간 값이 올바르지 않습니다.");
			return; // 메소드를 빠져나가는 return
		}
		this.hour = hour;
	}
	
	// 객체의 내부 정보를 보여주는 메소드
	public void showTime() {
		System.out.println("현재 시간은 : " + this.hour + "시 입니다");
	}

}
