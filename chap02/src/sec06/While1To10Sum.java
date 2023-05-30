package sec06;

public class While1To10Sum {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;

		/* 
		i 가 10보다 작거나 같다 > i 나누기 2의 나머지는 0과 같으면 sum에 저장한다 > while문 처음부터 반복 >  i에 1누적해서 while문을 반복한다
		
		while (i <= 10) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			
			i++;
		}
		*/

		while (true) {
			if (i % 3 == 0) {
				sum = sum + i;
			} // --------------- > i는 3의 배수이면 sum에 더하기  -- 아니면 i++ 하여 진행
			if (i > 10) {
				break; // ------ > i가 10보다 크면 중지
			}
			i++;
		}

		System.out.println("1~" + (i - 1) + "사이의 3의배수 합: " + sum);

	}

}

/*
  		while(조건 or true) {
  			[ 반복 영역 ]
  			조건이 true일 경우 실행문
  		}
  			[ 조건이 false일 경우 ]
  		while 종료문 = break;
  		
 */
