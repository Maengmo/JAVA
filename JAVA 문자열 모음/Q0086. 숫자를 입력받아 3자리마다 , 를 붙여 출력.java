package com.test.question;

import java.util.Scanner;

public class Q0086 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String oper = "";
		String result = "";
		
		System.out.print("숫자 : ");
		String num = scan.nextLine();
		
		while(num.length()>3) {
			
			result = "," + num.substring(num.length()-3,num.length()) + result;
			num = num.substring(0, num.length()-3);
			
		}
		System.out.println("결과 : " + num + result);
		

	}

}
