package com.javalab.thread.pkg04;

import javax.swing.JOptionPane;

/*
 * 멀티스레드
 * - 사용자에게 입력받은 부분과 숫자 출력하는 부분을 다른 스레드로 처리
 * - 사용자의 입력이 끝나지않아도 화면에 숫자가 출력된다
 */
public class ThreadEx07 {

	public static void main(String[] args) throws Exception {
		ThreadEx07_1 th1 = new ThreadEx07_1();
		th1.start();

		String input = JOptionPane.showInputDialog("이무 값이나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다");

	}

}

class ThreadEx07_1 extends Thread {
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {}
		}
	}
}