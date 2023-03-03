package com.test.question;

import java.util.Calendar;

public class Q0019 {

	public static void main(String[] args) {
		
		nowTime();
	}//main
	public static void nowTime() {
		Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.printf("현재 시간 : %d시 %d분 %d초\n", hour, minute, second);
		
		String when = now.get(Calendar.AM_PM) == 0? "오전" : "오후";
		hour = now.get(Calendar.HOUR);
		minute = now.get(Calendar.MINUTE);
		second = now.get(Calendar.SECOND);
		
		System.out.printf("현재 시간 : %s %d시 %d분 %d초\n", when, hour, minute, second);
		
		
	}
}
