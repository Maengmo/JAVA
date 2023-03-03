package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q0022 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		
		System.out.print("남자 이름 : ");
		String boy = scan.next();
		
		System.out.print("여자 이름 : ");
		String girl = scan.next();
		
		System.out.print("만난날(년) : ");
		int year = scan.nextInt();
		
		System.out.print("만난날(월) : ");
		int month = scan.nextInt();
		
		System.out.print("만난날(일) : ");
		int day = scan.nextInt();
		
		now.set(year, month-1, day);
		
		System.out.printf("'%s'과(와) '%s'의 기념일\n",boy, girl);
		
		now.add(Calendar.DATE, 100);
		System.out.printf("100일 : %tF\n", now);
		
		now.add(Calendar.DATE, 100);
		System.out.printf("200일 : %tF\n", now);
		
		now.add(Calendar.DATE, 100);
		System.out.printf("300일 : %tF\n", now);
		
		now.add(Calendar.DATE, 200);
		System.out.printf("500일 : %tF\n", now);
		
		now.add(Calendar.DATE, 500);
		System.out.printf("1000일 : %tF\n", now);
		
	}

}
