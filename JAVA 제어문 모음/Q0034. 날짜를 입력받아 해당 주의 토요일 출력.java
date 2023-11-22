package com.test.question;

import java.util.Calendar;
import java.util.Scanner;
 
public class Q0034 {

	public static void main(String[] args) {
		// 요구사항 : 날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년 : ");
		int year = scan.nextInt();
		
		System.out.print("월 : ");
		int month = scan.nextInt();
		
		System.out.print("일 : ");
		int day = scan.nextInt();
		
		Calendar now = Calendar.getInstance();
		
		now.set(year, month-1, day);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		if(week==1 && week==7) {
			System.out.println("입력하신 날짜는 '휴일(토/일)'입니다.");
			System.out.println("결과가 없습니다.");
		} else {
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			now.add(Calendar.DATE, 7 - now.get(Calendar.DAY_OF_WEEK));
			System.out.printf("이동한 날짜는 '%tF' 입니다.\n", now);
		}

	}

}
