package com.javalab.polymorphism.pkg09;

public class SportsMain {

	public static void main(String[] args) {

		// 선수 객체 생성
		Player player = new Player();

		// 부모타입 클래스 변수 선언
		Sports sp = null;

		System.out.println("1. 자동 타입 변환");

		sp = new Baseball(); // 자동타입 변환
		player.play(sp);

		sp = new Soccer(); // 자동타입 변환
		player.play(sp);

		System.out.println("2. 배열을 이용한 플레이");
		Sports[] arrSport = new Sports[2];
		arrSport[0] = new Baseball();
		arrSport[1] = new Soccer();

		for (int i = 0; i < arrSport.length; i++) {
			player.play(arrSport[i]);
		}

	}

}
