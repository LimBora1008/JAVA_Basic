package com.javalab.fileio.pkg06;

import java.io.Serializable;

// 직렬화용 Member클래스
public class Member implements Serializable {
	private static final long serialVersionUID = -7796794680958262100L;
	// 직렬화시 같은 클래스 타입이라는 것을 증명해주는 역할
//	private static final long serialBersionUID = -622284561026719240L;

	private String id;
	private String name;

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ": " + name;
	}

}
