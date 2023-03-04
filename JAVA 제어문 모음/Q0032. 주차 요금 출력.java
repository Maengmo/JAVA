package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q0032 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Calendar in = Calendar.getInstance();
		Calendar out = Calendar.getInstance();
		
		long sum = 0;
		long fee = 0;
		
		System.out.println("[들어온 시간]");
		
		System.out.print("시 : ");
		int InHour = scan.nextInt();
		
		System.out.print("분 : ");
		int InMin = scan.nextInt();
		
		System.out.println("[나간 시간]");
		
		System.out.print("시 : ");
		int OutHour = scan.nextInt();
		
		System.out.print("분 : ");
		int OutMin = scan.nextInt();
		
		in.set(Calendar.HOUR_OF_DAY, InHour);
		in.set(Calendar.MINUTE, InMin);
		
		out.set(Calendar.HOUR_OF_DAY, OutHour);
		out.set(Calendar.MINUTE, OutMin);
		
		sum = out.getTimeInMillis() - in.getTimeInMillis();
		fee = (((sum/1000/60)-30)/10)*2000;
		
		if(fee>=2000) {
		System.out.printf("주차 요금은 %,d원입니다." , fee);
		} else {
		System.out.println("회차 차량 입니다.");
		}

	}

}
