package com.javalab.awt.pkg04;

import javax.swing.*;
import java.awt.event.*;

// 텍스트 필드와 버튼을 이용한 초간단 계산기
public class TextField03_Calc implements ActionListener {
	JTextField tf1, tf2, tf3; // 텍스트 필드 3칸(입력2개 출력1개)
	JButton b1, b2; // 버튼2개

	// 기본생성자
	public TextField03_Calc() {
		JFrame f = new JFrame(); // 프레임 객체 생성
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tf1 = new JTextField(); // 텍스트 필드 객체 생성
		tf1.setBounds(50, 50, 150, 20);

		tf2 = new JTextField(); // 텍스트 필드 객체 생성
		tf2.setBounds(50, 100, 150, 20);

		tf3 = new JTextField(); // 텍스트 필드 객체 생성
		tf3.setBounds(50, 150, 150, 20);
		tf3.setEditable(false); // 수정이 안되는 텍스트 필드(결과만 나옴)

		b1 = new JButton("+");
		b1.setBounds(50, 200, 50, 50);

		b2 = new JButton("-");
		b2.setBounds(120, 200, 50, 50);

		/*
		 * 이벤트 핸들러 호출 
		 * - 액션 리스너 호출시 객체 자신이 전달됨
		 */
		b1.addActionListener(this); // 생성자 안에서 호출하므로 this 사용 가능
		b2.addActionListener(this);

		// 프레임에 텍스트 필드와 버튼을 추가
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(b1);
		f.add(b2);

		f.setSize(300, 300); // 프레임 사이즈 설정
		f.setLayout(null); // 레이아웃 설정
		f.setVisible(true); // 프레임 보이기
	}

	// 액션 리스너
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 클릭 이벤트 발생");
		String s1 = tf1.getText(); // 텍스트 필드의 입력값
		String s2 = tf2.getText(); // 텍스트 필드의 입력값

		int a = Integer.parseInt(s1); // 입력값을 int로 변환
		int b = Integer.parseInt(s2); // 입력값을 int로 변환
		int c = 0;

		if (e.getSource() == b1) { // getSource : 클릭된 자원이 누구냐?
			c = a + b;
		} else if (e.getSource() == b2) {
			c = a - b;
		}
		String result = String.valueOf(c);
		tf3.setText(result);
	}

	public static void main(String[] args) {
		new TextField03_Calc();
	}

}
