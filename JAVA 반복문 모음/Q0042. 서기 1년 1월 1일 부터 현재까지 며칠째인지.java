package com.test.question;

import java.util.Calendar;

public class Q0042 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		String week = "";
		int sum = 0;
		int year = 0;
		int month = 0;
		int day = 0;
		
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH) + 1;
		day = now.get(Calendar.DATE);
		
		for(int i=1; i<year; i++) {
			if(searchMonth(year)) {
				sum += 366;
			} else {
				sum += 365;
			}
		}
		
		for(int i=1; i<month; i++) {
				sum += getDate(i,year);
			}
		
		sum += day;
		
		week = getWeek(sum);
		
		System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 %s입니다.", year, month, day, sum, week);

	}//main
	
	public static boolean searchMonth(int year) {
		if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) {
			return true;
		}else {
			return false;
		}
		
	} //searchMonth : 윤년 검사
	
	public static int getDate(int month, int year) {
		
		
		switch (month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			return 31;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			return 30;
		case 2 :
			return searchMonth(year) ? 29 : 28;
		}
		return 0;
	} //getDate : 달에 따른 일수
	
	public static String getWeek(int week) {
		
		if (week % 7 == 0) {
			return "일요일";
		}else if (week % 7 == 1) {
			return "월요일";
		}else if (week % 7 == 2) {
			return "화요일";
		}else if (week % 7 == 3) {
			return "수요일";
		}else if (week % 7 == 4) {
			return "목요일";
		}else if (week % 7 == 5) {
			return "금요일";
		}else if (week % 7 == 6) {
			return "토요일";
		}
		return "";
	}// getWeek() : 요일 변환기
}
