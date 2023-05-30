package com.javalab.awt.pkg02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// (버튼)액션 리스너 ActionListener
// - 버튼이 눌렸을 경우 처리할 작업을 정의
// 텍스트 필드 : 값을 입력 받는 컴포넌트
public class ButtonAction01 {

	public static void main(String[] args) {

		JFrame f = new JFrame("Button Example"); // 프레인 객체 생성
		final JTextField tf = new JTextField(); // 입력 필드(텍스트 필드)
		tf.setBounds(110, 100, 150, 20); // 텍스트 필드 x,y,width,height

		JButton b = new JButton("여기를 클릭하세요"); // 버튼
		b.setBounds(110, 130, 150, 30); // 버튼의 x,y,width,height

		// 액션 리스너(이벤트 처리기) 버튼이 클릭되었을 경우 이 메소드가 호출됨
		// 익명 구현 객체 탄생!
		b.addActionListener(new ActionListener() { // 익명 구현객체 생성
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("버튼이 눌렸어요");
			}
		});

		f.add(b); // 프레임에 버튼 추가
		f.add(tf); // 프레임에 텍스트 필드 추가
		f.setSize(400, 400); // 사이즈 설정
		f.setLayout(null); // 레이아웃 설정
		f.setVisible(true); // 보이기 설정

	}

}
