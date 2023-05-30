package com.javalab.collection.pkg08;

import java.io.IOException;
import java.util.*;

/*
 * Properties
 * - HashTable의 자식(하위 클래스)로서 HashTable 특징을 갖고 있음
 * - key와 value가 String 타입 이어야 함
 * - key와 value가 "=" 로 매핑되어 있다
 */

public class PropertiesExample {

	public static void main(String[] args) throws IOException {
		// Properties 컬렉션 생성
		Properties properties = new Properties();

		// PropertiesExample.class 와 동일한 ClassPath에 있는
		// database.properties 파일을 메모리로 로드
		// getResourceAsStream : 주어진 상대 경로의 리소스를 읽는 InputStream 반환
		properties.load(PropertiesExample.class.getResourceAsStream("database.properties")); // 같은 경로에 있는 리소스를 읽는다

		// 주어진 키에 대한 값 읽기
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		// 값 출력
		System.out.println("driver: " + driver);
		System.out.println("url: " + url);
		System.out.println("username: " + username);
		System.out.println("password: " + password);

	}

}
