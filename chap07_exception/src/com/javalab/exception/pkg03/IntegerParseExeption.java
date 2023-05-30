package com.javalab.exception.pkg03;

public class IntegerParseExeption {

	public static void main(String[] args) {
		String[] array = { "100", "1oo" };

		for (int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]:" + value);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인텍스가 초과됨: " + e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("예외의 최고 조상 내가 다 잡는다"); // 이건 catch중에 제일 마지막에 작성해야한다
			} finally {
				System.out.println("다시 실행하세요");
			}
		}
	}

}
