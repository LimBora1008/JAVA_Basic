package class13;

// 메소드 연습용 Car 클래스
// 필드 = 속성 , 메소드 = 동작

public class Car {
	
	// 필드 선언(기름)
	int gas;
		
	// 주유 메소드(리턴값이 없는 메소드로 매개값을 받아서 gas 필드에 저장)
	void setGas(int gas) {
		this.gas = gas;
	}
	
	/*
	 * 기름이 있고 없고 여부를 반환해주는 메소드
	 *  - boolean : gas 필드값이 0 이면 false , 0이 아니면 true를 리턴
	 */
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			return false; // false를 호출한쪽으로 리턴하고 메소드 종료
		}
		System.out.println("gas가 있습니다");
		return true; // true를 호출한쪽으로 리턴하고 메소드 종료
	}
	
	/*
	 * 운행 메소드
	 * 	- 기름이 0이 될때까지 계속 운행
	 *  - gas가 0이면 return문으로 메소드를 종료시킴
	 */
	
	void run() {
		while(true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량:"+gas+")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다.(gas잔량:"+gas+")");
				return; // void run() 메소드 종료
			}
			
		}
		
	}

}
