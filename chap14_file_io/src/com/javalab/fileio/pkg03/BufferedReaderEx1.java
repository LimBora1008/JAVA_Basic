package com.javalab.fileio.pkg03;

import java.io.*;

// 문자 입출력 FileReader,BufferedReader클래스
// 문자를 2바이트씩 읽어들임
public class BufferedReaderEx1 {
	public static void main(String[] args) {

		try {
			File file = new File("c:/filetest/123.txt"); // 파일객체 생성
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

//			String line = "";
//			for (int i = 0; (line = br.readLine()) != null; i++) {
//				System.out.println(i + ":" + line);
//			}

			int lineNo = 1;
			while (true) {
				String str = br.readLine(); // readLine: 한 행을(줄을) 읽어들임
				if (str == null)
					break; // while을 빠져나감
				System.out.println(lineNo + "\t" + str);
				lineNo++;
			}

			br.close();

		} catch (IOException e) {
		}

	} // end main

} // end class
