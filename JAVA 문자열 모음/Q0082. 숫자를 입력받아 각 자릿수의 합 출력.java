package com.test.question;

import java.util.Scanner;

public class Q0082 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		String input = scan.nextLine();
		
		int sum = 0;
		String result = "";
		
		for(int i=0; i<input.length(); i++) {
			
			int a = input.charAt(i)-48;
			result += a + " + ";
			sum += a;
		}
		int index = result.lastIndexOf("+");
		result = result.substring(0,index);
		System.out.printf("결과 : %s = %d", result, sum);

	}

}
