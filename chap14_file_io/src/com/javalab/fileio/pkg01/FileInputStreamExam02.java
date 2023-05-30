package com.javalab.fileio.pkg01;

import java.io.*;

// FileInputStream 예제
// 	- read(byte[] b) : byte[]배열을 통해서 한꺼번에 읽어들임. 성능이 개선됨
public class FileInputStreamExam02 {

	public static void main(String[] args) {
		// FileInputStream을 try문 밖으로 뻄
		FileInputStream fis = null; // try문 안에서 선언하면 finally 에서 사용할 수 없다

		try {
			// 자바 프로그램에서 사용할 파일 객체 생성
			// File객체의 생성자에 "파일이 위치한 경로와 파일명 전달"
			File file = new File("C:/filetest/123.txt");

			// 파일을 읽어들이는 기본 클래스인 FileInputStream 객체를 생성
			// FileInputStream의 생성자에 위에서 만든 File 객체 전달
//			InputStream is = new FileInputStream(file); // 읽어들이는 빨대가 파일에 꽂힘
			// InputStream: 추상클래스 , FileInputStream : InputStream을 구현한 자식클래스
			fis = new FileInputStream(file); // 읽어들이는 빨대가 파일에 꽂힘

			// read()메소드에 파라미터로 전달됨
			byte[] data = new byte[100];

			while (true) {
				int num = fis.read(data); // 100바이트를 한꺼번에 읽어들임, 읽은 갯수를 num에 저장
				if (num == -1) // 계속 읽어들이가다 -1(즉, 파일의 끝)이 오면 종료
					break;
				
				for (int i = 0; i < num; i++) {
					System.out.print((char) data[i]); // (char) : 아스키코드를 문자로 변환
				}
			}
			// 자원 종료
//			is.close();
		} catch (FileNotFoundException e) { // 혹시 파일이 존재하지 않을 경우 오류 대비
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) { // 파일을 읽어들이다가 생길지 모르는 오류 대비(예외처리)
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e2) {
					System.out.println("파일의 자원을 닫다가 오류남 : " + e2.getMessage());
				}
			}
		}

	}

}
