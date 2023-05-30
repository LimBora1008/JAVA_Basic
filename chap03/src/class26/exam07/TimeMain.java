package class26.exam07;

// 실행클래스

public class TimeMain {
	
	public static void main(String[] args) {
		
		// Time 객체 생성
		Time t = new Time();
		
		// t.hour = 25; << private이라서 불가
		t.setHour(25); // t.hour에 직접 값을 할당할수 없으므로 setHour메소드를 통해 값을 할당해야함
		t.showTime();
		
	
	}

}
