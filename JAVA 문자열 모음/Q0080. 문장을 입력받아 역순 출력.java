package com.test.question;

import java.util.Scanner;

public class Q0080 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문장 입력 : ");
		String input = scan.nextLine();
		String result = "";
		
		int index = -1;
		
		for(int i=input.length()-1; i>=0; i--) {
			
			result += input.charAt(i);
			
		}
		
		System.out.println("역순 결과 : " + "\"" + result + "\"");

	}

}
