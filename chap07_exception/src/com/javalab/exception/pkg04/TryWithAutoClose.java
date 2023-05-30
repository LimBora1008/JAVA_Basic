package com.javalab.exception.pkg04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithAutoClose {

	public static void main(String[] args) {

		try (FileReader reader = new FileReader("C:/filetest/input.txt")) { // 자원을 열고 자동으로 닫는다
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (FileNotFoundException f) {
			System.out.println("파일이 존재하지 않거나 경로가 잘못되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
