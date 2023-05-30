package sec02;

// 산술 연산자, 증감연산자 예제

public class InDeOperator {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		x++; // 11
		++x; // 12
		System.out.println("x="+x); // 12
		
		System.out.println("===========================================");
		
		y--; // 9
		--y; // 8
		System.out.println("y="+y); // 8
		
		System.out.println("===========================================");
		
		z = x++; // 12 > 이후 1더하기
		System.out.println("z="+z); // 12
		System.out.println("x="+x); // 13
		
		System.out.println("===========================================");
		
		z = ++x; // 13+1 먼저 진행 > 14
		System.out.println("z="+z); // 14
		System.out.println("x="+x); // 14
		
		System.out.println("===========================================");
		
		z = ++x + y++; // 14+1 > x는 15 , y는 8 ,z는 15+8 , 이후에 y에 1더하기
		System.out.println("z="+z); // 23
		System.out.println("x="+x); // 15
		System.out.println("y="+y); // 9

	}

}
