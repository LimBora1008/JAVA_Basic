package com.javalab.awt.pkg10;

import javax.swing.*;

// JTable : 목록을 출력해주는 컴포넌트
public class Table01 {
	
	// 필드
	JFrame frame;
	
	// 생성자
	public	Table01() {
		frame = new JFrame(); // 프레임 객체 생성
		
		// 테이블에 출력될 값
		String data[][] = 
			{
					{"101","Amit","670000"},
					{"102","Jai","780000"},
					{"101","Sachin","700000"},
			
			};
		
		// 테이블에 출력될 제목
		String column[] = {"ID","NAME","SALARY"};
		
		// Table 객체 생성
		JTable table = new JTable(data,column); // 생성자에 값과 타이틀을 전달
		table.setBounds(30,40,200,300);
		JScrollPane sp = new JScrollPane(table); // JScrollPane : 데이터가 많을 때 스크롤을 만들어줌
		
		frame.add(sp);
		frame.setSize(300,400);;
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Table01();
	}

}
