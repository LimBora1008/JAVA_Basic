package com.javalab.collection.pkg07_01;

public class Fruit {

	// 필드
	private String name;
	private int price;

	// 생성자
	public Fruit() {
		super();
	}

	public Fruit(String name, int price) {
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
		return "Fruit [name=" + name + ", ptice=" + price + "]";
	}

}
