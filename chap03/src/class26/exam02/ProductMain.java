package class26.exam02;

public class ProductMain {
	
	public static void main(String[] args) {
		
		// 기본생성자 호출
		Product myprod1 = new Product();
		myprod1.id = 202103001;
		myprod1.name = "냉장고";
		myprod1.price = 500;
		myprod1.quantiy = 5;
		
		// 기본생성자 객체 출력
		myprod1.showProductinfo();
		
		System.out.println();
		
		// 오버로딩 생성자 호출
		Product myprod2 = new Product(202103001,"세탁기",250,-15);
		
		// 오버로딩생성자 객체 출력
		myprod2.showProductinfo();
		
	}

}
