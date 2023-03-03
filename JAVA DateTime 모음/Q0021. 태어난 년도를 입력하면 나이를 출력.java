package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q0021 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하세요 : ");
		int born = scan.nextInt();
		
		int nowYear = now.get(Calendar.YEAR);
		
		int age = nowYear - born+1;
		
		System.out.printf("당신의 나이는 : %d 세", age);

	}

}
