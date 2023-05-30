package com.javalab.exception.pkg04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {

		FileReader reader = null;

		try {
			reader = new FileReader("C:/filetest/inputt.txt"); // 자원(리소스) 오픈
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (FileNotFoundException f) {
			System.out.println("파일이 존재하지 않거나 경로가 잘못되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();	// 자원(리소스) 닫기 : 꼭 finally에서 자원 닫기
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
