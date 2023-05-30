package com.javalab.fileio.pkg01;

import java.io.*;

// FileOutputStream
//	- write()메소드를 사용해서 1바이트씩 write함

public class FileOutputStreamExam01 {
	public static void main(String[] args) {
		FileOutputStream fos = null;

		try {
			/*
			 * File file = new File("C:/filetest/test1.txt"); 
			 * fos = new FileOutputStream(file);
			 */
			fos = new FileOutputStream("C:/filetest/test1.txt");

			byte a = 65; // A
			byte b = 66; // B
			byte c = 67; // C

			fos.write(a); // write : 1바이트씩 입력한다
			fos.write(b);
			fos.write(c);

			fos.flush(); // 아직 써지지 않은 내용 비움(파일에 씀)
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e2) {
					System.out.println("파일의 자원을 닫다가 오류남 : " + e2.getMessage());
				}
			}
		}
	}

}