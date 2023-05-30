package class24.exam01.mycompany;

// import 의 기능은 컴파일러에게 경로를 표기해준다
import class24.exam01.hankook.SnowTire;
import class24.exam01.hyundai.Engine;
import class24.exam01.kumho.BigWidthTire;

//import class24.exam01.hankook.SnowTire;
//import class24.exam01.hyundai.Engine;
//import class24.exam01.kumho.BigWidthTire;

public class Car { // 라이브러리 클래스

	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	// 같은 클래스 이름으로 두개의 import가 안된다
//	Tire tire10 = new Tire(); // kumho
//	Tire tire11 = new Tire(); // hankook 패키지의 Tire를 쓰려면 아래와 같이 복잡한 과정을 거쳐야 한다
	
	class24.exam01.kumho.Tire tire3 = new class24.exam01.kumho.Tire();
	class24.exam01.hankook.Tire tire4 = new class24.exam01.hankook.Tire();

	public static void main(String[] args) { // static 정적필드
		Car myCar = new Car(); // 객체생성
	}
}

/*
 * 컨트롤 + 쉬프트 + O // 모든 import
 * 컨트롤+ / > 주석처리
*/
