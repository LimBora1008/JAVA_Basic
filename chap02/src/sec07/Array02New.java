package sec07;

 // 배열을 사용하여 세 과목의 평균 구하기

public class Array02New {
	
	public static void main(String[] args) {
		
		// 합계 변수
		int sum = 0;
		
		// 배열 변수를 선언과 동시에 초기화
		int intArr[] = {80,75,90};
		// 이런 형태로 초기화 할수도 있음
		intArr[0] = 80;
		intArr[1] = 75;
		intArr[2] = 90;
		
		for(int i=0; i<intArr.length; i++) { // i가 0일때 i<(intArr.length)3보다 작다; i는 1씩 증가한다
			sum = sum+intArr[i]; // sum은 for문이 1번 반복할때 마다 sum+intArr[i(0,1,2)]로 누적된다 >> 
								 // sum = sum+intArr[i(0)] 일때 sum은 80
								 // sum = sum+intArr[i(1)] 일때 sum은 80+75
			System.out.println(intArr[i]);
		}
		// intArr.length = intArr의 길이(3개)
		// intArr[i]; > i가 반복되면서 0번째값 , 1번째값 , 2번째값이 sum에 누적된다
		
		double avg = (double)sum / intArr.length;
		System.out.printf("avg : %.2f",avg);
		
	}

}
