package class28;

/*
 * 실행클래스
 * 	- 객체 배열 활용
 */

public class ProductMain {

	public static void main(String[] args) {

		Product product = new Product(); // 빈객체 생성

		// 위에서 생성된 객체의 필드값에 직접 접근 불가(모든 필드가 private)
		/*
		 * product.id = 1; product.name = "오렌지"; product.price = 2000;
		 */

		// public인 setter메소드를 통해서 값 저장(값 할당)
		product.setId(1);
		product.setName("오렌지");
		product.setPrice(2000);

		// 객체의 필드에 직접 접근해서 값을 갖고 올 수 없음
		/*
		 * System.out.println(product.id); System.out.println(product.name);
		 * System.out.println(product.price);
		 */

		// 객체의 값을 갖고 올 수 있는 getter메소드를 통해서 값 조회
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(); // 줄바꿈

		// 과일 객체를 담을 수 있는 Product Type 배열을 생성한다
		Product[] productArr = new Product[5];

		productArr[0] = new Product(1, "오렌지", 2000);
		productArr[1] = new Product(2, "사과", 3000);
		productArr[2] = new Product(3, "포도", 4500);
		productArr[3] = new Product(4, "배", 5000);
		productArr[4] = new Product(5, "복숭아", 6000);

		for (int i = 0; i < productArr.length; i++) {
			System.out.print(
					productArr[i].getId() + "\t" + productArr[i].getName() + "\t" + productArr[i].getPrice() + "\n");
		}

		System.out.println(); // 줄바꿈

		// 모듈화
		printProduct(productArr); // 객체 배열에 객체 생성해서 저장하기
		// printProduct 메소드 호출
		// productArr의 주소값을 보내준다

	}

	private static void printProduct(Product[] productArr) { // 메소드 시그니처
		// productArr 은 Product타입 []배열로 선언되어 전달도 배열로 보낸다
		
		//상품 클래스 객체 생성 메소드
		for(Product product : productArr) {
			System.out.print(product.getId()+ "\t" + product.getName() + "\t" + product.getPrice() + "\n");
		}
		
	}

}
