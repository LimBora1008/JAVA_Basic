package class08;

public class Product {

	// 필드
	private int id; // 상품ID
	private String name; // 상품명
	private int price; // 상품 가격

	// 생성자
	public Product() {
	}

	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// 게터 세터 메소드
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
