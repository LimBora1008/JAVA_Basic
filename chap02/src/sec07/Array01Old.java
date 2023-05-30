package sec07;

// 세 과목의 평균 구하기

public class Array01Old {
	
	public static void main(String[] args) {
		
		int a = 80;
		int b = 75;
		int c = 90;
		
		int sum = 0;
		
		sum = a+b+c; 
		
		double avg = sum/3.0;
		// 자바에선 정수간 나눗셈을 하면 소숫점을 버리므로 3.0(double)로 나눈다
		// double avg = sum/3; << 이것도 가능
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// 총점
		System.out.println("총점: "+sum);
		
		// 평균(81.66666666)
		System.out.println("1.평균: "+avg);
		System.out.printf("2.평균: %f \n",avg);
		System.out.println("3.평균: "+Math.round(avg*100)/100.0);
		/*
		 	* 	System.out.println("3.평균: "+Math.round(avg*100)/100.0);
		 	*  >> avg(81.66666666666667) * 100 
		 	*  >> Math.round(8167)
		 	*  >> Math.round(8167)/100.0 >> 81.67
		 */

		System.out.println();
		System.out.println(String.format("4.평균: %.2f",avg));
		
	}

}
