package com.javalab.generic.pkg05;

/**
 * 제네릭 클래스
 *
 * @param <T>
 */
public class Box<T> {

	// 필드
	private T t; // private Intrger t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
