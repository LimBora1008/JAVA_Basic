package com.javalab.fileio.pkg03;

import java.io.*;

/*
 * FileWriter
 * 	- Writer를 상속받은 자식 클래스
 * 	- File을 2바이트씩 저장한다(쓴다)
 */
public class FileWriterExam01 {
	public static void main(String[] args) {

		try {
			File file = new File("c:/filetest/test03.txt"); // 절대경로
			FileWriter writer = new FileWriter(file);

			int i = 1;
			while (i <= 10) {
				writer.write("This is Line" + i + "of the file.\n");
				i++;
			}

			writer.close(); // 자원 반납(원칙은 finally 구문에서 처리해야함)
			System.out.println("파일에 성공적으로 저장했습니다.");
		} catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

}
