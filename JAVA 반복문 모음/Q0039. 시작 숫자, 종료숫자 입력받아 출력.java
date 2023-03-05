package com.test.question;

import java.util.Scanner;

public class Q0039 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		String oper = "";
		
		System.out.print("시작 숫자 : ");
		int StartNum = scan.nextInt();
		
		System.out.print("종료 숫자 : ");
		int EndNum = scan.nextInt();
		
		for(int i=StartNum; i<=EndNum; i++) {

			sum += i;
			oper += i;
			
			if(i<EndNum) {
				oper += " + ";
			}
				
		}
		
		System.out.println(oper + " = " + sum);

	}

}
