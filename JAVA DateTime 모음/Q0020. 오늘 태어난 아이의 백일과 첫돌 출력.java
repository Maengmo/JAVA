package com.test.question;

import java.util.Calendar;

public class Q0020 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		Calendar born = Calendar.getInstance();
		
		born.set(2023, 1, 8); //2월 8일 탄생
		born.add(Calendar.DATE, 100); //100일 잔치
		System.out.printf("백일잔치 : %tF\n", born);
		
		born.set(2023, 1, 8);
		born.add(Calendar.YEAR, 1); //생일 잔치
		System.out.printf("백일잔치 : %tF\n", born);

	}

}
