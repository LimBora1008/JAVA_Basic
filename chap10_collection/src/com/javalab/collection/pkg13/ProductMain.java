package com.javalab.collection.pkg13;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {

		System.out.println("1. 전체 상품 목록 츌력 메소드 호출");
		List<Product> list = new ArrayList<Product>();

		printAllProduct(list);

		System.out.println("2. 원하는 상품을 파라미터로 전달받아서 검색해주는 메소드를 만들고 해당 상품 가격을 main메소드에서 출력");
		Map<Product, String> mapList = getProductPrice(list, "운동화");

		// 출력
		Set<Product> keySet = mapList.keySet(); // keySet에 key값 저장
		Iterator<Product> iter = keySet.iterator(); // 반복자
		while (iter.hasNext()) { // iter에 남은 인덱스가 있는가?
			Product pro = iter.next(); // iter.next : 키값 반복 > pro 저장

			System.out.println(pro.getNum() + "\t" + pro.getName() + "\t" + pro.getPrice());
		}
		System.out.println();

		System.out.println("3. 구매한 제품의 평균 가격을 조회해서 main메소드 출력");
		Double average = getAverage(list);
		System.out.println("평균가격: " + average);

		System.out.println();

		System.out.println("4. 제품 중에서 100만원이 넘는 제품들을 찾아서 ArrayList로 반환해주는 메소드를 만들고 main메소드에서 출력");
		ArrayList<Product> list2 = product100List(list);

		for (Product product : list2) {
			System.out.println(product.getNum() + "\t" + product.getName() + "\t" + product.getPrice());
		}

		System.out.println();

		System.out.println("5. HashMap을 통한 출력 메소드 만들기");
		printProductMap(list);

	} // end main

	// printProductMap 메소드
	private static void printProductMap(List<Product> list) {
		Map<Integer, Product> map = new HashMap<Integer, Product>();
		for (Product product : list) {
			int k = product.getNum();
			map.put(k, product);
		}
		
		// for문 
//		for(Integer key : map.keySet()) {
//			System.out.println(map.get(key).getNum() + "\t" + map.get(key).getName() + "\t" + map.get(key).getPrice());
//		}

		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iter = keySet.iterator();
		while (iter.hasNext()) {
			int k = iter.next();
			System.out.println(map.get(k).getNum() + "\t" + map.get(k).getName() + "\t" + map.get(k).getPrice());
		}

	}

	// product100List 메소드
	private static ArrayList<Product> product100List(List<Product> list) {
		ArrayList<Product> li = new ArrayList<Product>();

		for (Product product : list) {
			if (product.getPrice() >= 1000000) {
				li.add(product);
			}
		}

		return li;
	}

	// getAverage 메소드
	private static double getAverage(List<Product> list) {
		int sum = 0;
		int count = 0;
		for (Product product : list) {
			sum += product.getPrice();
			count++;
		}
		return (double) sum / count;

	}

	// getProductPrice 메소드
	private static Map<Product, String> getProductPrice(List<Product> list, String string) {
		Map<Product, String> getProduct = new HashMap<Product, String>();
		for (Product product : list) {
			if (product.getName().equals(string)) {
				getProduct.put(product, string);
			}
		}

		return getProduct;
	}

	// printAllProduct 메소드
	private static void printAllProduct(List<Product> list) {
		list.add(new Product(1, "자전거", 250000));
		list.add(new Product(2, "노트북", 1250000));
		list.add(new Product(3, "쌀", 150000));
		list.add(new Product(4, "세탁기", 800000));
		list.add(new Product(5, "시금치", 2500));
		list.add(new Product(6, "대파", 10000));
		list.add(new Product(7, "에어컨", 3500000));
		list.add(new Product(8, "쇼파", 3000000));
		list.add(new Product(9, "우유", 2500));
		list.add(new Product(10, "운동화", 600000));

		for (Product product : list) {
			System.out.printf("%d \t %s \t %d \n", product.getNum(), product.getName(), product.getPrice());
		}

		System.out.println();
	}

} // end class
