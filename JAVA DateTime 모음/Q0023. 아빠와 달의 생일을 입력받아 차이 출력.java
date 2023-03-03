package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q0023 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Calendar Dad = Calendar.getInstance();
		Calendar Daughter = Calendar.getInstance();
		
		System.out.print("아빠 생일(년) : ");
		int Dad_Year = scan.nextInt();
		
		System.out.print("아빠 생일(월) : ");
		int Dad_Month = scan.nextInt();
		
		System.out.print("아빠 생일(일) : ");
		int Dad_day = scan.nextInt();
		
		System.out.print("딸 생일(년) : ");
		int Daughter_Year = scan.nextInt();
		
		System.out.print("딸 생일(월) : ");
		int Daughter_Month = scan.nextInt();
		
		System.out.print("딸 생일(일) : ");
		int Daughter_day = scan.nextInt();
		
		Dad.set(Dad_Year, Dad_Month-1, Dad_day);
		Daughter.set(Daughter_Year, Daughter_Month-1, Daughter_day);
		
		long DadTick = Dad.getTimeInMillis();
		long DaughterTick = Daughter.getTimeInMillis();
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.\n",
							(DaughterTick - DadTick)/1000/60/60/24);
		
		
		

	}

}
