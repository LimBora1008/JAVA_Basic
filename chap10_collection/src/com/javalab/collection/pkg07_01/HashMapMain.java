package com.javalab.collection.pkg07_01;

import java.util.Iterator;
import java.util.List;

public class HashMapMain {

	public static void main(String[] args) {

		// 1. 과일(Fruit) 객체 생성
		Fruit apple = new Fruit("Apple", 3000);
		Fruit Banna = new Fruit("Banna", 3500);
		Fruit Orange = new Fruit("Orange", 4000);

		// 2. 과일 객체를 담을 박스(Box) 객체 생성
		Box<Fruit> box = new Box<Fruit>();
		box.addItem(apple);
		box.addItem(Banna);
		box.addItem(Orange);
		
		// 3. 박스의 내용 확인
		for (Fruit fruit : box.getItems()) {
			System.out.println("name: " + fruit.getName() + "  /  price : " + fruit.getPrice());
		}
		
		System.out.println();
		
		// 4. 야채 객체 생성
		Vegitable 시금치 = new Vegitable("시금치",1500);
		Vegitable 양배추 = new Vegitable("양배추",2500);
		Vegitable 대파 = new Vegitable("대파",3500);
		
		Box<Vegitable> box2 = new Box<Vegitable>();
		box2.addItem(시금치);
		box2.addItem(양배추);
		box2.addItem(대파);
		
		for (Vegitable vegitable : box2.getItems()) {
			System.out.println("name: " + vegitable.getName() + "  /  price : " + vegitable.getPrice());
		}
		
	}

}

/*
 * [과일 raw data]
 * 
 * "Apple",3000 
 * "Banna",3500 
 * "Orange",4000
 * 
 * [야채 raw data]
 * "시금치",1500
 * "양배추",2500
 * "대파",3500
 */