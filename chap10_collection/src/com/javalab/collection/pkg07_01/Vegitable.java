package com.javalab.collection.pkg07_01;

// 야채 클래스

public class Vegitable {
	
	//필드
	private String name;
	private int price;
	
	// 생성자
	public Vegitable() {
		super();
	}

	public Vegitable(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	// 게터 세터
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

	// toString
	@Override
	public String toString() {
		return "Vegitable [name=" + name + ", price=" + price + "]";
	}
	
	

}
