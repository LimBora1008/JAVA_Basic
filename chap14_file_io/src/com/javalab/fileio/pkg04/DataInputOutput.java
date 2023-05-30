package com.javalab.fileio.pkg04;

import java.io.*;

/*
 * DataOutputStream
 * 	- 기본형 데이터를 좀 더 편리하게 읽고 쓸수 있다
 */

public class DataInputOutput {

	public static void main(String[] args) throws IOException {

		// File객체 생성과 동시에 FileOutputStream 생성
//		FileOutputStream fos =new FileOutputStream("c:/filetest/primtive.db");

		// File객체 생성
		File file = new File("c:/filetest/primtive.db");
		// FileOutputStream 생성
		FileOutputStream fos = new FileOutputStream(file);
		// FileOutputStream을 기반으로 기본형 자료를 좀 더 편리하게 읽고/쓰기 위함
		DataOutputStream dos = new DataOutputStream(fos);

		// 기본 타입 출력
		dos.writeUTF("홍길동"); // UTF-8 형식으로 인코딩하여 문자열 출력
		dos.writeDouble(95.5);
		dos.writeInt(1);

		dos.writeUTF("김자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);

		dos.flush(); // 남은 데이터 소모
		dos.close();
		fos.close();

		// DataInputStream 생성
		FileInputStream fis = new FileInputStream("c:/filetest/primtive.db");
		DataInputStream dis = new DataInputStream(fis); // 보조스트림

		// 기본 타입 입력
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF(); // UTF-8 형식으로 코딩된 문자열을 읽는다(한글이 깨지지 않게 읽기)
			double score = dis.readDouble(); // double타입 읽기
			int order = dis.readInt(); // int타입 읽기
			System.out.println(name + ":" + score + ":" + order);
		}

		dis.close();
		fis.close();
	}

}
