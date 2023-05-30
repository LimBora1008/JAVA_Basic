package com.javalab.fileio.pkg03;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

/*
 * FileReader + BufferedReader 사용
 * 읽어들인 데이터를 Stream<E> 스트림 저장해서 처리
 */
public class FileReaderStream {
	public static void main(String[] args) throws FileNotFoundException {

		Path path = Paths.get("src/com/javalab/fileio/pkg03/linedata.txt"); // Path: 경로
		Stream<String> stream;

		// File 객체가 반환됨
		File file = path.toFile();
		// FileReader 객체 생성(빨대꽂음)
		FileReader fileReader = new FileReader(file);
		// 메모리에 버퍼를 통해서 읽어들이는 신무기 장착(FileReader 필요함)
		BufferedReader br = new BufferedReader(fileReader);

		// BufferedReader의 lines()메소드를 이용해서 읽어들이도 Stream<String>에 저장
		stream = br.lines(); // 데이터를 한줄씩 읽어들여 stream 에 저장한다

		// Stream 반복(forEach)
		stream.forEach(System.out::println); // forEach : 최종연산
//		stream.forEach(s->{System.out.println(s);});
//		stream.forEach(s->System.out.println(s));

		// Stream 반납
		stream.close();
	}

}
