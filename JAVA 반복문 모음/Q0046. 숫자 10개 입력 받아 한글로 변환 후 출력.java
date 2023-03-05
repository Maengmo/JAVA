package com.test.question;

import java.util.Scanner;

public class Q0046 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		String result = "";
		
		for(int i=0; i<9; i++) {
			
			System.out.print("숫자 : ");
			num = scan.nextInt();
			
			result += transe(num) + " ";
			
		}
		System.out.println(result);

	}//main 
	
	public static String transe(int i) {
		
		if (i == 1) {
			return "일";
		}else if (i == 2) {
			return "이";
		}else if (i == 3) {
			return "삼";
		}else if (i == 4) {
			return "사";
		}else if (i == 5) {
			return "오";
		}else if (i == 6) {
			return "육";
		}else if (i == 7) {
			return "칠";
		}else if (i == 8) {
			return "팔";
		}else if (i == 9) {
			return "구";
		}return "";
		
	}
}
