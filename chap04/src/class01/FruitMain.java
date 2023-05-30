package class01;

// 실행클래스

public class FruitMain {

	public static void main(String[] args) {

		// 객체 한개 생성
		Fruit peach = new Fruit(); // new 객체생성
		peach.setName("복숭아");
		peach.setPrice(6500);
		peach.setQuantity(5);

		printFruit(peach); // Fruit타입의 peach객체를 출력하는 메소드 호출

		// 객체 5개 생성
		Fruit apple = new Fruit("사과", 2000, 5);
		Fruit mango = new Fruit("망고", 1000, 2);
		Fruit banana = new Fruit("바나나", 2500, 3);
		Fruit pineapple = new Fruit("파인애플", 5000, 1);
		Fruit orange = new Fruit("오렌지", 6000, 4);

		printFruit(apple, mango, banana, pineapple, orange); // Fruit타입 객체 5개를 전달받아 출력하는 메소드 호풀

		// 과일 객체 5개 담을 수 있는 배열(Array) 선언
		Fruit[] array = new Fruit[5]; // [] {apple,mango,banana,pineapple,orange}; 이것도 가능

		// 선언한 배열에 위에서 만든 과일 객체 담기
		array[0] = apple;
		array[1] = mango;
		array[2] = banana;
		array[3] = pineapple;
		array[4] = orange;

		// 배열을 전달하여 출력하는 메소드 호출
		printFruit(array);

	}

	// peach의 값을 받아 출력하는 메소드
	public static void printFruit(Fruit peach2) { // Fruit타입의 peach2는 printFruit(peach);에서 (peach)의 주소값을 복사한다

		System.out.print(peach2.getName() + "\t" + peach2.getPrice() + "\t" + peach2.getQuantity() + "\n\n");

	}

	// 5개의 객체의 값을 받아 출력하는 메소드
	public static void printFruit(Fruit apple, Fruit mango, Fruit banana, Fruit pineapple, Fruit orange) {

		System.out.print(apple.getName() + "\t" + apple.getPrice() + "\t" + apple.getQuantity() + "\n");
		System.out.print(mango.getName() + "\t" + mango.getPrice() + "\t" + mango.getQuantity() + "\n");
		System.out.print(banana.getName() + "\t" + banana.getPrice() + "\t" + banana.getQuantity() + "\n");
		System.out.print(pineapple.getName() + "\t" + pineapple.getPrice() + "\t" + pineapple.getQuantity() + "\n");
		System.out.print(orange.getName() + "\t" + orange.getPrice() + "\t" + orange.getQuantity() + "\n" + "\n");

	}

	// 배열을 전달받아 출력하는 메소드
	public static void printFruit(Fruit[] array) {

		for (Fruit fruit : array) {
			System.out.print(fruit.getName() + "\t" + fruit.getPrice() + "\t" + fruit.getQuantity() + "\n");
		}

		/* 기존 for문
		 * for (int i = 0; i < array.length; i++) { 
		 * System.out.print(array[i].getName() + "\t" + array[i].getPrice() + "\t" + array[i].getQuantity() + "\n"); }
		 */

	}

}
