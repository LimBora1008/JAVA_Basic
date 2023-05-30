package class26.exam02;

public class Product {

	// 필드생성
	public int id; // 품번
	public String name; // 제품명
	public int price; // 가격
	public int quantiy; // 수량
	public int amount; // 총액

	// 기본생성자
	public Product() {

	}

	// 오버로딩 생성자(파라미터)
	public Product(int id, String name, int price, int quantiy) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantiy = quantiy;
	}

	// 총 금액을 계산해주는 메소드(가격*수량)
	public int getAmount() {
		return this.price * this.quantiy;
	}
	
	// 객체의 정보를 보여주는 메소드
	public void showProductinfo() {

		System.out.println("id : " + this.id);
		System.out.println("name : " + this.name);
		System.out.println("price : " + this.price);
		System.out.println("quantiy : " + this.quantiy);
		System.out.println("amount : " + this.getAmount());
	}

}
