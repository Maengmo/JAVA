package com.test.question;

import java.util.Scanner;

public class Q0040 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		String oper = "";
		
		System.out.print("시작 숫자 : ");
		int StartNum = scan.nextInt();
		
		System.out.print("종료 숫자 : ");
		int EndNum = scan.nextInt();
		
		for(int i=StartNum; i<=EndNum; i++ ) {
			
			if(i<EndNum) {
				if(i%2 == 1) {
					sum += i;
					oper += i + " - ";
				}
				if(i%2 == 0) {
					sum -=i;
					oper += i + " + ";
				} 
			}else if(i==EndNum) {
				if(i%2 == 1) {
					oper += i;
					sum += i;
				}
				if(i%2 == 0) {
					oper += i;
					sum -=i;
				} 
			}
		}
		System.out.println(oper + " = " + sum );
	}

}
