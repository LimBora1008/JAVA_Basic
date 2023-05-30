package com.javalab.api.pkg08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		
		Date now = new Date();
		String strNow1 = now.toString(); //  영문으로 날짜가 나온다
		System.out.println(strNow1);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
	}

}
