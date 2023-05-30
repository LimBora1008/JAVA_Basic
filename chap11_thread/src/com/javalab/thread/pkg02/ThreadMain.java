package com.javalab.thread.pkg02;

public class ThreadMain {

	public static void main(String[] args) {

		// 1. 별도의 파일로 정의 해놓음 MyThread 클래스를 객체로 생성
		Runnable rb = new MyThread(); // 구현객체를 생성하여 부모타입(Runnable-인터페이스)에 담는다

		// 2. Runnable을 구현한 구현 객체를 Thread 클래스의 생성자로 전달
		Thread t1 = new Thread(rb);

		// 스레드 실행
		t1.start();

	}

}
