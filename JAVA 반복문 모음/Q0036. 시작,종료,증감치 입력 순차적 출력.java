package com.test.question;

import java.util.Scanner;

public class Q0036 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int StartNum = 0;
		int EndNum = 0;
		int num =0;
		
		System.out.print("시작 숫자 : ");
		StartNum = scan.nextInt();
		
		System.out.print("종료 숫자 : ");
		EndNum = scan.nextInt();
		
		System.out.print("증감치 : ");
		num = scan.nextInt();
		
		for(int i=StartNum; i<=EndNum; i+=num ) {
			System.out.println(i);
		}
		
		

	}

}
