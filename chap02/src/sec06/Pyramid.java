package sec06;

public class Pyramid {
	public static void main(String[] args) {

		for (int i = 1; i <=10; i++) { // for1 은 큰틀 = 총 10줄을 만든다
			
			for (int j = 0; j < i; j++) { // for2는 for1의 내부값을 정한다 = i는 1이고 j는 0이다
										  // *을 1번찍고 for2로 돌아간다 > i는 1이고 j는 1이니까  for1로 돌아간다 > i는 2가 되고 j는 1이된다 > ** 을 찍는다
				System.out.print("*"); 
			}
			System.out.println(); // 한줄씩 구분하기 위해 사용
			
			/*
			 	for1 > i가 1이고 10보다 작을때까지 반복 하고 i는 1씩 증가한다 ( int i = 1; i <=10; i++ )
			 	for2 > j는 0이고 j가i보다 작을때마다 반복하고 , 반복이후 j는 1씩 증가한다 ( int j = 0; j < i; j++)
			 	j가 i보다 작을때마다 [ System.out.print("*"); ] 이것을 실행한다
			 */
		}
		
		System.out.println(); // 한줄씩 구분하기 위해 사용
		
		for(int a=1; a<=3; a++) {
			for(int b=1; b<=2; b++) {
				System.out.print("안");
				for(int c=1; c<=1; c++) {
					System.out.print("녕");
				}
			}
			System.out.println();
		}
	}
}

/*
	이중 for문 : for1이 1번 반복할때 for2는 조건만큼 반복 후 for1로 돌아간다
	for1(변수선언; 조건; 증감식;){
		[ 실행문1 ]
		
		for2(변수선언; 조건; 증감식;){
			[ 실행문2 ]
		}
	}

*/