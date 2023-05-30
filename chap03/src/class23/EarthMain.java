package class23;

public class EarthMain {
	
	public static void main(String[] args) {
		
		// 정적필드 호출은 클래스이름.필드명 으로 사용
		// 객체 생성x
		System.out.println("지구의 반지름 : "+Earth.EARTH_RADIUS+"km");
		System.out.println("지구의 표면적 : "+Earth.EARTH_AREA+"km^2");
	}

}
