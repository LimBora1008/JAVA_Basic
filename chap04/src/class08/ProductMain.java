package class08;

public class ProductMain { // class

	public static void main(String[] args) { // main

		// 데이터를 생성해주는 객체 생성
		ProductData pd = new ProductData();
		Product[] products = pd.products;

		// 전체 상품 목록 출력
		printProduct(products);

		// 세탁기의 가격을 조회하시오
		String temStr = "세탁기";
		getWashPrice(temStr, products);

		// 구매한 모든 제품의 총액과 평균 가격을 main메소드에서 출력하시오
		int sum = getTotalAmount(products);
		double avg = getAvg(products);

		System.out.println("구매한 모든 제품의 총액 : " + sum);
		System.out.printf("구매한 모든 제품의 평균 : %.2f \n", avg);

		System.out.println(); // 줄바꿈

		// 제품 중에서 100만원이 넘는 제품의 목록,수량,합계 출력
		getProductGrather100(products);

	} // main

	// 100만원이 넘는 제품 목록,수량,합계
	private static void getProductGrather100(Product[] products) {

		int sum = 0;
		int count = 0;

		System.out.println("100만원이 넘는 상품은 다음과 같다 \n");

		for (int i = 0; i < products.length; i++) {
			if (products[i].getPrice() >= 1000000) {
				System.out.println(products[i].getId() + "\t" + products[i].getName() + "\t" + products[i].getPrice());

				count++;

				sum += products[i].getPrice();
			}
		}

		System.out.println(); // 줄바꿈
		System.out.println("100만원 이상의 제품 수량은 : " + count);
		System.out.println("100만원 이상의 제품 합계는 : " + sum);

	}

	// 구매한 모든 제품의 평균 메소드
	private static double getAvg(Product[] products) {
		int count = 0;
		int sum = getTotalAmount(products);
		for (Product product : products) {
			count++;
		}
		return (double) sum / count;

	}

	// 구매한 모든 제품의 총액 메소드
	private static int getTotalAmount(Product[] products) {
		int sum = 0;
		for (Product product : products) {
			sum += product.getPrice();
		}
		return sum;
	}

	// 세탁기 가격 조회 메소드
	private static void getWashPrice(String temStr, Product[] products) {

		for (Product product : products) {
			if (product.getName().equals(temStr)) {
				System.out.println(temStr + "의 가격은 : " + product.getPrice());
			}
		}
		System.out.println(); // 줄바꿈
	}

	// 상품 목록 출력 메소드
	private static void printProduct(Product[] products) {
		System.out.println("id \tname \tprice");
		for (Product product : products) {
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
		}

		System.out.println(); // 줄바꿈
	}
} // class
