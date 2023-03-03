package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q0024 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Calendar now = Calendar.getInstance();
		
		System.out.println("음식을 받기 원하는 시각");
		
		System.out.print("시 : ");
		int hour = scan.nextInt();
		
		System.out.print("분 : ");
		int min = scan.nextInt();
		
		now.set(Calendar.HOUR_OF_DAY, hour);
		now.set(Calendar.MINUTE, min);
	
		now.add(Calendar.MINUTE, -10);
		System.out.printf("짜장면 : %d시 %d분\n",
						now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
		now.add(Calendar.MINUTE, -8);
		System.out.printf("치킨 : %d시 %d분\n",
						now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
		now.add(Calendar.MINUTE, -7);
		System.out.printf("피자 : %d시 %d분\n",
						now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE));
		
		
		
		

	}

}
